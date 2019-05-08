<%@ page import="java.util.Enumeration" %>
<%@ page import="java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="/common/include.jsp" />
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags"%>
<style>
    #myTab{
        border-top: 1px #ddd solid;
        border-bottom: 0;
    }
    #myTab>li>a{
        width: 80px;
        padding: 7px 0 8px;
        text-align: center;
        font-size: 14px;
        border-color: #ddd;
        color: #969696;
    }
    #myTab > li.active > a, .nav-tabs > li.active > a:hover, #myTab > li.active > a:focus{
        border-top: 2px #cb766d solid;
        color: #cb766d;
    }
    #myTab > li.active{
        border-top: 2px #cb766d solid;
    }
    #myTab > li{
        border-top: 2px #ddd solid;
    }
    .nav-tabs>li>a:hover{
        color: #cb766d;
    }
    #myTabContent {
        border: 0;
    }
    .btns{
        border: 0;
        background-color: #b81c22;
        font-size: 14px;
        font-family: "Microsoft YaHei";
        font-weight: 400;
        margin: 10px;
        padding: 6px 12px;
        color: white;
        text-align: center;
    }
    table.table-striped > tbody > tr:nth-child(2n+1) {
        background-color: #f5f6fa;
    }
    table{
        font-size: 12px;
        font-family: "Microsoft YaHei";
        color: #323232;
    }
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/workflow/client/common/flowable-cfg.js"></script>
<%
    String processDefinitionId = request.getParameter("processDefinitionId");
    String processInstanceId = request.getParameter("processInstanceId");
    String startActivityId = request.getParameter("startActivityId");
    String businessKey = request.getParameter("businessKey");
    String type = request.getParameter("type");
%>
<ul id="myTab" class="nav nav-tabs">
    <li class="active">
        <a href="#home" data-toggle="tab">基本信息</a>
    </li>
    <li><a href="#diagram" data-toggle="tab">流程图</a></li>
    <li><a href="#hisInfo" data-toggle="tab">历史信息</a></li>
</ul>
<div id="myTabContent" class="tab-content">
    <div class="tab-pane fade" id="home"></div>
    <div class="tab-pane fade" id="diagram"></div>
    <div class="tab-pane fade in active" id="hisInfo"></div>
</div>

<script type="text/javascript">

    var firstPageUrl;
    var formKeyMap;
    var urlParam = {processInstanceId : unescape("<%=processInstanceId%>"),
        processDefinitionId : unescape("<%=processDefinitionId%>"),
        startActivityId : unescape("<%=startActivityId%>"),
        businessKey : unescape("<%=businessKey%>"),
        type : unescape("<%=type%>")};

    $(function () {
        formKeyMap = queryFormKey(urlParam.processDefinitionId,urlParam.startActivityId)
        $.extend(urlParam,formKeyMap);
        if(urlParam["formKey"] != undefined && urlParam["formKey"] != ""){
            firstPageUrl = "${pageContext.request.contextPath}" + urlParam["formKey"];
        }
        if("<%=businessKey%>" != ''){
            firstPageUrl = firstPageUrl+"?urid=" + urlParam.businessKey;
        }
        $("#home").addClass('in').addClass("active");
        if(urlParam["formKey"] != undefined && urlParam["formKey"] != "") {
            loadHtml("home", firstPageUrl, urlParam, function () {
                $('#myTab a:first').tab('show');
            });
        }
        $("#diagram").height(document.documentElement.clientHeight - 200);
    });

    $("#myTab a").click(function (e) {
        e.preventDefault();
        $(this).tab('show');
        var href = $(this).attr("href");
        var $targetPane = $(href);
        if($targetPane.children().length > 0){
            // need not dealing with it
        }else{
            if(href == "#home"){
                $targetPane.addClass('in').addClass("active");
                loadHtml("home",firstPageUrl,urlParam,function () {
                    addProcessButton();
                });
            }
            if(href == "#diagram"){
                $targetPane.addClass('in').addClass("active");
                var url = "${pageContext.request.contextPath}/workflow/client/common/processDefinitionDiagram.jsp";
                loadHtml("diagram",url,urlParam);
            }
            if(href == "#hisInfo"){
                $targetPane.addClass('in').addClass("active");
                var url = "${pageContext.request.contextPath}/workflow/client/common/historyTask.jsp";
                loadHtml("hisInfo",url,urlParam);
            }
        }
    });

    //使用get方法加载页面
    function loadHtml(tabPaneId,url,param,successFunc){
        $.get(url,param,function (data,status,xhr) {
            $("#" + tabPaneId).html(data);
            if(successFunc){
                successFunc(data,status,xhr);
            }
        });
    }
    //获取formKey
    function queryFormKey(processDefinitionId, startActivityId){
        var retData;
        $.ajax({
            url: FLOWABLE.CONFIG.contextRoot + "/workflow/get/form-key.do",
            data: {processDefinitionId : processDefinitionId,
                startActivityId : startActivityId},
            success: function(data){
                retData = data;
            },
            dataType: "json",
            async: false
        });
        return retData;
    }
</script>
</body>
</html>
