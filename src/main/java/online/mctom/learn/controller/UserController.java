package online.mctom.learn.controller;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import online.mctom.learn.entity.LearningRecord;
import online.mctom.learn.entity.Result;
import online.mctom.learn.entity.User;
import online.mctom.learn.service.UserService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/9/2023 5:49 AM
 * @description
 */

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Value("${server.servlet.context-path}")
    private String contextPath;

    @RequestMapping(path = "/register", method = RequestMethod.GET)
    public String getRegisterPage() {
        return "/site/register";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String getLoginPage() {
        return "/site/login";
    }

    @RequestMapping(path = "/settings", method = RequestMethod.GET)
    public String getSettingPage(){
        return "/site/settings";
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(Model model, User user) {
        Map<String, Object> map = userService.register(user);
        if (map == null || map.isEmpty()) {
            return Result.success(null);
        } else {
            Object accountMsg = map.get("accountMsg");
            Object passwordMsg = map.get("passwordMsg");
            String msg = "";
            if (accountMsg != null){
                msg += accountMsg;
            }
            if (passwordMsg != null){
                msg += passwordMsg;
            }
            return Result.failed(-1,msg);
        }
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Result login(String username, String password, HttpServletResponse response
                        ) {

        // 检查账号,密码
        int expiredSeconds = 60 ;
        Map<String, Object> map = userService.login(username, password, expiredSeconds);
        if (map.containsKey("ticket")) {
            Cookie cookie = new Cookie("ticket", map.get("ticket").toString());
            cookie.setPath(contextPath);
            cookie.setMaxAge(expiredSeconds);
            response.addCookie(cookie);
            return Result.success(null);
        } else {
            Object accountMsg = map.get("accountMsg");
            Object passwordMsg = map.get("passwordMsg");
            String msg = "";
            if (accountMsg != null){
                msg += accountMsg;
            }
            if (passwordMsg != null){
                msg += passwordMsg;
            }
            return Result.failed(-1,msg);
        }

    }


    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result addUser(Model model, User user){
        Map<String, Object> map = userService.register(user);
        if (map == null || map.isEmpty()) {
            return Result.success(null);
        } else {
            Object accountMsg = map.get("accountMsg");
            Object passwordMsg = map.get("passwordMsg");
            String msg = "";
            if (accountMsg != null){
                msg += accountMsg;
            }
            if (passwordMsg != null){
                msg += passwordMsg;
            }
            return Result.failed(-1,msg);
        }
    }

    @RequestMapping(path = "/change", method = RequestMethod.POST)
    @ResponseBody
    public Result changeUser(Model model, User user){
        Map<String, Object> map = userService.change(user);

        if (map == null || map.isEmpty()) {
            return Result.success(null);
        } else {
            Object accountMsg = map.get("accountMsg");
            Object passwordMsg = map.get("passwordMsg");
            String msg = "";
            if (accountMsg != null){
                msg += accountMsg;
            }
            if (passwordMsg != null){
                msg += passwordMsg;
            }
            return Result.failed(-1,msg);
        }
    }
    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result deleteUser(Model model, User user){
        Map<String, Object> map = userService.delete(user);
        if (map == null || map.isEmpty()){
            return Result.success(null);
        } else {
            Object accountMsg = map.get("accountMsg");
            Object passwordMsg = map.get("passwordMsg");
            String msg = "";
            if (accountMsg != null){
                msg += accountMsg;
            }
            if (passwordMsg != null){
                msg += passwordMsg;
            }
            return Result.failed(-1,msg);
        }
    }

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public Result getAllUsers(){
        List<User> users = userService.getAllUsers();
        return Result.success(users);
    }

    @RequestMapping(path = "/getUserByPage/{page}/{count}", method = RequestMethod.GET)
    @ResponseBody
    public Result getUserByPage(@PathVariable("page") int page, @PathVariable("count") int count){
        List<User> users = userService.getUserByPage(page, count);
        return Result.success(users);
    }


    @RequestMapping(path = "/record", method = RequestMethod.GET)
    @ResponseBody
    public Result getRecord(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String ticket = null;
        for(Cookie cookie : cookies){
            if ("ticket".equals(cookie.getName())) {
                ticket = cookie.getValue();
            }
        }
        List<LearningRecord> list = userService.getRecord(ticket);
        return Result.success(list);
    }

}
