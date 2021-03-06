package com.gouuse.datahub.commons.protocols;

/***
 * datahub-zuul网关路由日志
 * @author pengy
 * @date 2018年12月3日
 */
public class RouteLog extends BaseProtocol{

	private static final long serialVersionUID = 1L;
	
	private String uuid;
	
	/**是否过滤非法请求**/
	private boolean filter;
	
	private boolean update;
	
	private String requestIp;
	
	private String requestUrl;
	
	private String requestContentType;

	private String requestData = "{}";

	private String requestTime;

	private String responseUrl = "";

	private String responseData = "{}";

	private String responseTime;
	
	private long cons;
	
	/**调用服务Url**/
	private String targetUrls;
	/**调用服务返回结果**/
	private String targetResData = "{}";
	/**调用服务请求和响应时间**/
	private String targetReqTimeAndResTime;
	/** 提示说明 **/
	private String msg;
	
	public RouteLog() {
		super();
	}
	
	public RouteLog(String uuid, String requestIp, String requestUrl, String requestContentType) {
		super();
		this.uuid = uuid;
		this.requestIp = requestIp;
		this.requestUrl = requestUrl;
		this.requestContentType = requestContentType;
	}

	public void setRequestData(String requestData) {
		this.requestData = requestData;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public long getCons() {
		return cons;
	}

	public void setCons(long cons) {
		this.cons = cons;
	}


	public String getRequestIp() {
		return requestIp;
	}

	public void setRequestIp(String requestIp) {
		this.requestIp = requestIp;
	}

	public String getRequestData() {
		return requestData;
	}

	public String getResponseUrl() {
		return responseUrl;
	}

	public void setResponseUrl(String responseUrl) {
		this.responseUrl = responseUrl;
	}

	public String getTargetUrls() {
		return targetUrls;
	}

	public void setTargetUrls(String targetUrls) {
		this.targetUrls = targetUrls;
	}

	public String getTargetResData() {
		return targetResData;
	}

	public void setTargetResData(String targetResData) {
		this.targetResData = targetResData;
	}

	public String getRequestUrl() {
		return requestUrl;
	}

	public void setRequestUrl(String requestUrl) {
		this.requestUrl = requestUrl;
	}

	public String getTargetReqTimeAndResTime() {
		return targetReqTimeAndResTime;
	}

	public void setTargetReqTimeAndResTime(String targetReqTimeAndResTime) {
		this.targetReqTimeAndResTime = targetReqTimeAndResTime;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public boolean isFilter() {
		return filter;
	}

	public void setFilter(boolean filter) {
		this.filter = filter;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRequestContentType() {
		return requestContentType;
	}

	public void setRequestContentType(String requestContentType) {
		this.requestContentType = requestContentType;
	}

	public boolean isUpdate() {
		return update;
	}

	public void setUpdate(boolean update) {
		this.update = update;
	}

	public String getConsSeconds() {
		if (cons==0) {
			return "0";
		}
		return String.format("%.3f", cons/1000.0f);
	}

}
