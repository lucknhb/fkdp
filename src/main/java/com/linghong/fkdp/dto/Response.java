package com.linghong.fkdp.dto;



import java.io.Serializable;

/**
 * 用来返回验证结果
 *
 * @author luck_nhb
 */
public class Response implements Serializable {
    private Boolean success;     //是否请求成功
    private Integer code;        //状态码
    private Object data;       //数据
    private String msg;          //提示信息

    public Response() {
    }

    public Response(Boolean success, Integer code, Object data, String msg) {
        this.success = success;
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public void set(Boolean success, Integer code, Object data, String msg) {
        this.success = success;
        this.code = code;
        this.data = data;
        this.msg = msg;
    }


    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
