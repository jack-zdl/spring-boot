<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>
<jsp:include page="/common/include.jsp" />
<%
    String url = "/gateway/modeler/flowable-modeler/workflow/history/process-instance/uncompleted.do";
%>

<r:win id="wf_taskProcessing_win"  maxable="true"  title="任务处理"></r:win>

<div>
    <r:grid id="grid-table"
            dataUrl="<%=url%>"
            colModel="{name : 'processInstanceId',index : 'processInstanceId',sortable:false,hidden:true},
                        {name : 'name',index : 'name',sortable:false,hidden:true},
                        {name : 'businessKey',index : 'businessKey',sortable:false,hidden:true},
                        {name : 'processDefinitionId',index : 'processDefinitionId',sortable:false,hidden:true},
                        {name : 'processDefinitionName',index : 'processDefinitionName',sortable:false},
                        {name : 'startUserName',index : 'startUserName',sortable:false,hidden:false},
                        {name : 'startUserId',index : 'startUserId',sortable:false,hidden:true},
                        {name : 'startTime',index : 'startTime',sortable:false},
                        {name : 'endTime',index : 'endTime',sortable:false,hidden:false},
                        {name : 'processDefinitionKey',index : 'processDefinitionKey',sortable:false,hidden:false},
                        {name : 'startActivityId',index : 'startActivityId',sortable:false,hidden:true},
                        {name : 'description',index : 'description',sortable:false}"
            colNames="'流程实例ID','流程实例名称','业务主键','流程定义ID','流程定义名称','发起人','userId','发起时间','结束时间','流程定义KEY','开始节点ID','描述'"
            multiSelect="true" onRowDbClick="onRowDbClick">
    </r:grid>
</div>
<script type="text/javascript">

    var type = "runtime";

    var closeWinFn = function(){
        $("#wf_taskProcessing_win").modal("hide");
        refresh();
    };

    var refresh =  function(){
        $("#grid-table").RGrid("setGridParam");
    }

    var onRowDbClick = function(id, data){
        delete data.description;
        delete data.processDefinitionName;
        delete data.name;
        data.type = type;
        var url = "${pageContext.request.contextPath}/workflow/client/myprocess/unfinishedWindow.jsp";
        var serialUrlParam = serialJson(data);
        if(serialUrlParam != ""){
            url += "?" + serialUrlParam;
        }
        $("#wf_taskProcessing_win").RWin('createWin',url);
    }

    function serialJson(param){
        var retVal = "";
        $.each(param,function (name,value) {
            retVal += name + "=" + escape(value) + "&";
        });
        if(retVal != ""){
            retVal = retVal.substring(0,retVal.length-1);
        }
        return retVal;
    }

</script>


