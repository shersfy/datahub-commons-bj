package com.gouuse.datahub.commons.protocols;

import com.gouuse.datahub.commons.beans.BaseBean;

public class BaseProtocol extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	public static final String INDEX_ID = "id";
	public static final String INDEX_TIMESTAMP = "timestamp";
	
	private String id;
	
	/**
	 * 租户id
	 */
	private Long tenantId;
	
	/**
	 * 租户名称
	 */
	private String tenantName;
	
	private long timestamp;
	
	private String className;
	
	public BaseProtocol() {
		super();
		this.timestamp = System.currentTimeMillis();
		this.className = getClass().getName();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTenantId() {
		return tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
