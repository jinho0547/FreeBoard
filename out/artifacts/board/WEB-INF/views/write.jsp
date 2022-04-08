<%--
  Created by IntelliJ IDEA.
  User: jinho
  Date: 2022-04-01
  Time: 오전 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<div class="container">
    <br>
    <form method="post" action="dowrite">
        <div class="mb-3">
            <label for="nTitle" class="form-label">제목</label>
            <input type="text" class="form-control" id="nTitle" name="nTitle" placeholder="제목">
        </div>
        <div class="mb-3">
            <label for="nContent" class="form-label">내용</label>
            <textarea class="form-control" id="nContent" name="nContent" rows="15"></textarea>
        </div>
        <input type ="submit" value="작성">
        <br>
    </form>
    <br>
</div>