<%--
  Created by IntelliJ IDEA.
  model.User: 8491389
  Date: 2023-02-23
  Time: 오후 7:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>회원가입.</title>
</head>
<body>

<div class="member">
  <!-- 1. 로고 -->
<form action="/board/join.do" method="post" enctype="application/x-www-form-urlencoded">
  <!-- 2. 필드 -->
  <div class="field">
    <b>아이디</b>
    <input type="text" name="userId" placeholder="아이디 입력">
  </div>
  <div class="field">
    <b>비밀번호</b>
    <input type="password"  name="userPw" placeholder="비밀번호 입력">
  </div>
  <div class="field">
    <b>비밀번호 재확인</b>
    <input type="password" name="userPw2" placeholder="비밀번호 재입력">
  </div>
  <div class="field">
    <b>이름</b>
    <input type="text" name="name">
  </div>

  <!-- 3. 필드(생년월일) -->
  <div class="field birth">
    <b>생년월일</b>
    <div>
      <input type="number" name="year" placeholder="년(4자)">
      <select name="month">
        <option value="">월</option>
        <option value="january">1월</option>
        <option value="february">2월</option>
        <option value="march">3월</option>
        <option value="april">4월</option>
        <option value="may">5월</option>
        <option value="june">6월</option>
        <option value="july">7월</option>
        <option value="august">8월</option>
        <option value="september">9월</option>
        <option value="october">10월</option>
        <option value="november">11월</option>
        <option value="december">12월</option>
      </select>
      <input type="number" name="day" placeholder="일">
    </div>
  </div>

  <!-- 4. 필드(성별) -->
  <div class="field gender">
    <b>성별</b>
    <div>
      <label><input type="radio" name="gender" value="man">남자</label>
      <label><input type="radio" name="gender" value="man">여자</label>
      <label><input type="radio" name="gender" value="">선택안함</label>
    </div>
  </div>

  <!-- 5. 이메일_전화번호 -->
  <div class="field">
    <b>본인 확인 이메일<small>(선택)</small></b>
    <input type="email" name="email" placeholder="선택입력">
  </div>

  <div class="field tel-number">
    <b>휴대전화</b>
    <select name="local">
      <option value="kor">대한민국 +82</option>
    </select>
    <div>
      <input type="tel" name="phoneNumber" placeholder="전화번호 입력">

      <p name="postPin" style="color: red">${postPinNumber}</p>
    </div>
    <input type="number" name="checkPin" placeholder="인증번호를 입력하세요">
    <p>상태창: </p>
    <span style="color: red">${error}</span>
  </div>

  <!-- 6. 가입하기 버튼 -->
  <input type="submit" value="가입하기">
</form>

  <!-- 7. 푸터 -->
  <div class="member-footer">
    <div>
      <a href="#none">이용약관</a>
      <a href="#none">개인정보처리방침</a>
      <a href="#none">책임의 한계와 법적고지</a>
      <a href="#none">회원정보 고객센터</a>
    </div>
    <span><a href="https://github.com/gamjagogi/wep5_homework.git">KimHyunhJoon Corp</a></span>
  </div>
</div>

</body>
</html>
