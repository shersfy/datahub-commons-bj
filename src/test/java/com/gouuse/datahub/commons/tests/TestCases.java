package com.gouuse.datahub.commons.tests;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gouuse.datahub.commons.connector.db.DbConnectorInterface;
import com.gouuse.datahub.commons.constant.Const;
import com.gouuse.datahub.commons.meta.DBMeta;
import com.gouuse.datahub.commons.meta.TableMeta;
import com.gouuse.datahub.commons.meta.TableType;
import com.gouuse.datahub.commons.protocols.LoginLog;
import com.gouuse.datahub.commons.utils.AesUtil;
import com.gouuse.datahub.commons.utils.CamelCaseUtils;
import com.gouuse.datahub.commons.utils.DateUtil;
import com.gouuse.datahub.commons.utils.HttpUtil;
import com.gouuse.datahub.commons.utils.HttpUtil.HttpResult;

public class TestCases {
    
    @Test
    public void test01() throws Exception {
    	String url  = "jdbc:mysql://10.12.51.107:3306/datahub_repository?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
		DBMeta meta = DbConnectorInterface.getMetaByUrl(url);
		meta.setCode("MySQL");
		meta.setUserName("qhuser");
		meta.setPassword(AesUtil.encryptHexStr("bo28$s1d3a", AesUtil.AES_SEED));
		DbConnectorInterface conntecor = DbConnectorInterface.getInstance(meta);
		Connection conn = conntecor.getConnection();
		TableType[] types = new TableType[] {TableType.TABLE};
		List<TableMeta> list = conntecor.getTables("datahub_repository", "datahub_repository", types, conn);
		System.out.println(list.size());
		conn.close();
		System.out.println(meta.toString());
    }
    @Test
    public void test02() throws Exception {
    	Date date = DateUtil.getDateByStr("2018-10-09T05:36:47.000+0000", "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    	System.out.println(DateUtil.format(date, Const.FORMAT_TIMESTAMP));
    }

    @Test
    public void test03() {
    	System.out.println(CamelCaseUtils.toUnderlineString("ISOCertifiedStaff"));
		System.out.println(CamelCaseUtils.toUnderlineString("CertifiedStaff"));
		System.out.println(CamelCaseUtils.toUnderlineString("UserID"));
		System.out.println(CamelCaseUtils.toCamelCaseString("iso_certified_staff", false));
		System.out.println(CamelCaseUtils.toCamelCaseString("certified_staff", false));
		System.out.println(CamelCaseUtils.toCamelCaseString("user_id", false));
		System.out.println(CamelCaseUtils.toCamelCaseString("user_id", true));
    }
    
    @Test
    public void test04() {
    	LoginLog log = new LoginLog(1L, "edpadmin", 1L, "nanhai", "127.0.0.1", "localhost", 1L, "zh_CN", "/login");
    	System.out.println(log.toString());
    }
    
    @Test
    public void test05() {
    	String params = "{\"arg\":[{\"1\":[\"{\\\"businessparams\\\":{\\\"address\\\":\\\"\\\","
    			+ "\\\"corporganizationiid\\\":\\\"\\\",\\\"description\\\":\\\"\\\","
    			+ "\\\"domainname\\\":\\\"gouuse.cn\\\",\\\"orgname\\\":\\\"闫璐闫\\\",\\\"parentorganizationiid\\\":\\\"668\\\"}},\\\"controlparams\\\":{\\\"eventName\\\":\\\"addOrg\\\",\\\"fromSystemFlag\\\":\\\"\\\",\\\"messageID\\\":\\\"null\\\"}}\"]}],\"service\":[\"corpCommonRestService\"],\"method\":[\"execute\"]}";
    	JSONObject json = JSON.parseObject(params);
    	
    	String url = "http://119.10.8.175:8281/cic-manage/rest/controller";
		HttpResult res = HttpUtil.postJson(url, json.toJSONString(), null);
    	System.out.println(res);
    }
    
    @Test
    public void test06() {
    	String url = "http://119.10.8.175:8281/cic-manage/rest/dispathController/MAIL/dmss/gouuse.cn/list1/batchAddUsers";
    	String params = "{\"mailAddresses\":[\"lijinhe@gouuse.cn\"]}";
    	HttpResult res = HttpUtil.postJson(url, params, null);
    	System.out.println(res);
    }
    
    @Test
    public void test07() {
    	System.out.println(boolean.class.isAssignableFrom(Boolean.class));
    }
    
    @Test
    public void test08() {
    	String webappServer = "http://devwxweb.app.gouuse.cn";
		HttpResult res = HttpUtil.send(webappServer, "options", null, null);
		System.out.println(res);
    	
    }

}
