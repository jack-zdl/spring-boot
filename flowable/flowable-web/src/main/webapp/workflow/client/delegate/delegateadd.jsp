<%@ page import="com.ceying.common.entity.UserLoginEntity" %>
<%@ page import="com.ceying.common.constant.UserStatusConstant" %>
<%@ page import="org.springframework.util.StringUtils" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>

<%
	String delegateAddUrl = "/gateway/modeler/flowable-modeler/delegate/save.do";
	String delegateUpdateUrl = "/gateway/modeler/flowable-modeler/delegate/update.do";
	String getDelegateUrl = "/gateway/modeler/flowable-modeler/delegate/get.do";
	String listDelegateUrl = "/gateway/modeler/flowable-modeler/delegate/list.do";
	String checkDelegateUrl = "/gateway/modeler/flowable-modeler/delegate/check.do";
	UserLoginEntity currUser = (UserLoginEntity) session.getAttribute(UserStatusConstant.USER_LOGIN_SESSION);
	String userId = currUser.getUserId();
	String gridtenantid = currUser.getTenantId().toString();

	String id = request.getParameter("id");
	boolean modFlag = false;
	if(StringUtils.hasText(id)){
		modFlag = true;
	}
%>

<jsp:include page="/common/formhead.jsp" />
<form role="form" id="delegateadd" name="delegateadd" >
	<r:tinyPanel hasHeader="false">
		<r:panelItem>
			<jsp:include page="/common/wedget/ucsearch/user.jsp">
				<jsp:param name="id" value="delegateUserId"/>
				<jsp:param name="name" value="delegateUser"/>
				<jsp:param name="check" value="required"/>
				<jsp:param name="title" value="代理人ID"/>
			</jsp:include>
		</r:panelItem>
		<r:panelItem>
			<r:calendar id="startTime" width="6" name="startTime" title='委托开始时间' showOpts="yyyy-MM-dd HH:mm:ss"></r:calendar>
		</r:panelItem>
		<r:panelItem>
			<r:calendar id="endTime" width="6" name="endTime" title='委托结束时间' showOpts="yyyy-MM-dd HH:mm:ss"></r:calendar>
		</r:panelItem>
		<r:panelItem>
			<div class="each_input_wrap col-sm-6">
				<div class="col-xs-4"><label class="input_title" for="delegateType">委托方式</label></div>
				<div class="col-xs-8">
					<input name="delegateType" type="radio" value="A" class="" /> 全权委托
					<input name="delegateType" type="radio" value="P" class="" /> 流程委托
				</div>
			</div>
		</r:panelItem>
		<r:panelItem>
			<r:checkbox title="是否默认启用" id="taskState" name="taskState" value="1" />
		</r:panelItem>
		<r:panelItem>
			<r:checkbox title="委托结束时是否回收" id="withdrawTask" name="withdrawTask" value="1"/>
		</r:panelItem>
		<div style="display: none;">
			<r:panelItem>
				<r:checkbox title="是否以委托人身份审批" id="doAsDelegator" name="doAsDelegator" value="1" />
			</r:panelItem>
		</div>
	</r:tinyPanel>
</form>
<div class="btn_block">
	<r:button text="保存" id="saveid" iclass="bigger-110" bclass="btn btn-warning" onClick="saveFn"/>
	<r:button text="取消" id="cancelid" iclass="bigger-110" bclass="btn btn-primary" onClick="parent.closeWinFn"/>
</div>

<script type="text/javascript">

	var id = "";
	var userId = "<%=userId%>";
	var taskState;

    $(function(){
        if(<%=modFlag%>){
            Ajax.req({
                url: "<%=getDelegateUrl%>",
                method: "post",
                params: {
                    id: "<%=id%>"
                },
                ok: function(text){
                    var data = text.rows[0];
                    id = data["id"];
                    $("#startTime").val(data['startTime']!=undefined && data['startTime']!=''?data['startTime'].substring(0,data['startTime'].length - 4):'');
                    $("#endTime").val(data['endTime']!=undefined && data['endTime']!=''?data['endTime'].substring(0,data['endTime'].length - 4):'');
                    $("#delegateUserId").RComboGrid('setValue',data['delegateUserId']);
                    $("input[name='delegateType'][value='"+data['delegateType']+"']").attr("checked","checked");
                    taskState = data['taskState'];
                    if(data['taskState'] == "2"){
                        $("#taskState").RCheckbox("setChecked",true);
                    }
                    if(data['withdrawTask'] == "1"){
                        $("#withdrawTask").RCheckbox("setChecked",true);
                    }
                    if(data['doAsDelegator'] == "1"){
                        $("#doAsDelegator").RCheckbox("setChecked",true);
                    }
                },
                err: function(text){
                    $.RMessage.alert("消息", text.msg);
                }
            });
        } else {
            $("#taskState").RCheckbox("setChecked",true);
            $("#withdrawTask").RCheckbox("setChecked",true);
		}
    })

    var saveFn = function(){
        $("#delegateadd").RValidate({
            'success': save
        });

        $("#delegateadd").RValidate('validate');
    }

    var save = function(){
        var delegate_user = $("#delegateUserId").val();
        var start_time = $("#startTime").val().replace(/[^0-9]/ig,"");
        var end_time = $("#endTime").val().replace(/[^0-9]/ig,"");
        var delegateType = $("[name='delegateType']").filter(":checked");
        var delegateType = delegateType.attr("value");
        var date=new Date();
        var month = date.getMonth() + 1;
        var strDate = date.getDate();
        if (month >= 1 && month <= 9) {
            month = "0" + month;
        }
        if (strDate >= 0 && strDate <= 9) {
            strDate = "0" + strDate;
        }
        var now_time = date.getFullYear() +""+ month  + strDate
            + date.getHours() + date.getMinutes()
            + date.getSeconds();
        if(delegate_user==""){
            $.RMessage.alert("消息","代理人不能为空");
            return;
        }
        if(start_time == undefined || start_time == ""){
            $.RMessage.alert("消息","开始时间不能为空");
        }
        if(end_time == undefined || end_time == ""){
            $.RMessage.alert("消息","结束时间不能为空");
        }
        if(end_time!=""&&end_time<now_time){
            $.RMessage.alert("消息","结束时间不能早于当前时间");
            return;
        }
        if(start_time!=""&&end_time!=""&&start_time>end_time){
            $.RMessage.alert("消息","结束时间必须大于开始时间");
            return;
        }
        if(delegateType==""||delegateType==undefined){
            $.RMessage.alert("消息","请选择委托类型");
            return;
        }
        var queryParams = $("#delegateadd").serializeObject();
        if(queryParams.taskState){
            queryParams.taskState = "2";
        } else{
            queryParams.taskState = taskState || "1";
        }
        if(queryParams.withdrawTask){
            queryParams.withdrawTask = "1";
        } else {
            queryParams.withdrawTask = "0";
        }
        if(queryParams.doAsDelegator){
            queryParams.doAsDelegator = "1";
        } else {
            queryParams.doAsDelegator = "0";
        }
        queryParams.id = id;
        queryParams.userId = userId;
        var checkDelegateType = queryParams.delegateType == "A"?"P":"A";
        var tipMessage = checkDelegateType == "A"?"已添加流程委托，不可添加全权委托":"已添加全权委托，不可添加流程委托";
        check(checkDelegateType, tipMessage, queryParams);
    }

    function check(checkDelegateType, tipMessage, queryParams){
        Ajax.req({
            url: "<%=checkDelegateUrl%>",
            params : {
                userId : "<%=userId%>",
                delegateType : checkDelegateType
            },
            ok : function(text) {
				if(queryParams.delegateType == "A"){
					checkAddOne(queryParams);
				} else {
					successFunc(queryParams);
				}
            },
            err : function(text) {
                $.RMessage.alert("消息", tipMessage);
            }
        });
    }

    function checkAddOne(queryParams) {
        Ajax.req({
            url: "<%=checkDelegateUrl%>",
            params : {
                userId : "<%=userId%>",
                delegateType : "A"
            },
            ok : function(text) {
                successFunc(queryParams);
            },
            err : function(text) {
                $.RMessage.alert("消息", "全权委托下只允许添加一条委托配置");
            }
        });
    }

    function successFunc(queryParams) {
        Ajax.req({
            url: <%=modFlag%>?"<%=delegateUpdateUrl%>":"<%=delegateAddUrl%>",
            headers : true,
            params : JSON.stringify(queryParams),
            ok : function(text) {
                if (text.success == "true" || text.success == true) {
                    $.RMessage.alert("消息", text.msg, parent.closeWinFn);
                } else {
                    $.RMessage.alert("消息", text.msg);
                }
            },
            err : function(text) {
                $.RMessage.alert("消息", text.msg);
            }
        });
    }
</script>