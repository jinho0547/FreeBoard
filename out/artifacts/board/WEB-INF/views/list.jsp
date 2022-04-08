<%--
  Created by IntelliJ IDEA.
  User: jinho
  Date: 2022-04-01
  Time: 오전 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="container">
    <br>
    <table class="table">
        <thead>
        <tr style="text-align:center;">
            <th class="col-1">번호</th>
            <th class="col-4">제목</th>
            <th class="col-2">글쓴이</th>
            <th class="col-1">날짜</th>
            <th class="col-1">조회수</th>
            <th class="col-1">좋아요</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="n" items="${list}">
        <tr style="text-align:center;">
            <th scope="row">${n.nID}</th>
            <td><a href="/board/detail?id=${n.nID}" style="text-decoration: none;color:black;">${n.nTitle}</a></td>
            <td>${n.userID}</td>
            <td><fmt:formatDate value="${n.regDate}" pattern="yyyy-MM-dd"/></td>
            <td>${n.hit}</td>
            <td>${n.likes}</td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <nav aria-label="Page navigation example">
        <ul class="pagination justify-content-center">
            <li class="page-item disabled">
                <a class="page-link">Previous</a>
            </li>
            <li class="page-item"><a class="page-link" href="#">1</a></li>
            <li class="page-item active"><a class="page-link" href="#">2</a></li>
            <li class="page-item"><a class="page-link" href="#">3</a></li>
            <li class="page-item">
                <a class="page-link" href="#">Next</a>
            </li>
        </ul>
        <a href="/board/write"><button type="button" class="btn btn-secondary" style="float: right;">글쓰기</button></a>
    </nav>





</div>