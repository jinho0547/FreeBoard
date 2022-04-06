<%--
  Created by IntelliJ IDEA.
  User: jinho
  Date: 2022-04-01
  Time: 오전 11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container" style="width: 30%;">
    <div style="margin-top:50px;">
        <div style="text-align:center; color:red;">올바른 아이디가 아닙니다.</div>
        <br>
        <form method="post" action="dojoin">
            <label for="basic-url" class="form-label">아이디</label>
            <div class="input-group mb-3">
                <span class="input-group-text" id="basic-addon1">@</span>
                <input type="text" class="form-control" placeholder="Username" aria-label="UserID" aria-describedby="basic-addon1">
            </div>
            <label for="basic-url" class="form-label">이름</label>
            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="이름" aria-label="UserID" aria-describedby="basic-addon1">
            </div>
            <label for="basic-url" class="form-label">비밀번호</label>
            <div class="input-group mb-3">
                <input type="password" class="form-control" placeholder="비밀번호" aria-label="e" aria-describedby="basic-addon2">
            </div>
            <label for="basic-url" class="form-label">비밀번호 확인</label>
            <div class="input-group mb-3">
                <input type="password" class="form-control" placeholder="비밀번호 확인" aria-label="e" aria-describedby="basic-addon2">
            </div>
            <div>
                <input type="submit" class="btn btn-secondary" value="가입하기"/>
            </div>
        </form>
    </div>

</div>