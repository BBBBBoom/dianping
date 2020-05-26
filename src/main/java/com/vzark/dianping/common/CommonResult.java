package com.vzark.dianping.common;

/**
 * 通用返回消息
 * @author peng_
 */
public class CommonResult {

	/**
	 * 返回消息  可以有两种结果  要么为success 要么为 fail
	 */
	private String message;

	/**
	 * 返回对象  若message=success时，表明对应的返回json类数据
	 *         若message=fail时，data内将使用通用的错误码格式
	 */
	private Object object;

	/**
	 * 定义一个通用的创建返回对象的方法
	 */

	public static CommonResult create(Object result) {
		return CommonResult.create(CommonConstant.SUCCESS, result);
	}

	public static CommonResult create(String message, Object result) {
		CommonResult commonResult = new CommonResult();
		commonResult.setMessage(message);
		commonResult.setObject(result);
		return commonResult;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
