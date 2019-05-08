<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.ceying.common.entity.UserLoginEntity" %>
<%@ page import="com.ceying.common.constant.UserStatusConstant" %>

<jsp:include page="/common/include.jsp" />
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>

<%
 		String delegateId = request.getParameter("delegateId");
 		String condition = "delegateId=" + delegateId;
		String deleteProcessUrl = "/gateway/modeler/flowable-modeler/delegate/detail/delete.do";
		UserLoginEntity currUser=(UserLoginEntity)session.getAttribute(UserStatusConstant.USER_LOGIN_SESSION);
		String userId = currUser.getUserId();
		String dataUrl = "/gateway/modeler/flowable-modeler/delegate/detail/process-key-name/list.do?" + condition;
%>
		<div class="main-content">
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
						<div class="col-xs-12">
							<r:button text="删除" iclass="fa-remove" onClick="del" ></r:button>
						</div>
					</div>
			     </div>
			</div>
	    </div>
		<r:grid id="grid-table"
				dataUrl="<%=dataUrl%>"
				colModel="{name : 'id',index : 'id',sortable:false,hidden:true},
								{name : 'delegateId',index : 'delegateId',sortable:false,hidden:true},
								{name : 'name',index : 'name',sortable:false},
								{name : 'processKey',index : 'processKey',sortable:false},
								{name : 'activityId',index : 'activityId',sortable:false,hidden:true},
								{name : 'extField',index : 'extField',sortable:true,hidden:true}"
				colNames="'ID','委托ID','流程定义名称','流程定义KEY','流程节点ID','领域'"
				multiSelect="true">
		</r:grid>
						
<script type="text/javascript">
var del = function(){
	var rowDatas = $("#grid-table").RGrid("getSelectedDatas"); 
	if(rowDatas.length==0){
		$.RMessage.alert("消息","请选择记录进行操作！");
	}else{
		var delegateDetailIds = new Array();		
	  	for(var j=0;j<rowDatas.length;j++){
	  		delegateDetailIds.push(rowDatas[j].id);
	  	}         
	  	delegateDetailIds= delegateDetailIds.join(",");
	  	$.RMessage.confirm("消息", "是否确认删除？", function(){
		  	Ajax.req({
		      	url: "<%=deleteProcessUrl%>",
		      	params: {ids:delegateDetailIds},
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
	  	}); 
	}
}
var exeComQuery = function (baseParams) {	  
    var queryParams = "";
    queryParams = decodeURIComponent(queryParams,true);
    var qparams = toJson(queryParams);
   $("#grid-table").RGrid("setGridParam",qparams);                
};

function toJson(str){
     var mJson = {};
	   var arr	= str.split('&');
	   for(var i=0;i<arr.length;i++){
	   	  var arr2 = arr[i].split('=');
	   	  mJson[arr2[0]] = arr2[1];			   	  
	  }	
	  return mJson;
}
</script>