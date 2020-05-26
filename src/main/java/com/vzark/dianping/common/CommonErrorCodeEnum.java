package com.vzark.dianping.common;

/**
 * 通用错误码
 * @author peng_
 */
public enum CommonErrorCodeEnum {

	// 错误码从10000开始
	NO_OBJECT_FOUND(10001,"请求对象不存在"),
	UNKNOW_ERROR(10002, "未知错误"),
	NO_HANDLER_FOUND(10003, "找不到执行的路径操作"),
	BIND_EXCEPTION_ERROR(10004, "请求参数错误"),

	;

	private Integer errorCode;
	private String errorMessage;

	CommonErrorCodeEnum(Integer errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
