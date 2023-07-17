package online.mctom.learn.mapper;

import online.mctom.learn.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author hisir
* @description 针对表【courses(课程表)】的数据库操作Mapper
* @createDate 2023-06-29 11:44:34
* @Entity online.mctom.learn.entity.CourseController
*/
@Mapper
public interface CourseMapper {



    List<Course> selectAll();

    List<Course> selectByType(@Param("courseType") String type);

    void insert(Course course);
}




