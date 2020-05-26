package com.vzark.dianping.common;

/**
 * 通用业务异常处理
 * @author peng_
 */
public class BusinessException extends Exception{

	private CommonError commonError;

	public BusinessException(CommonErrorCodeEnum errorCodeEnum) {
		super();
		this.commonError = new CommonError(errorCodeEnum);
	}

	public CommonError getCommonError() {
		return commonError;
	}

	public void setCommonError(CommonError commonError) {
		this.commonError = commonError;
	}
}
