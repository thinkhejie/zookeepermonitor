<%@ page language="java" pageEncoding="GBK"%><%@ include
	file="/WEB-INF/common/taglibs.jsp"%>
<div id="navcolumn" style="height: 500px;">
	<ul>

		<li>Monitor
			<ul>
				<li><a
					href="<c:url value="/zooKeeper.do?method=zooKeeperSettingsPAGE" />">��Ⱥ����</a></li>
				<li><a
					href="<c:url value="/zooKeeperStatus.do?method=showZooKeeperStatusPAGE" />">��Ⱥ���</a></li>
				<li><a
					href="<c:url value="/hostPerformance.do?method=showHostPerformancePAGE" />">�������</a></li>
				<li><a
					href="<c:url value="/alarmSettings.do?method=alarmSettingsPAGE" />">��������</a></li>
			</ul>
		</li>

		<br>
		<li>Admin
			<ul>
				<li><a
					href="<c:url value="admin.do?method=switchOfNeedAlarmPAGE" />">��������</a></li>
				<li><a
					href="<c:url value="admin.do?method=setSystemConfigPAGE" />">ϵͳ����</a></li>
			</ul>
		</li>

		<br>
		<!-- 
	<li>Reports
		<ul>
			<li><a href="">�ձ�</a></li>
			<li><a href="">�ܱ�</a></li>
			<li><a href="">����</a></li>
		</ul>
	</li>
-->




	</ul>
</div>
