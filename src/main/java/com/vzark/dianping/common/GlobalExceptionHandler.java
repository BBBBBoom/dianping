package com.vzark.dianping.common;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 统一异常处理切面
 * @author peng_
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public CommonResult doError(HttpServletRequest request, HttpServletResponse response, Exception exception) {
		if (exception instanceof BusinessException) {
			return CommonResult.create(CommonConstant.FAIL, ((BusinessException) exception).getCommonError());
		}
		else if (exception instanceof NoHandlerFoundException) {
			CommonError commonError = new CommonError(CommonErrorCodeEnum.NO_HANDLER_FOUND);
			return CommonResult.create(CommonConstant.FAIL, commonError);
		}
		else if (exception instanceof ServletRequestBindingException) {
			CommonError commonError = new CommonError(CommonErrorCodeEnum.BIND_EXCEPTION_ERROR);
			return CommonResult.create(CommonConstant.FAIL, commonError);
		}
		else {
			CommonError commonError = new CommonError(CommonErrorCodeEnum.UNKNOW_ERROR);
			return CommonResult.create(CommonConstant.FAIL, commonError);
		}
	}
}
