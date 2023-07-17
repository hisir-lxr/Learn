package online.mctom.learn.mapper;

import online.mctom.learn.entity.Section;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author hisir
* @description 针对表【sections(小节表)】的数据库操作Mapper
* @createDate 2023-06-29 12:20:51
* @Entity online.mctom.learn.entity.Section
*/
@Mapper
public interface SectionMapper {

    List<Section> selectAll();
}




