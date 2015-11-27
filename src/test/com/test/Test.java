package com.test;

import org.apache.commons.lang.StringUtils;

import common.toolkit.java.entity.HostPerformanceEntity;
import common.toolkit.java.exception.SSHException;
import common.toolkit.java.util.io.SSHUtil;

public class Test {

	@org.junit.Test
	public void test11() throws SSHException {
		HostPerformanceEntity hostPerformanceEntity = SSHUtil.getHostPerformance("10.70.181.5", "proddev", "proddev");
	}

	@org.junit.Test
	public void test111() throws SSHException {
		Double.parseDouble("64425");
		String totalMem = "64425M";
		System.out.println(StringUtils.substring(totalMem, 0, totalMem.length() - 1));

	}
}
