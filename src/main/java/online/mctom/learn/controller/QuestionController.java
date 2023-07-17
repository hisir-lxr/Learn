package online.mctom.learn.controller;

import online.mctom.learn.entity.Question;
import online.mctom.learn.entity.Result;
import online.mctom.learn.mapper.QuestionMapper;
import online.mctom.learn.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 6:14 PM
 * @description
 */
@Controller
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result add(Question question){
        Map<String, Object> map = questionService.add(question);
        if(map == null || map.isEmpty()){
            return Result.success(null);
        }
        String msg = "";
        Object err = map.get("Msg");
        if(err != null){
            msg += err;
        }
        return Result.failed(-1,msg);
    }

    @RequestMapping(path = "/ok", method = RequestMethod.POST)
    @ResponseBody
    public Result ok(Question question){
        Map<String,Object> map = questionService.ok(question);
        if(map == null || map.isEmpty()){
            return Result.success(null);
        }
        String msg = "";
        Object err = map.get("Msg");
        if(err != null){
            msg += err;
        }
        return Result.failed(-1,msg);
    }


}
