<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="0" cellpadding="0" cellspacing="0" width="1000" height​=​"500"​>
  <tr>
    <td height="40"> 
    	<jsp:include page="encabezado.jsp" >
		<jsp:param name="tit" value="Registracion aceptada"/>
		<jsp:param name="sub" value='Bienvenido:' />
	
		</jsp:include>
		<%= request.getParameter("txtNombre")%>
		
</td>
  </tr>
  
  <tr>
    <td> 
	<a href="registracion.jsp">a registracion</a>
    
    </td>
  </tr>
 
  <tr><td height="40">
	<jsp:include page="copyrigth.jsp" >
	<jsp:param name="tit" value="Facultad informatica"/>
	</jsp:include>
  
  </td>
  </tr>

</table>

</body>
</html>