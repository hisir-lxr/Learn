package online.mctom.learn.service;

import online.mctom.learn.entity.Question;
import online.mctom.learn.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 6:18 PM
 * @description
 */
@Service
public class QuestionService {
    @Autowired
    private QuestionMapper questionMapper;


    public Map<String, Object> add(Question question) {
        Map<String,Object> map = new HashMap<>();
        if(question == null){
            map.put("Msg","参数不能为空");
        }
        questionMapper.insert(question);

        return map;

    }

    public Map<String, Object> ok(Question question) {
        Map<String,Object> map = new HashMap<>();
        if(question == null){
            map.put("Msg","参数不能为空");
        }
        questionMapper.update(question);
        return map;
    }
}
