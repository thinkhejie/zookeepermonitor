package com.taobao.taokeeper.model;

/**
 * Description:	Model: 报警设置
 * @author   yinshi.nc
 * @Date	 2011-10-26
 */
public class AlarmSettings {

	private int clusterId;
	private String wangwangList;
	private String phoneList;
	private String emailList;
	private String maxDelayOfCheck;
	private String maxCpuUsage;
	private String maxMemoryUsage;
	private String maxLoad;
	private String maxConnectionPerIp;
	private String maxWatchPerIp;

	private String dataDir;
	private String dataLogDir;
	private String maxDiskUsage; //设置的目录的最大使用率，如果超过这个阈值，会报警。

	public AlarmSettings() {
	}

	public AlarmSettings(int clusterId, String maxDelayOfCheck, String maxCpuUsage, String maxMemoryUsage, String maxLoad, String wangwangList, String phoneList, String emailList, String maxConnectionPerIp, String maxWatchPerIp, String dataDir,
			String dataLogDir, String maxDiskUsage) {
		this.clusterId = clusterId;
		this.maxDelayOfCheck = maxDelayOfCheck;
		this.maxCpuUsage = maxCpuUsage;
		this.maxMemoryUsage = maxMemoryUsage;
		this.maxLoad = maxLoad;
		this.wangwangList = wangwangList;
		this.phoneList = phoneList;
		this.emailList = emailList;
		this.maxConnectionPerIp = maxConnectionPerIp;
		this.maxWatchPerIp = maxWatchPerIp;
		this.dataDir = dataDir;
		this.dataLogDir = dataLogDir;
		this.setMaxDiskUsage(maxDiskUsage);
	}

	public int getClusterId() {
		return clusterId;
	}

	public void setClusterId(int clusterId) {
		this.clusterId = clusterId;
	}

	public String getMaxDelayOfCheck() {
		return maxDelayOfCheck;
	}

	public void setMaxDelayOfCheck(String maxDelayOfCheck) {
		this.maxDelayOfCheck = maxDelayOfCheck;
	}

	/**这里将返回30，即表达 30%*/
	public String getMaxCpuUsage() {
		return maxCpuUsage;
	}

	/**如果你想表达30%，那么这里传入30即可*/
	public void setMaxCpuUsage(String maxCpuUsage) {
		this.maxCpuUsage = maxCpuUsage;
	}

	public String getMaxMemoryUsage() {
		return maxMemoryUsage;
	}

	public void setMaxMemoryUsage(String maxMemoryUsage) {
		this.maxMemoryUsage = maxMemoryUsage;
	}

	public String getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(String maxLoad) {
		this.maxLoad = maxLoad;
	}

	public String getWangwangList() {
		return wangwangList;
	}

	public void setWangwangList(String wangwangList) {
		this.wangwangList = wangwangList;
	}

	public String getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(String phoneList) {
		this.phoneList = phoneList;
	}

	public String getEmailList() {
		return emailList;
	}

	public void setEmailList(String emailList) {
		this.emailList = emailList;
	}

	public void setMaxConnectionPerIp(String maxConnectionPerIp) {
		this.maxConnectionPerIp = maxConnectionPerIp;
	}

	public void setMaxWatchPerIp(String maxWatchPerIp) {
		this.maxWatchPerIp = maxWatchPerIp;
	}

	public String getMaxConnectionPerIp() {
		return maxConnectionPerIp;
	}

	public String getMaxWatchPerIp() {
		return maxWatchPerIp;
	}

	public String getDataDir() {
		return dataDir;
	}

	public void setDataDir(String dataDir) {
		this.dataDir = dataDir;
	}

	public String getDataLogDir() {
		return dataLogDir;
	}

	public void setDataLogDir(String dataLogDir) {
		this.dataLogDir = dataLogDir;
	}

	@Override
	public String toString() {
		return "AlarmSettings:[clusterId=" + clusterId + ", maxDelayOfCheck=" + maxDelayOfCheck + ", maxCpuUsage=" + maxCpuUsage + ", maxMemoryUsage=" + maxMemoryUsage + ", maxLoad=" + maxLoad;
	}

	public String getMaxDiskUsage() {
		return maxDiskUsage;
	}

	public void setMaxDiskUsage(String maxDiskUsage) {
		this.maxDiskUsage = maxDiskUsage;
	}

}
