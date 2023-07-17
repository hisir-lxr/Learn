package online.mctom.learn.entity;

import org.springframework.stereotype.Component;

/**
 * @author king
 * @date 2023/5/24 15:24
 * @desc Ajax 数据相应规范
 * <p>
 * 规范定义 Ajax 网络请求的响应结构：
 * 状态码：code
 * 描述信息：message
 * 返回值：datas
 * <p>
 * -> JSON
 * <p>
 * {
 * "code": 200,
 * "message": "登录成功",
 * "datas": "Manager/List<Classes>"
 * }
 * <p>
 * -> Result:code、message、datas
 */
@Component
public class Result {

    //200：业务 OK，和浏览器的响应状态码 200 不同
    private int code = 200;
    private String message;
    private Object datas;

    public Result() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDatas() {
        return datas;
    }

    public void setDatas(Object datas) {
        this.datas = datas;
    }

    public static Result success(Object datas) {
        Result result = new Result();
        if (datas != null) {
            result.setDatas(datas);
        }
        return result;
    }

    public static Result failed(int code, String message) {
        Result result = new Result();
        result.setCode(code);
        if (message != null) {
            result.setMessage(message);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", message='" + message + '\'' + ", datas=" + datas + '}';
    }
}
