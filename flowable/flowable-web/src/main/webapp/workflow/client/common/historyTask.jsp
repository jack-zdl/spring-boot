<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>
<jsp:include page="/common/include.jsp" />
<%
    String processInstanceId = request.getParameter("processInstanceId");
    String url = "/gateway/modeler/flowable-modeler/workflow/query/hisTask.do?processInstanceId=" + processInstanceId;
%>
<div>
    <r:grid id="hisTaskGrid"
            dataUrl="<%=url%>"
            colModel="{name : 'taskId',index : 'taskId',sortable:false},
                        {name : 'activityName',index : 'activityName',sortable:false},
                        {name : 'assignee',index : 'assignee',sortable:false, hidden:true},
                        {name : 'assigneeName',index : 'assigneeName',sortable:false},
                        {name : 'processInstanceId',index : 'processInstanceId',sortable:false,hidden:true},
                        {name : 'processDefinitionId',index : 'processDefinitionId',sortable:false,hidden:true},
                        {name : 'startTime',index : 'startTime',sortable:false},
                        {name : 'endTime',index : 'endTime',sortable:false,hidden:false},
                        {name : 'durationInMillis',index : 'durationInMillis',sortable:false,hidden:true},
                        {name : 'deleteReason',index : 'deleteReason',sortable:false,hidden:false},
                        {name : 'activityId',index : 'activityId',sortable:false,hidden:true}"
            colNames="'任务ID','活动名称','assignee','执行人','实例ID','流程定义ID','创建时间','结束时间','持续时间','删除原因','活动ID'"
            multiSelect="true">
    </r:grid>
</div>


