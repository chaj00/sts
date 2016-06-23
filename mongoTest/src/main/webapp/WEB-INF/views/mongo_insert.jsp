<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/mongodb/score/insert" method="POST">
				<fieldset>
					<div id="legend">
						<legend>아래 양식을 작성해주세요.</legend>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">아이디</label>
						<div class="col-sm-3">
							<input type="text" id="orgcode" name="id"
								placeholder="아이디" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 부서명-->
						<label class="control-label col-sm-2" for="orgname">성명</label>
						<div class="col-sm-3">
							<input type="text" id="name" name="name"
								placeholder="성명" class="form-control" minlength="4" required>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 부서위치-->
						<label class="control-label col-sm-2" for="orgloc">부서명</label>
						<div class="col-sm-3">
							<input type="text" id="dept" name="dept"
								placeholder="부서명" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 전화번호-->
						<label class="control-label col-sm-2" for="orgtel">주소</label>
						<div class="col-sm-3">
							<input type="text" id="addr" name="addr" 
							placeholder="주소"
								class="form-control" minlength="4" required>

						</div>
					</div>
					<div class="form-group">
						<!-- 부서코드 -->
						<label class="control-label col-sm-2" for="orgcode">자바점수</label>
						<div class="col-sm-3">
							<input type="text" id="java" name="java"
								placeholder="자바점수" class="form-control"
								 required>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- 부서명-->
						<label class="control-label col-sm-2" for="orgname">서블릿</label>
						<div class="col-sm-3">
							<input type="text" id="servlet" name="servlet"
								placeholder="서블릿" class="form-control" minlength="4" required>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- 부서위치-->
						<label class="control-label col-sm-2" for="orgloc">spring</label>
						<div class="col-sm-3">
							<input type="text" id="spring" name="spring"
								placeholder="spring" class="form-control" minlength="4" >

						</div>
					</div>
					<div class="form-group">
						<!-- 전화번호-->
						<label class="control-label col-sm-2" for="orgtel">보너스</label>
						<div class="col-sm-3">
							<input type="text" id="bonus" name="bonus" 
							placeholder="보너스"
								class="form-control" minlength="4" required value="10000">

						</div>
					</div>

					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="가입하기" class="btn btn-success"/>
							
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>