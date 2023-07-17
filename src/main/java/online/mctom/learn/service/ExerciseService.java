package online.mctom.learn.service;

import online.mctom.learn.entity.Exercise;
import online.mctom.learn.mapper.ExerciseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:35 PM
 * @description
 */
@Service
public class ExerciseService {
    @Autowired
    private ExerciseMapper exerciseMapper;
    public Map<String, Object> add(Exercise exercise) {
        Map<String,Object> map = new HashMap<>();
        if(exercise == null){
            map.put("Msg","参数不能为空");

        }
        exerciseMapper.insert(exercise);
    }
}
