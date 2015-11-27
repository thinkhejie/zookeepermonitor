package com.taobao.taokeeper.monitor.service.impl;

import static common.toolkit.java.constant.SymbolConstant.COLON;

import java.util.List;

import com.taobao.taokeeper.model.TaoKeeperStat;
import com.taobao.taokeeper.monitor.service.ReportService;
import common.toolkit.java.constant.EmptyObjectConstant;
import common.toolkit.java.exception.DaoException;
import common.toolkit.java.util.ObjectUtil;
import common.toolkit.java.util.StringUtil;

/**
 * Description: Service of taokeeper_stat
 * @author yinshi.nc
 * @since 2012-01-05
 */
public class ReportServiceImpl extends BaseService implements ReportService {

	/** generate the content of server conns of each ip in cluster 
	 * @throws Exception */
	public String getReportContentOfServerConnectionByClusterIdAndServerAndStatDate(int clusterId, String server, String statDate) throws Exception {

		if (StringUtil.isBlank(server))
			return EmptyObjectConstant.EMPTY_STRING;

		List<TaoKeeperStat> taoKeeperStatList;
		try {
			taoKeeperStatList = reportDAO.queryTaoKeeperStatByClusterIdAndServerAndStatDate(clusterId, server, statDate);
		} catch (DaoException e) {
			throw new Exception("Error when get stat," + e.getMessage(), e.getCause());
		}

		StringBuffer contentOfReport = new StringBuffer("[");
		for (TaoKeeperStat taoKeeperStat : taoKeeperStatList) {
			if (ObjectUtil.isBlank(taoKeeperStat))
				continue;

			String statDateTime = StringUtil.trimToEmpty(taoKeeperStat.getStatDateTime());
			String xValue = StringUtil.replaceAll(statDateTime.substring(0, statDateTime.indexOf(".")), COLON, EmptyObjectConstant.EMPTY_STRING);
			int watchers = taoKeeperStat.getWatches();
			int conns = taoKeeperStat.getConnections();
			int nodeConut = taoKeeperStat.getNodeCount();
			if (StringUtil.trimToEmpty(xValue).startsWith("0"))
				xValue = xValue.replaceFirst("0", EmptyObjectConstant.EMPTY_STRING);
			contentOfReport.append("{date: " + xValue + ",watchers: " + watchers + ",conns: " + conns + ",znodes: " + nodeConut + "},");
		}

		contentOfReport.append("]");

		return contentOfReport.toString();
	}

}
