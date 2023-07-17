package online.mctom.learn.service;

import io.micrometer.common.util.StringUtils;
import online.mctom.learn.entity.LearningRecord;
import online.mctom.learn.entity.LoginTicket;
import online.mctom.learn.entity.User;
import online.mctom.learn.mapper.LearningRecordMapper;
import online.mctom.learn.mapper.LoginTicketMapper;
import online.mctom.learn.mapper.UserMapper;
import online.mctom.learn.util.CommunityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author hisir
 * @version 1.0
 * @date 7/9/2023 5:48 AM
 * @description 用户服务接口
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private LoginTicketMapper loginTicketMapper;
    @Autowired
    private LearningRecordMapper learningRecordMapper;


    public Map<String, Object> register(User user) {
        Map<String, Object> map = new HashMap<>();

        // 空值处理
        if (user == null) {
            throw new IllegalArgumentException("参数不能为空!");
        }
        if (StringUtils.isBlank(user.getUserAccount())) {
            map.put("accountMsg", "账号不能为空!");
            return map;
        }
        if (StringUtils.isBlank(user.getUserPwd())) {
            map.put("passwordMsg", "密码不能为空!");
            return map;
        }

        User user1 = userMapper.selectByAccount(user.getUserAccount());

        if (user1 != null) {
            map.put("accountMsg","用户帐号已经存在");
            return map;
        }

        if (StringUtils.isBlank(user.getUserName())){
            user.setUserName("default");
        }
        if (StringUtils.isBlank(user.getUserGender())){
            user.setUserGender("男");
        }

        // 注册用户
        user.setSalt(CommunityUtil.generateUUID().substring(0, 5));
        user.setUserPwd(CommunityUtil.md5(user.getUserPwd() + user.getSalt()));
        user.setAdminFlag(0);
        user.setUserStatus(1);
        user.setCreateTime(new Date());
        userMapper.insertUser(user);
        return map;

    }

    public Map<String, Object> login(String userAccount, String password, int expiredSeconds) {
        Map<String, Object> map = new HashMap<>();

        // 空值处理
        if (StringUtils.isBlank(userAccount)) {
            map.put("accountMsg", "账号不能为空!");
            return map;
        }
        if (StringUtils.isBlank(password)) {
            map.put("passwordMsg", "密码不能为空!");
            return map;
        }

        // 验证账号
        User user = userMapper.selectByAccount(userAccount);
        if (user == null) {
            map.put("usernameMsg", "该账号不存在!");
            return map;
        }

        // 验证状态
        if (user.getUserStatus() == 0) {
            map.put("accountMsg", "该账号未激活!");
            return map;
        }

        // 验证密码
        password = CommunityUtil.md5(password + user.getSalt());
        if (!user.getUserPwd().equals(password)) {
            map.put("passwordMsg", "密码不正确!");
            return map;
        }

        // 生成登录凭证
        LoginTicket loginTicket = new LoginTicket();
        loginTicket.setUserId(user.getUserId());
        loginTicket.setTicket(CommunityUtil.generateUUID());
        loginTicket.setStatus(0);
        loginTicket.setExpired(new Date(System.currentTimeMillis() + expiredSeconds * 1000));
        loginTicketMapper.insertLoginTicket(loginTicket);

//        String redisKey = RedisKeyUtil.getTicketKey(loginTicket.getTicket());
//        redisTemplate.opsForValue().set(redisKey, loginTicket);

        map.put("ticket", loginTicket.getTicket());
        return map;
    }

    public Map<String, Object> change(User user) {
        User u = userMapper.selectByAccount(user.getUserAccount());
        Map<String,Object> map = new HashMap<String,Object>();
        if (u == null){
            map.put("accountMsg","用户不存在");
            return map;
        }
        userMapper.updateUser(user);
        return map;
    }

    public Map<String, Object> delete(User user) {
        User u = userMapper.selectByAccount(user.getUserAccount());
        Map<String,Object> map = new HashMap<>();
        if( u == null){
            map.put("accountMsg","用户不存在");
            return map;
        }
        userMapper.deleteByUserId(user.getUserId());
        return  map;
    }

    public List<User> getAllUsers() {
        return userMapper.selectAll();
    }

    public List<User> getUserByPage(int page, int count) {
        // 计算offset
        int offset = (page - 1) * count;

        // 调用mapper进行分页查询
        List<User> users = userMapper.selectUsersByPage(offset, count);

        return users;
    }

    public  Map<String,Object> selectCourse(String ticket, int courseId){
        Map<String,Object> map = new HashMap<>();
        LoginTicket loginTicket = loginTicketMapper.selectByTicket(ticket);
        if (loginTicket == null){
            map.put("Msg","凭证不存在");
            return map;
        }

        userMapper.insertCourse(loginTicket.getUserId(),courseId,0);
        return map;

    }

    public List<LearningRecord> getRecord(String ticket) {
        LoginTicket loginTicket = loginTicketMapper.selectByTicket(ticket);
        if (loginTicket == null){
            return null;
        }
        return learningRecordMapper.selectByUserId(loginTicket.getUserId());


    }
}
