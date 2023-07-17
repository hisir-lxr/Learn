package online.mctom.learn.service;

import online.mctom.learn.entity.Section;
import online.mctom.learn.mapper.SectionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 4:57 AM
 * @description
 */
@Service
public class SectionService {
   @Autowired
   private SectionMapper sectionMapper;


   public List<Section> getAll() {
      return sectionMapper.selectAll();
   }
}
