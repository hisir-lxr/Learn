package online.mctom.learn.service;

import online.mctom.learn.entity.Exam;
import online.mctom.learn.mapper.ExamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 5:48 PM
 * @description
 */
@Service
public class ExamService {
    @Autowired
    private ExamMapper examMapper;


    public Map<String, Object> add(Exam exam) {
        Map<String,Object> map = new HashMap<>();
        if (exam == null){
            map.put("Msg","参数不能为空");
            return map;
        }

        examMapper.insert(exam);

    }
}
