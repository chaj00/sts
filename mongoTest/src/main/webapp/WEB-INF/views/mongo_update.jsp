<%@page import="spring.data.mongodb.dto.ScoreDTO"%>
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
<%ScoreDTO dto = (ScoreDTO)request.getAttribute("document"); %>
	<div class="container-fluid">
			<form role="form" class="form-horizontal"
				action="/mongodb/score/update" method="POST">
				<fieldset>
					<div id="legend">
						<legend>�Ʒ� ����� �ۼ����ּ���.</legend>
					</div>
				<div class="form-group">
					<!-- �μ��ڵ� -->
					<label class="control-label col-sm-2" for="orgcode">���̵�</label>
					<%=dto.getId()%>
				</div>

				<input type="hidden" name="id" value=<%=dto.getId()%> >
				<input type="hidden" name="name" value=<%=dto.getName()%> >
				

				<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="orgname">����</label>
						<%= dto.getName() %>
					</div>



				


					
					<div class="form-group">
						<!-- �μ���ġ-->
						<label class="control-label col-sm-2" for="orgloc">�μ���</label>
						<div class="col-sm-3">
							<input type="text" id="dept" name="dept"
								placeholder="�μ���" class="form-control" minlength="4" 
												value=<%=dto.getDept()%> >

						</div>
					</div>
					<div class="form-group">
						<!-- ��ȭ��ȣ-->
						<label class="control-label col-sm-2" for="orgtel">�ּ�</label>
						<div class="col-sm-3">
							<input type="text" id="addr" name="addr" 
							placeholder="�ּ�"
								class="form-control" minlength="4" value=<%=dto.getAddr() %>>

						</div>
					</div>
					<div class="form-group">
						<!-- �μ��ڵ� -->
						<label class="control-label col-sm-2" for="orgcode">�ڹ�����</label>
						<div class="col-sm-3">
							<input type="text" id="java" name="java"
								placeholder="�ڹ�����" class="form-control"
								 value=<%=dto.getJava() %>>
						</div>
					</div>

					
					
					<div class="form-group">
						<!-- �μ���-->
						<label class="control-label col-sm-2" for="orgname">����</label>
						<div class="col-sm-3">
							<input type="text" id="servlet" name="servlet"
								placeholder="����" class="form-control" minlength="4" 
											value=<%=dto.getServlet() %>>

						</div>
					</div>



				


					
					<div class="form-group">
						<!-- �μ���ġ-->
						<label class="control-label col-sm-2" for="orgloc">spring</label>
						<div class="col-sm-3">
							<input type="text" id="spring" name="spring"
								placeholder="spring" class="form-control" minlength="4" 
										<%=dto.getSpring() %>>

						</div>
					</div>
					<div class="form-group">
						<!-- ��ȭ��ȣ-->
						<label class="control-label col-sm-2" for="orgtel">���ʽ�</label>
						<div class="col-sm-3">
							<input type="text" id="bonus" name="bonus" 
							placeholder="���ʽ�"
								class="form-control" minlength="4" required value=<%=dto.getBonus() %>>

						</div>
					</div>

					<div class="form-group">
						<!-- Button -->
						<div class="col-sm-3 col-sm-offset-2">
							<input type="submit" value="�����ϱ�" class="btn btn-success"/>
							
						</div>
					</div>
				</fieldset>
			</form>
	</div>
</body>
</html>