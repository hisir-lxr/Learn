package online.mctom.learn.mapper;

import online.mctom.learn.entity.Exam;
import org.apache.ibatis.annotations.Mapper;

/**
* @author hisir
* @description 针对表【exams(单独考试表)】的数据库操作Mapper
* @createDate 2023-06-29 12:24:12
* @Entity online.mctom.learn.entity.Exam
*/
@Mapper
public interface ExamMapper {

    void insert(Exam exam);
}




