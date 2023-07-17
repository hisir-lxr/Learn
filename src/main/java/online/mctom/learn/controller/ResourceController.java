package online.mctom.learn.controller;

import online.mctom.learn.entity.Resource;
import online.mctom.learn.entity.Result;
import online.mctom.learn.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author hisir
 * @version 1.0
 * @date 7/13/2023 6:11 PM
 * @description
 */
@Controller
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Result getResource() {

        return Result.success(null);
    }

    @RequestMapping(value = "/getByPage/{page}/{count}", method =RequestMethod.GET)
    @ResponseBody
    public Result getResourceByPage(@PathVariable("page") int page, @PathVariable("count") int count){
        List<Resource> resources = resourceService.getByPage(page, count);
        return Result.success(resources);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result addResource(Resource resource, MultipartFile file) throws IOException {

        // 1. 接收表单提交的数据
        // resource 对象中包含了资源的各字段数据

        // 2. 接收上传的文件
        String fileName = file.getOriginalFilename();
        if(fileName == null || "".equals(fileName)){
            return Result.failed(-1,"错误的文件");
        }

        // 3. 文件处理 - 保存文件到服务器
        String uploadPath = "/uploads/";
        File newFile = new File(uploadPath, fileName);
        file.transferTo(newFile);

        // 4. 设置资源的URL
        String fileUrl = "/uploads/" + fileName;
        resource.setResourceUrl(fileUrl);

        // 5. 调用Service处理
        Map<String,Object> result = resourceService.addResource(resource);

        // 6. 返回结果
        if(result == null || result.isEmpty()) {
            return Result.failed(-1, (String)result.get("Msg"));
        }

        return Result.success(null);

    }

}
