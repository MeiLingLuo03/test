<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 2022/11/5
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery-3.6.1.min.js"></script>

</head>
<body>
<%--<div class="box"></div>--%>
<button id="btn">ajax请求</button>

<form action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data">
    <input type="text" name="user"/>
    <input type="file" name="fileload"/>
    <input type="submit" name="上传文件"/>
</form>
<form action="${pageContext.request.contextPath}/morefileUpload" method="post" enctype="multipart/form-data">
    <input type="text" name="user"/>
    <input type="file" name="fileload"/>
    <input type="file" name="fileload"/>
    <input type="submit" name="上传文件"/>
</form>

<%--<form action="/article/convertParam" method="get">--%>
<%--    <label>生日</label>--%>
<%-- <input type="date" name="birthday"/>--%>
<%--    <input type="submit" value="提交">--%>


<%--</form>--%>
<%--<form action="/user/qureyParam" method="get">--%>
<%--    &lt;%&ndash;关键字查询&ndash;%&gt;--%>
<%--    <input type="text" name="keyValue"/><br>--%>
<%--    &lt;%&ndash;对象类型&ndash;%&gt;--%>
<%--    <input type="text" name="user.name"/>--%>
<%--    <input type="text" name="user.age"/>--%>
<%--    <input type="text" name="user.sex"/><br>--%>
<%--    &lt;%&ndash;list集合类型的&ndash;%&gt;--%>
<%--    &lt;%&ndash;第一个&ndash;%&gt;--%>
<%--    <p>list集合</p>--%>
<%--    <input type="text" name="list[0].name"/>--%>
<%--    <input type="text" name="list[0].age"/>--%>
<%--    <input type="text" name="list[0].sex"/><br>--%>

<%--    <input type="text" name="list[1].name"/>--%>
<%--    <input type="text" name="list[1].age"/>--%>
<%--    <input type="text" name="list[1].sex"/><br>--%>

<%--    &lt;%&ndash;map&ndash;%&gt;--%>

<%--    <p>map集合</p>--%>
<%--    <input type="text" name="map['key1'].name"/>--%>
<%--    <input type="text" name="map['key1'].age"/>--%>
<%--    <input type="text" name="map['key1'].sex"/>--%>

<%--    <input type="text" name="map['key2'].name"/>--%>
<%--    <input type="text" name="map['key2'].age"/>--%>
<%--    <input type="text" name="map['key2'].sex"/>--%>

<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>


<%--&lt;%&ndash; 数组&ndash;%&gt;--%>
<%--<form action="/user/arrParam" method="get">--%>
<%--    <label>乒乓球</label>--%>
<%--    <input type="checkbox" name="arr" value="乒乓球"/>--%>
<%--    <label>橄榄球</label>--%>
<%--    <input type="checkbox" name="arr" value="橄榄球"/>--%>
<%--    <label>羽毛球</label>--%>
<%--    <input type="checkbox" name="arr" value="羽毛球"/>--%>
<%--    <label>足球</label>--%>
<%--    <input type="checkbox" name="arr" value="足球"/>--%>

<%--    <input type="radio" name="arr" value="男">--%>
<%--    <input type="radio" name="arr" value="女">--%>

<%--    <input type="submit" value="提交"/>--%>
<%--</form>--%>
</body>
<script>
    $(function () {
        $("#btn").click(function (){
            // alert("haha~")
            let url='${pageContext.request.contextPath}/ajax';
            let data='[{"user":"张三"，"age":"18","arr":{"李四","王五"}},{"user":"张三","age":"18"},"arr":{"李四","王五"}]';
            /*url*/
            $.ajax({
                /* type： get put delete post*/
                /*提交参数*/
                type:'POST',
                /*url
                * json 接收类型的提交List<User>
                * */
                /*提交的数据*/
                date:date,
                url:url,
                /*提交内容类型*/
                contentType:"application/json;charset=utf-8",
                /*成功回调*/
                success:function (res){
                    console.log(res)
                },
                // /*错误的回调*/
                // error:function (error){
                //     console.log(error)
                // }
            })
        })

    })
</script>
</html>
