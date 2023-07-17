package online.mctom.learn.service;

import online.mctom.learn.entity.Course;
import online.mctom.learn.entity.Result;
import online.mctom.learn.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:04 PM
 * @description
 */
@Service
public class CourseService {
   @Autowired
   private CourseMapper courseMapper;


   public List<Course> getAll() {
      return courseMapper.selectAll();

   }

   public List<Course> getByType(String category) {

      return courseMapper.selectByType(category);
   }

   public Map<String, Object> add(Course course) {
      Map<String,Object> map = new HashMap<>();
      if(course == null){
         map.put("Msg","参数不能为空");
         return map;
      }

      courseMapper.insert(course);

      return map;

   }
}

