package online.mctom.learn.mapper;

import online.mctom.learn.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author hisir
* @description 针对表【users(用户表)】的数据库操作Mapper
* @createDate 2023-06-29 12:20:16
* @Entity online.mctom.learn.entity.User
*/

@Mapper
public interface UserMapper {

    User selectByAccount(@Param("userAccount") String userAccount);

    void insertUser(User user);

    void updateUser(User user);

    void deleteByUserId(@Param("userId")int userId);

    List<User> selectAll();


    List<User> selectUsersByPage(@Param("offset") int offset, @Param("count") int count);

    void insertCourse(@Param("userId") int userId, @Param("courseId") int courseId, @Param("score") float score);
}




