package online.mctom.learn.mapper;

import online.mctom.learn.entity.LearningRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author hisir
* @description 针对表【learning_records(学习记录表)】的数据库操作Mapper
* @createDate 2023-06-29 12:23:48
* @Entity online.mctom.learn.entity.LearningRecord
*/
@Mapper
public interface LearningRecordMapper {

    List<LearningRecord> selectByUserId(@Param("userId") Integer userId);
}




