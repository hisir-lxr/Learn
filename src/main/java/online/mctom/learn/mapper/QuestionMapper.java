package online.mctom.learn.mapper;

import online.mctom.learn.entity.Question;
import org.apache.ibatis.annotations.Mapper;

/**
* @author hisir
* @description 针对表【questions(问题表)】的数据库操作Mapper
* @createDate 2023-06-29 12:23:26
* @Entity online.mctom.learn.entity.Question
*/
@Mapper
public interface QuestionMapper {

    void insert(Question question);

    void update(Question question);
}




