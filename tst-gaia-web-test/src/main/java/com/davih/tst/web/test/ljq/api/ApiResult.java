package com.davih.tst.web.test.ljq.api;

import lombok.Data;
import org.slf4j.MDC;

import java.io.Serializable;
import java.util.Map;

/**
 * @Description: 接口请求返回结果
 * @Author: junqiang.lu
 * @Date: 2018/10/9
 */
@Data
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = -2953545018812382877L;

    /**
     * 返回码，200 正常
     */
    private int code = 200;

    /**
     * 返回信息
     */
    private String msg = "成功";

    /**
     * 返回数据
     */
    private T data;

    /**
     * 附加数据
     */
    private Map<String, Object> extraData;

    /**
     * 系统当前时间
     */
    private Long timestamp = System.currentTimeMillis();

    /**
     * 请求 ID
     */
    private String requestId = MDC.get("requestId");

    /**
     * 获取成功状态结果
     *
     * @return
     */
    public static ApiResult success() {
        return success(null, null);
    }

    /**
     * 获取成功状态结果
     *
     * @param data 返回数据
     * @return
     */
    public static ApiResult success(Object data) {
        return success(data, null);
    }

    /**
     * 获取成功状态结果
     *
     * @param data 返回数据
     * @param extraData 附加数据
     * @return
     */
    public static ApiResult success(Object data, Map<String, Object> extraData) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(ResponseCode.SUCCESS.getCode());
        apiResult.setMsg(ResponseCode.SUCCESS.getMsg());
        apiResult.setData(data);
        apiResult.setExtraData(extraData);
        return apiResult;
    }

    /**
     * 获取失败状态结果
     *
     * @return
     */
    public static ApiResult failure() {
        return failure(ResponseCode.FAIL.getCode(), ResponseCode.FAIL.getMsg(), null);
    }

    /**
     * 获取失败状态结果
     *
     * @param msg (自定义)失败消息
     * @return
     */
    public static ApiResult failure(String msg) {
        return failure(ResponseCode.FAIL.getCode(), msg, null);
    }

    /**
     * 获取失败状态结果
     *
     * @param responseCode 返回状态码
     * @return
     */
    public static ApiResult failure(ResponseCode responseCode) {
        return failure(responseCode.getCode(), responseCode.getMsg(), null);
    }

    /**
     * 获取失败状态结果
     *
     * @param responseCode 返回状态码
     * @param data         返回数据
     * @return
     */
    public static ApiResult failure(ResponseCode responseCode, Object data) {
        return failure(responseCode.getCode(), responseCode.getMsg(), data);
    }

    /**
     * 获取失败返回结果
     *
     * @param code 错误码
     * @param msg  错误信息
     * @param data 返回结果
     * @return
     */
    public static ApiResult failure(int code, String msg, Object data) {
        ApiResult result = new ApiResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


}
