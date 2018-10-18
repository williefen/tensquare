package entity;

import java.io.Serializable;

/**
 * @Author Willie Chen
 * @Description
 * @Date 2018/10/16
 * @Param $param
 **/
public class Result implements Serializable {

    private  Integer code;
    private  Boolean flag;
    private  String message;
    private  Object data;

    public Result() {
    }

    public Result( Boolean flag,Integer code, String message) {
        this.code = code;
        this.flag = flag;
        this.message = message;
    }

    public Result( Boolean flag,Integer code, String message, Object data) {
        this.code = code;
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
