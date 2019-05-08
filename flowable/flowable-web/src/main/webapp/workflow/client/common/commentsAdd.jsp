<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="r" uri="http://ceying.cypfintech.com/cyui-tags" %>
<%@ page import="com.ceying.controller.CommonController" %>
<%@ page import="com.ceying.common.enums.SysParamEnum" %>
<jsp:include page="/common/include.jsp"/>
<script src="${pageContext.request.contextPath}/CYUI/plugins/uploadify/jquery.uploadify.min.js"></script>

<%
    String taskId = request.getParameter("taskId");
    String conditionExpression = request.getParameter("conditionExpression");
    String saveUrl = "/gateway/modeler/flowable-modeler/workflow/complete/task/add/description.do";
    String dataUrl = "";
    String addUrl = "/gateway/modeler/flowable-modeler/workflow/file/upload/having/success.do?taskId=" + taskId;
    String downloadUrl = "";
    String fileTypeExts = CommonController.getSysParam(SysParamEnum.FILESUFFIX.getKey());
    String fileSizeLimit = CommonController.getSysParam(SysParamEnum.FILESIZE.getKey());
%>

<jsp:include page="/common/formhead.jsp" />
<form role="form" id="commentsAdd">
    <r:tinyPanel title="备注" hasHeader="true">
        <r:panelItem>
            <r:textArea id="description" name="description" title="原因" check="required"/>
        </r:panelItem>
        <r:panelItem>
            <jsp:include page="/workflow/client/common/fileupload.jsp" >
                <jsp:param name="id"  value="file_upload" />
                <jsp:param name="uploadSuccess"  value="uploadSuccess" />
                <jsp:param name="uploadError"  value="uploadError" />
                <jsp:param name="width"  value="8" />
                <jsp:param name="title" value="附件" />
                <jsp:param name="dataUrl"  value="<%=dataUrl%>" />
                <jsp:param name="addUrl"  value="<%=addUrl%>" />
                <jsp:param name="downloadUrl"  value="<%=downloadUrl%>" />
                <jsp:param name="fileTypeExts"  value="<%=fileTypeExts%>" />
                <jsp:param name="fileSizeLimit"  value="<%=fileSizeLimit%>" />
            </jsp:include>
        </r:panelItem>
    </r:tinyPanel>
</form>
<jsp:include page="/common/formbottom.jsp" />

<script type="text/javascript">

    var fileNeedUploadNum = 0;
    var saveFn = function () {
        fileNeedUploadNum = $('#file_upload').RUploadfile('getAddFileNum');
        if(fileNeedUploadNum == 0){
            lastSave();
        } else {
            fileUpload();
        }
    };
    var uploadSuccess = function () {
        fileNeedUploadNum--;
        if(fileNeedUploadNum == 0){
            lastSave();
        } else {
            fileUpload();
        }
    };
    var uploadError = function () {
        $.RMessage.alert("消息", "附件上传失败！");
    };
    var fileUpload = function () {
        $('#file_upload').RUploadfile('upload');
    };
    var lastSave = function () {
        var params = getParams();
        params.description = $("#description").val();
        Ajax.req({
            url: "<%=saveUrl%>",
            headers : true,
            params: JSON.stringify(params),
            ok: function (result) {
                $.RMessage.alert("消息",result.msg, parent.closeWinFn);
            },
            err: function(result){
                $.RMessage.alert("消息", result.msg);
            }
        });
    };

    var getParams = function () {
        var params = parent.getLoadHtmlVariables();
        params.taskId = "<%=taskId%>";
        params.conditionExpression = "<%=conditionExpression%>";
        return params;
    }
</script>
