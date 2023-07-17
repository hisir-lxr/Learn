package online.mctom.learn.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import online.mctom.learn.entity.Course;
import online.mctom.learn.entity.LoginTicket;
import online.mctom.learn.entity.Result;
import online.mctom.learn.service.CourseService;
import online.mctom.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:03 PM
 * @description
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Result getAll(){
        List<Course> list = courseService.getAll();
        return Result.success(list);
    }

    @RequestMapping(path = "/category/{category}", method = RequestMethod.GET)
    @ResponseBody
    public Result getByCategory(@PathVariable("category") String category){
        List<Course> list = courseService.getByType(category);
        return Result.success(list);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result add( Course course){
        Map<String,Object> map = courseService.add(course);
        if(map == null || map.isEmpty()){
            return Result.success(null);
        } else {
            Object courseMsg = map.get("Msg");
            String msg = "";
            if (courseMsg != null) {
                msg += courseMsg;
            }
            return Result.failed(-1,msg);
        }
    }

    @RequestMapping(path = "/select/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Result select(@PathVariable("id") int id, HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        String ticket = null;
        Map<String,Object> map;
        for(Cookie cookie : cookies){
            if ("ticket".equals(cookie.getName())) {
                ticket = cookie.getValue();
            }
        }
        if (ticket != null){
            map = userService.selectCourse(ticket,id);
            if (map == null || map.isEmpty()){
                return Result.success(null);
            }
            String msg = "";
            Object err = map.get("Msg");
            if (err != null){
                msg += err;
            }
            return Result.failed(-1, msg);
        }else {
            return Result.failed(-1,"凭证不存在");
        }


    }
}
