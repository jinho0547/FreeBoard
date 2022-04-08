<%--
  Created by IntelliJ IDEA.
  User: jinho
  Date: 2022-04-01
  Time: 오전 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <tr style="text-align:center;">
            <th scope="row">${detail.nID}</th>
            <td>${detail.nTitle}</td>
            <td>${detail.userID}</td>
            <td><fmt:formatDate value="${n.regDate}" pattern="yyyy-MM-dd"/></td>
            <td>${detail.hit}</td>
            <td>${detail.likes}</td>
        </tr>
        </tbody>
    </table>
    <table class="table">
        <thead>
        <tr>
            <th colspan="6" style="text-align: center;">내용</thc>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td rowspan=10>
                <div style="margin:30px;padding:30px;">
                    ${detail.nContent}
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <table class="table">
        <thead>
        <th>댓글</th>
        </thead>
        <tbody>
        <tr>
            <td style="padding-left:30px;">ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ</td>
            <td>한진호</td>
            <td class="col-1">2022/03/31</td>
            <td class="col-1" style="text-align: right; color:gray;padding-right:20px;">수정</td>
            <td class="col-1" style="text-align: right; color:gray;padding-right:20px;">삭제</td>
        </tr>
        </tbody>
    </table>
    <button type="button" class="btn btn-secondary">목록</button>
    <button type="button" class="btn btn-secondary" style="float: right;">삭제</button>
    <button type="button" class="btn btn-secondary" style="margin-right: 10px; float: right;">수정</button>
</div>
