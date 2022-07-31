package com.hetongxue.common.handler;

import com.hetongxue.common.response.ResponseCode;
import com.hetongxue.common.response.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: 全局异常捕获
 * @ClassNmae: GlobalExceptionHandler
 * @Author: 何同学
 * @DateTime: 2022-07-31 17:22
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;

    /**
     * 未知异常
     */
    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        e.printStackTrace();
        log.error(e.getMessage());
        response.setStatus(ResponseCode.INSUFFICIENT_STORAGE.getCode());
        return Result.Error()
                .setMessage(ResponseCode.INTERNAL_SERVER_ERROR.getMessage())
                .setCode(ResponseCode.INTERNAL_SERVER_ERROR.getCode());
    }

    /**
     * 运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    public Result runtimeException(RuntimeException e) {
        e.printStackTrace();
        log.error(e.getMessage());
        response.setStatus(ResponseCode.INSUFFICIENT_STORAGE.getCode());
        return Result.Error()
                .setMessage(ResponseCode.INTERNAL_SERVER_ERROR.getMessage())
                .setCode(ResponseCode.INTERNAL_SERVER_ERROR.getCode());
    }

    /**
     * 空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    public Result nullPointerException(NullPointerException e) {
        e.printStackTrace();
        log.error(ResponseCode.NULL_POINTER.getMessage());
        return Result.Error()
                .setMessage(ResponseCode.NULL_POINTER.getMessage())
                .setCode(ResponseCode.NULL_POINTER.getCode());
    }

}