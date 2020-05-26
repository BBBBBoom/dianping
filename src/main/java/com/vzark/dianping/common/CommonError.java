package com.vzark.dianping.common;

/**
 * 通用错误处理
 * @author peng_
 */
public class CommonError {
	/**
	 * 错误码
	 */
	private Integer code;

	/**
	 * 错误描述
	 */
	private String errorMessage;


	public CommonError(Integer code, String errorMessage) {
		this.code = code;
		this.errorMessage = errorMessage;
	}

	public CommonError(CommonErrorCodeEnum errorCode) {
		this.code = errorCode.getErrorCode();
		this.errorMessage = errorCode.getErrorMessage();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
