package com.szc.common.lang;/**
 * @author T-Rex
 * @date 2021/11/21 - 23:35
 */

/**
 * @program:myblog
 *@description:用于异步统一防护结果的封装
 *@author:31933
 @date:2021-11-21 23:35:52
 */
import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int code; // 200是正常，非200表示异常
    private String msg;// 结果消息
    private Object data;// 结果数据

    //注册成功
    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    //注册失败
    public static Result fail(String msg) {
        return fail(400, msg, null);
    }

    public static Result fail(String msg, Object data) {
        return fail(400, msg, data);
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

}
