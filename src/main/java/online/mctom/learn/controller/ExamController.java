package online.mctom.learn.controller;

import online.mctom.learn.entity.Exam;
import online.mctom.learn.entity.Result;
import online.mctom.learn.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:48 PM
 * @description
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    @Autowired
    private ExamService examService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result addExam(Exam exam){
        Map<String, Object> map = examService.add(exam);

        if(map == null || map.isEmpty()){
            return Result.success(null);
        } else {
            String msg = "";
            Object err = map.get("Msg");
            if(err != null){
                msg += err;
            }
            return  Result.failed(-1,msg);
        }
    }


}
