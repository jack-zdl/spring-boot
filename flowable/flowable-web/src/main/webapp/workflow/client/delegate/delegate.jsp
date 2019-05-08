<%@ page import="com.ceying.common.entity.UserLoginEntity" %>
<%@ page import="com.ceying.common.constant.UserStatusConstant" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="/common/include.jsp" />
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>

<%
		String changeStateUrl = "/gateway/modeler/flowable-modeler/delegate/batch/update.do";
		UserLoginEntity currUser=(UserLoginEntity)session.getAttribute(UserStatusConstant.USER_LOGIN_SESSION);
		String userId = currUser.getUserId();
		String dataUrl = "/gateway/modeler/flowable-modeler/delegate/list.do?userId=" + userId;
%>

		<jsp:include page="/common/search.jsp">
			<jsp:param name="rows" value="[
				{id : 'delegateUserId',name : 'delegateUserId',title:'委托人',type:'grid',url:'/gateway/system/sysuser/selectuserfortask.do',displayField:'codename',valueField:'userId'},
				{id : 'startTime',name : 'startTime',title:'委托开始时间',type:'calendar',showOpts:'yyyy-MM-dd HH:mm:ss'},
				{id : 'endTime',name : 'endTime',title:'委托结束时间',type:'calendar',showOpts:'yyyy-MM-dd HH:mm:ss'},
				{id : 'delegateType',name : 'delegateType',title:'委托类型',type:'combo',url:'/gateway/system/enumConvert/queryEnum.do?keyno=DelegateTypeEnum'},
				{id : 'taskState',name : 'taskState',title:'委托状态',type:'combo',url:'/gateway/system/enumConvert/queryEnum.do?keyno=DelegateTaskStateEnum'},
				{id : 'withdrawTask',name : 'withdrawTask',title:'委托结束时是否回收',type:'combo',url:'/gateway/system/enumConvert/queryEnum.do?keyno=DelegateIsActiveEnum'},
				{id : 'doAsDelegator',name : 'doAsDelegator',title:'是否以委托人身份审批',type:'combo',url:'/gateway/system/enumConvert/queryEnum.do?keyno=DelegateIsActiveEnum'}
        	]" />
			<jsp:param name="girdId" value="grid-table" />
			<jsp:param name="defaultQuery" value="{id : 'delegateUserId',name : 'userId',title:'委托人',type:'grid',url:'/gateway/system/sysuser/selectuserfortask.do',displayField:'codename',valueField:'userId'}" />
		</jsp:include>
		<r:buttonList>	  
			<r:button text="添加委托关系" iclass="fa-plus" onClick="add" ></r:button>
			<r:button text="修改委托关系" iclass="fa-pencil-square-o" onClick="update" ></r:button>
			<r:button text="废除委托关系" iclass="fa-minus" id="delete" visible="<%=userId+\"#workflow/flowmomgrnew/delegate/changestate\"%>"></r:button>		
			<r:button text="启用委托关系" iclass="fa-play" id="run" visible="<%=userId+\"#workflow/flowmomgrnew/delegate/changestate\"%>"></r:button>
			<r:button text="停用委托关系" iclass="fa-stop" id="withdraw" visible="<%=userId+\"#workflow/flowmomgrnew/delegate/changestate\"%>"></r:button>		
			<r:button text="委托流程增加" iclass="fa-plus" onClick="setup"></r:button>		
			<r:button text="查看委托流程" iclass="fa-eye" onClick="view"></r:button>
		</r:buttonList>	
			
		<r:win title="添加委托关系" id="addModal" maxable="true"></r:win>
		<r:win title="委托流程增加（在此只能增加）" id="setupModal" width="800" height="500"></r:win>
		<r:win title="查看委托流程" id="viewModal" width="800" height="500" ></r:win>

<r:grid id="grid-table"
		dataUrl="<%=dataUrl%>"
		colModel="{name : 'id',index : 'id',sortable:false,hidden:true},
                        {name : 'userId',index : 'userId',sortable:false,hidden:true},
                        {name : 'userName',index : 'userName',sortable:false,hidden:false},
                        {name : 'delegateUserId',index : 'delegateUserId',sortable:false,hidden:true},
                        {name : 'delegateUserName',index : 'delegateUserName',sortable:false,hidden:false},
                        {name : 'startTime',index : 'startTime',sortable:false,hidden:false},
                        {name : 'endTime',index : 'endTime',sortable:false},
                        {name : 'delegateType',index : 'delegateType',sortable:false,hidden:true},
                        {name : 'delegateTypeName',index : 'delegateTypeName',sortable:false,hidden:false},
                        {name : 'taskState',index : 'taskState',sortable:true, hidden:true},
                        {name : 'taskStateName',index : 'taskStateName',sortable:false},
                        {name : 'withdrawTask',index : 'withdrawTask',sortable:false,hidden:true},
                        {name : 'withdrawTaskName',index : 'withdrawTaskName',sortable:false,hidden:false},
                        {name : 'doAsDelegator',index : 'doAsDelegator',sortable:false,hidden:true},
                        {name : 'doAsDelegatorName',index : 'doAsDelegatorName',sortable:false,hidden:false}"
		colNames="'ID','userId','代理人','delegateUserId','委托人','委托开始时间','委托结束时间','委托类型ID','委托类型','是否默认启用ID','是否默认启用','委托结束时是否回收ID','委托结束时是否回收','是否以委托人身份审批ID','是否以委托人身份审批'"
		multiSelect="true">
</r:grid>
			
<script type="text/javascript">
var add = function(){
  var url = "${pageContext.request.contextPath}/workflow/client/delegate/delegateadd.jsp";
  $("#addModal").RWin('createWin',url);
}
var update = function () {
    var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
    if(rowDatas.length!=1){
        $.RMessage.alert("消息","请选择一条记录进行操作！");
        return;
    }
    if(rowDatas[0].taskState == "0" || rowDatas[0].taskState == "3"){
        $.RMessage.alert("消息","过期或删除的委托不允许修改！");
        return;
	}
    var url = "${pageContext.request.contextPath}/workflow/client/delegate/delegateadd.jsp?id="+rowDatas[0].id;
    $("#addModal").RWin('createWin',url);
}
var setup = function() {
    var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
    if (rowDatas.length != 1) {
        $.RMessage.alert("消息", "请选择一条记录进行操作！");
    }else if(rowDatas[0].taskState == "0" || rowDatas[0].taskState == "3"){
        $.RMessage.alert("消息","过期或删除的委托不允许添加委托流程！");
        return;
    }else if(rowDatas[0].delegateType!="P"){
	  	$.RMessage.alert("消息","只能给类型为\"流程委托\"的委托信息添加委托流程！");
	}else{
		var url = "${pageContext.request.contextPath}/workflow/client/delegate/delegatesetup.jsp?delegateId="+rowDatas[0].id;
		$("#setupModal").RWin('createWin',url);
	}
}
var view = function(){
  var rowDatas = $("#grid-table").RGrid("getSelectedDatas"); 
  if(rowDatas.length!=1){
	  $.RMessage.alert("消息","请选择一条记录进行操作！");
  }else if(rowDatas[0].delegateType!="P"){
	  $.RMessage.alert("消息","只能查看类型为\"流程委托\"的委托流程！");
  }else{
	 var url = "${pageContext.request.contextPath}/workflow/client/delegate/delegateview.jsp?delegateId="+rowDatas[0].id;
	 $("#viewModal").RWin('createWin',url);
  }
}
//是否默认启用{委托状态 0：过期，1：停用，2：启用，3：删除}
$("#delete").bind("click",function(){
    var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
    if(rowDatas.length == 0){
        $.RMessage.alert("消息","请选择记录进行操作！");
        return;
    }
    for(var i=0;i<rowDatas.length;i++){
        if(rowDatas[i].taskState == "0" || rowDatas[i].taskState == "3"){
            $.RMessage.alert("消息","过期或删除的委托不允许删除！");
            return;
        }
	}
	$.RMessage.confirm("消息", "是否确认废除？", function(){
		changestate("3");
	});
});
$("#run").bind("click",function(){
    var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
    if(rowDatas.length == 0){
        $.RMessage.alert("消息","请选择记录进行操作！");
        return;
    }
    for(var i=0;i<rowDatas.length;i++){
        if(rowDatas[i].taskState == "0" || rowDatas[i].taskState == "3"){
            $.RMessage.alert("消息","过期或删除的委托不允许启用！");
            return;
        }
    }
	changestate("2");
});
$("#withdraw").bind("click",function(){var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
    if(rowDatas.length == 0){
        $.RMessage.alert("消息","请选择记录进行操作！");
        return;
    }
    for(var i=0;i<rowDatas.length;i++){
        if(rowDatas[i].taskState == "0" || rowDatas[i].taskState == "3"){
            $.RMessage.alert("消息","过期或删除的委托不允许停用！");
            return;
        }
    }
	changestate("1");
});
var changestate = function(taskState){
	var rowDatas = $("#grid-table").RGrid("getSelectedDatas"); 
	if(rowDatas.length==0){
		$.RMessage.alert("消息","请选择记录进行操作！");
	}else{
		var dbIds = new Array();
		var userId = "<%=userId%>";
	  	for(var j=0;j<rowDatas.length;j++){
	  		dbIds.push(rowDatas[j].id);
	  	}         
	  	dbIds= dbIds.join(",");
	  	Ajax.req({
	      	url: "<%=changeStateUrl%>",
	      	params: {ids:dbIds,taskState:taskState},
	      	ok: function(text) {
	      		if(text.success=="true"||text.success==true){
	      		 	exeComQuery();
	      		}else{
	      			$.RMessage.alert("消息",text.msg);
	      		}
	      	},
	      	err: function(text) {
	      		$.RMessage.alert("消息",text.msg);
	      	}
	  	});  
	}
}
var closeWinFn = function(){
	$("#addModal").modal("hide");
	exeComQuery();
}
var closeDelegateSetupWinFn = function(){
	$("#setupModal").modal("hide");
}
//var exeComQuery = function () {
//    $("#grid-table").RGrid("setGridParam");
//};
</script>