





<%@ page language="java" pageEncoding="UTF-8"%><%@ include
	file="/WEB-INF/common/taglibs.jsp"%>


<style>
.mytable {align:center;border-collapse:collapse;border:solid #6AA70B;border-width:0px 0 0 0px;width:600;} 
.mytable table tr {list-style:none; border-bottom:#6AA70B 1px dotted ;font-size: 12px;;height:20px;} 
.mytable table tr.t1 {background-color:#EEEEEE;}/* 第一行的背景色 */ 
.mytable table tr.t2{background-color:#;}/* 第二行的背景色 */ 
.mytable table tr.t3 {background-color:#CCCCCC;}/* 鼠标经过时的背景色 */ 
</style> 

<style type="text/css">
a:link { text-decoration: none}
a:active { text-decoration:none}
a:hover { text-decoration:none} 
a:visited { text-decoration:none}
</style>
<h1>ZooKeeper 集群信息<font size="2">  <a href="zooKeeper.do?method=zooKeeperRegisterPAGE">加入监控</a></font></h1>

<select id="clusterSelector" onchange="javascript:location.href=this.value;" >
	<c:forEach var="zooKeeperCluster" items="${zooKeeperClusterMap}">
		<c:choose>
     			<c:when test="${ zooKeeperCluster.key eq clusterId }"><option value="zooKeeper.do?method=zooKeeperSettingsPAGE&clusterId=${zooKeeperCluster.key}"  selected>${zooKeeperCluster.value.clusterName}</option></c:when>
				<c:otherwise><option value="zooKeeper.do?method=zooKeeperSettingsPAGE&clusterId=${zooKeeperCluster.key}">${zooKeeperCluster.value.clusterName}</option></c:otherwise>
		</c:choose>
	</c:forEach>
</select>
<div align="center" class="mytable" id="tab">

<form name="updateZooKeeperSettings"  id="updateZooKeeperSettings"  action="zooKeeper.do?method=updateZooKeeperSettingsHandle"  method="post">
	<table>
		 <tr style="background-color:#D3D1D1; text-align:center;">
		 	<td><b>配置项</b></td>
		 	<td><b>设置参数</b></td>
		 </tr>
		 <tr>
		 	<td valign="middle">ZooKeeper集群名称</td>
		 	<td valign="middle" ><input type="text" name="clusterName" id="clusterName"  value="${zooKeeperCluster.clusterName}" size="100"/></td>
		 </tr>
		 <tr >
		 	<td valign="middle">机器列表</td>
		 	<td valign="middle" ><input type="text" name="serverListString"  id="serverListString"  value="${zooKeeperClusterServerList}" size="100"/></td>
		 </tr>
		 <tr >
		 	<td valign="middle">描述</td>
		 	<td valign="middle" ><input type="text" name="description" id="description" value="${zooKeeperCluster.description}" size="100"/></td>
		 </tr>
		 <tr >
		 	<td valign="middle"></td>
		 	<td align="right" ><input type="submit"  value="Update"  size="90"/> <font color="red">${handleMessage}</font> </td>
		 </tr>
	</table>
	<input type="hidden"  value="${clusterId}"  name="clusterId" id="clusterId" />
</form>


</div>






<script type="text/javascript"> 

var Ptr=document.getElementById("tab").getElementsByTagName("tr"); 
function $() { 
for (i=1;i<Ptr.length+1;i++) { 
Ptr[i-1].className = (i%2>0)?"t1":"t2"; 
} 
} 
window.onload=$; 
for(var i=0;i<Ptr.length;i++) { 
Ptr[i].onmouseover=function(){ 
this.tmpClass=this.className; 
this.className = "t3"; 
}; 
Ptr[i].onmouseout=function(){ 
this.className=this.tmpClass; 
}; 
} 

</script>



