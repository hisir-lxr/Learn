package online.mctom.learn.service;

import online.mctom.learn.entity.Resource;
import online.mctom.learn.mapper.ResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/13/2023 6:14 PM
 * @description
 */
@Service
public class ResourceService {
   @Autowired
   private ResourceMapper resourceMapper;


   public List<Resource> getByPage(int page, int count) {
      // 计算offset
      int offset = (page - 1) * count;

      List<Resource> result = resourceMapper.selectByPage(offset, count);

      return result;
   }


   public Map<String, Object> addResource(Resource resource) {
      Map<String, Object> map = new HashMap<String, Object>();
      if (resource == null) {
         map.put("Msg","参数不能为空");
         return map;
      }

      resourceMapper.addResource(resource);
      return map;


   }
}
