package com.criminal.gulimall.product.exception;

import com.criminal.common.exception.BizCodeEnum;
import com.criminal.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;


/**
 * 统一异常处理
 */
@Slf4j
@ResponseBody
@RestControllerAdvice(basePackages = "com.criminal.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidateException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题{},异常类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<Object, Object> errMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((item) -> {
            errMap.put(item.getField(), item.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VALIDATE_EXCEPTION.getCode(), BizCodeEnum.VALIDATE_EXCEPTION.getMsg()).put("data", errMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
    }
}
