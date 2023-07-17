package online.mctom.learn.mapper;

import online.mctom.learn.entity.Exercise;
import org.apache.ibatis.annotations.Mapper;

/**
* @author hisir
* @description 针对表【exercises(习题资源表)】的数据库操作Mapper
* @createDate 2023-06-29 12:24:01
* @Entity online.mctom.learn.entity.Exercise
*/
@Mapper
public interface ExerciseMapper {

    void insert(Exercise exercise);
}




