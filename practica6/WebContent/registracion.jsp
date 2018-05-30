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
		<jsp:param name="tit" value="Materias Optativas 2"/>
		<jsp:param name="sub" value="2018"/>
		</jsp:include>
</td>
  </tr>
  
  <tr>
    <td> 
    	<form action="/practica6/aceptacion.jsp" method= "post">


		

		<label for= "txtNombre"> Nombre y apellido </label>
		<input type= "text" id = "txtNombre" name= "txtNombre">
		<br>
		
		<label for= "txtEdad"> Edad </label>
		<input type= "text" id = "txtEdad" name= "txtEdad">
		<br>
		
		<label for= "txtSexo"> sexo </label>
		<input type= "text" id = "txtSexo" name= "txtSexo">
		<br>
	
				
		<select name="OS">
  		 <option selected value="0"> Elige una opción </option>
    	   <optgroup label="cursos disponibles"> 
    	   <option value="1">curso HTML</option> 
       		<option value="2">curso de JAva</option> 
      	 	<option value="3">curso de Android</option> 
   		</optgroup> 

		</select>
		<br>
		
		<input type= "submit" value = "Enviar Datos">
	</form>
    
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