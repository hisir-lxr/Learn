package online.mctom.learn.controller;

import online.mctom.learn.entity.Result;
import online.mctom.learn.entity.Section;
import online.mctom.learn.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author hisir
 * @version 1.0
 * @date 7/16/2023 4:55 AM
 * @description
 */
@Controller
@RequestMapping("/section")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result addSection(Section section){
        return Result.success(null);
    }

    @RequestMapping(path = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public Result delete(Section section){
        return Result.success(null);
    }

    @RequestMapping(path = "/change", method = RequestMethod.POST)
    @ResponseBody
    public Result change(Section section){
        return Result.success(null);
    }

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public Result getAll(){
        List<Section> list = sectionService.getAll();
        return Result.success(list);
    }
}
