package com.wofang.shiroboot.common.exception;

import com.wofang.shiroboot.common.util.ResponseModel;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常类处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler
    @ResponseBody
    public ResponseModel AuthorizationExceptionHandler(AuthorizationException e) {
        return ResponseModel.success("没有通过权限验证！",null);
    }
}
