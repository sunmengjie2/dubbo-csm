<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/resource/css1/index_work.css">
<script type="text/javascript" src="/resource/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/resource/My97DatePicker/WdatePicker.js"></script>
</head>
<script type="text/javascript">
function order(){
	$("form").submit();
}
</script>
<body>
<form action="list" method="post">
发表时间：<input type="date" name="dt1" value="${sun.dt1}">--
		<input type="date" name="dt2" value="${sun.dt2}">
		
		<select  name="select" >
			<option value="">--请选择--</option>
			<option <c:if test="${sun.select=='created'}">selected</c:if> value="created">发表时间</option>
			<option <c:if test="${sun.select=='user_id'}">selected</c:if> value="user_id">作者Id</option>
			<option <c:if test="${sun.select=='commentCnt'}">selected</c:if> value="commentCnt">评论数量</option>
        <select>
        <input type="submit" value="查询">
<table>
  <tr>
    <td>编号</td>
	<td>标题</td>
	<td>内容</td>
	<td>作者ID</td>
	<td>评论数量</td>
	<td>发表时间</td>
	<td>修改时间</td>
  </tr>
  <c:forEach items="${pageInfo.list }" var="l">
  <tr>
    <td>${l.id}</td>
	<td>${l.title}</td>
	<td>${l.content}</td>
	<td>${l.userId}</td> 
	<td>${l.commentCnt}</td>
	<td> <fmt:formatDate value="${l.created}" pattern="yyyy-MM-dd"/> </td>
	<td><fmt:formatDate value="${l.updated}" pattern="yyyy-MM-dd"/></td>
  </tr>
  </c:forEach>
  <tr>
  	<tr>
		<td colspan="10">
			<button name="pageNum" value="1">首页</button>
			<button name="pageNum" value="${pageInfo.prePage==0?1:pageInfo.prePage }">上一页</button>
			<button name="pageNum" value="${pageInfo.nextPage==0?pageInfo.pages:pageInfo.nextPage }">下一页</button>
			<button name="pageNum" value="${pageInfo.pages }">尾页</button>
			当前页/总页数：${pageInfo.pageNum}/${pageInfo.pages}
		</td>
	</tr>
  </tr>
</table>
</form>
</body>
</html>