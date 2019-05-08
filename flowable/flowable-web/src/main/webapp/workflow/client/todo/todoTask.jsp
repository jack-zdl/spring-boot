<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:include page="/common/include.jsp" />
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>
<script type="text/javascript" src="${pageContext.request.contextPath}/workflow/client/common/flowable-cfg.js"></script>
<%
    String processDefinitionKey = request.getParameter("processDefinitionKey");
    String dataUrl = "/gateway/modeler/flowable-modeler/workflow/rest/query/tasks.do?processDefinitionKey=" + processDefinitionKey + "&isNeedListPage=1";
%>
<r:win id="wf_taskProcessing_win"  maxable="true"  title="任务处理"></r:win>

<r:grid id="taskGrid" dataUrl="<%=dataUrl%>"
        colModel="{name : 'id',index : 'id',sortable:false},
                    {name : 'name',index : 'name',sortable:false},
                    {name : 'assignee.firstName',index : 'assignee.firstName',sortable:false},
                    {name : 'assignee.id',index : 'assignee.id',sortable:false,hidden:true},
                    {name : 'processInstanceId',index : 'processInstanceId',sortable:false,hidden:false},
                    {name : 'processInstanceName',index : 'processInstanceName',sortable:false},
                    {name : 'processDefinitionId',index : 'processDefinitionId',sortable:false,hidden:false},
                    {name : 'processDefinitionName',index : 'processDefinitionName',sortable:false},
                    {name : 'processDefinitionKey',index : 'processDefinitionKey',sortable:false},
                    {name : 'created',index : 'created',sortable:false},
                    {name : 'dueDate',index : 'dueDate',sortable:false,hidden:false},
                    {name : 'endDate',index : 'endDate',sortable:false},
                    {name : 'duration',index : 'duration',sortable:false,hidden:false},
                    {name : 'processInstanceStartUserId',index : 'processInstanceStartUserId',sortable:false},
                    {name : 'formKey',index : 'formKey',sortable:false,hidden:false},
                    {name : 'initiatorCanCompleteTask',index : 'initiatorCanCompleteTask',sortable:false},
                    {name : 'isMemberOfCandidateGroup',index : 'isMemberOfCandidateGroup',sortable:false,hidden:false},
                    {name : 'isMemberOfCandidateUsers',index : 'isMemberOfCandidateUsers',sortable:false}"
        colNames="'任务ID','任务名称','执行人','userId','实例ID','实例名称','流程定义ID','流程定义名称','流程定义KEY','创建时间','持续时间',
                    '结束时间','duration','发起流程人','formKey','initiatorCanCompleteTask','isMemberOfCandidateGroup','isMemberOfCandidateUsers'" multiSelect="true"
        onRowDbClick="onRowDbClick">
</r:grid>



<script type="text/javascript">

    var closeWinFn = function(){
        $("#wf_taskProcessing_win").modal("hide");
        refresh();
    };

    var refresh =  function(){
        $("#taskGrid").RGrid("setGridParam");
    };

    var onRowDbClick = function(id, data){
        data.taskId = data.id;
        var url = "${pageContext.request.contextPath}/workflow/client/common/taskWindow.jsp";
        var serialUrlParam = serialJson(data);
        if(serialUrlParam != ""){
            url += "?" + serialUrlParam;
        }
        $("#wf_taskProcessing_win").RWin('createWin',url);
    }

    function serialJson(param){
        var retVal = "";
        $.each(param,function (name,value) {
            if(name.indexOf("name") > -1||name.indexOf("Name") > -1){
                retVal += name + "=" + encodeURI(encodeURI(value)) + "&";
            }else {
                retVal += name + "=" + value + "&";
            }
        });
        if(retVal != ""){
            retVal = retVal.substring(0,retVal.length-1);
        }
        return retVal;
    }
</script>