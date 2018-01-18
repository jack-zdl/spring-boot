<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String uid = request.getParameter("uid");
    boolean modFlag = uid==null || uid.equals("");
%>
<jsp:include page="common/formhead.jsp"/>
<style>
    .centerDiv{
        margin: 20px auto;
    }
    .titleDiv{
        width: 70px;
        margin-left:40px;
        margin-top: 10px;
        float: left;
        font-weight: bold;
    }
    .valueDiv{
        margin-top: 10px;
        width: 100px;
        float: left;
        color:#222222;
    }
</style>
<div class="centerDiv">
    <div class="col-md-6">
        <div class="titleDiv">
            姓名：
        </div>
        <div class="valueDiv" id="user_id">
            未知
        </div>
    </div>
    <div class="col-md-6">
        <div class=" titleDiv" >
            所属组织：
        </div>
        <div class="valueDiv" id="ext_field_3">
            未知
        </div>
    </div>
    <div class="col-md-6">
        <div class=" titleDiv">
            联系人：
        </div>
        <div class="valueDiv" id="ext_field_4">
            未知
        </div>
    </div>
    <div class="col-md-6">
        <div class="titleDiv">
            手机号：
        </div>
        <div class="valueDiv" id="ext_field_5">
            未知
        </div>
    </div>
</div>
<script>
    Ajax.req({
        url: "${pageContext.request.contextPath}/cpi/customer/erpmanager/erpquery",
        type:"json",
        method:"get",
        params: {
            user_id:'<%=uid%>'
        },
        ok: function(text) {
            var data=eval(text);
            $("#user_id").html(data.user_name);
            $("#ext_field_3").html(data.ext_field_3);
            $("#ext_field_4").html(data.ext_field_4);
            $("#ext_field_5").html(data.ext_field_5);
        },
        err: function(text) {
            $.RMessage.alert("消息",text.msg);
        }
    });
</script>
</body>
</html>
