<%@ page import="com.ceying.common.entity.UserLoginEntity" %>
<%@ page import="com.ceying.common.constant.UserStatusConstant" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>

<jsp:include page="/common/include.jsp" />

	<%
		String saveProcessUrl = "/gateway/modeler/flowable-modeler/delegate/detail/batch/save.do";
		String delegateId = request.getParameter("delegateId");
		UserLoginEntity currUser = (UserLoginEntity)session.getAttribute(UserStatusConstant.USER_LOGIN_SESSION);
		String userId = currUser.getUserId();
		String condition = "delegateId=" + delegateId + "&userId=" + userId;
		String dataUrl = "/gateway/modeler/flowable-modeler/delegate/detail/can-add/list.do?" + condition;
	%>

	<div class="main-content">
		<div class="page-content">
			<div class="row">
				<div class="col-xs-12">
					<div class="col-xs-12">
						<r:button text="提交" iclass="fa-check-square-o" onClick="saveProcess"></r:button>
						<r:button text="取消" iclass="fa-remove" onClick="closeWinFn"></r:button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<r:grid id="grid-table"
			dataUrl="<%=dataUrl%>"
			colModel="{name : 'name',index : 'name',sortable:false,hidden:false},
							{name : 'processKey',index : 'processKey',sortable:false}"
			colNames="'流程定义名称','流程定义KEY'"
			multiSelect="true">
	</r:grid>

	<script type="text/javascript">
		var closeWinFn = function(){
			parent.closeDelegateSetupWinFn();
		}

		function saveProcess(){
			var processKey=new Array();
			var delegateId = "<%=delegateId%>";
            var rowDatas = $("#grid-table").RGrid("getSelectedDatas");
            for (var i = 0; i < rowDatas.length; i++) {
                processKey.push(rowDatas[i].processKey);
			}
			if(processKey.length==0){
				$.RMessage.alert("消息","请选择需要增加的委托流程！");
				return;
			}
			Ajax.req({
				url: "<%=saveProcessUrl%>",
				type:"json",
				params: {
					delegateId:"<%=delegateId%>",
                    processKey: processKey.join(","),
				},
				ok: function(text) {
					if(text.success=="true"||text.success==true){
						 $.RMessage.alert("消息",text.msg,closeWinFn);
					}else{
						$.RMessage.alert("消息",text.msg);
					}
				  },
				  err: function(text) {
					 $.RMessage.alert("消息",text.msg);
				  }
			});
		}
	</script>