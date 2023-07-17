package online.mctom.learn.controller;

import online.mctom.learn.entity.Exercise;
import online.mctom.learn.entity.Result;
import online.mctom.learn.service.ExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:34 PM
 * @description
 */
@Controller
@RequestMapping("/exercise")
public class ExerciseController {
    @Autowired
    private ExerciseService exerciseService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result add(Exercise exercise){
        Map<String,Object> map = exerciseService.add(exercise);
        if( map == null || map.isEmpty()){
            return Result.success(null);
        }else {
            String msg = "";
            Object err = map.get("Msg");
            if (err != null){
                msg += err;
            }
            return Result.failed(-1,msg);
        }
    }



}
