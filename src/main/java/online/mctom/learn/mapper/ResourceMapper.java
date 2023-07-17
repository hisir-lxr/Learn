package online.mctom.learn.mapper;

import online.mctom.learn.entity.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author hisir
* @description 针对表【resources(知识资源库表)】的数据库操作Mapper
* @createDate 2023-06-29 12:21:18
* @Entity online.mctom.learn.entity.Resource
*/
@Mapper
public interface ResourceMapper {

    List<Resource> selectByPage(@Param("offset") int offset, @Param("count") int count);

    void addResource(Resource resource);
}




