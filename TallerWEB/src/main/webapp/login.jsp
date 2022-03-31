<!DOCTYPE html>
<%@page import="tallerclase41.service.impl.OcupacionServiceImpl"%>
<%@page import="tallerclase41.dao.impl.OcupacionDaoImpl"%>
<%@page import="tallerclase41.service.OcupacionService"%>
<%@page import="tallerclase41.domain.*"%>
<%@page import="java.util.*"%>
<html>
	<head></head>
	<body>
		<form action="<%=request.getContextPath()%>/DatosServlet" method="POST">
			<label>Nombre</label>
			<br>
			<input type="text" name="nombre" placeholder="nombre" required="required">
			<br>
			<label>Apellido</label>
			<br>
			<input type="text" name="apellido" placeholder="apellido" required="required">
			<br>
			<label>Documento</label>
			<br>
			<input type="text" name="documento" placeholder="documento" required="required">
			<br>
			<label>Edad</label>
			<br>
			<input type="text" name="edad" placeholder="edad" required="required">
			<br>
			<label>Ocupación</label>
			<br>
			<select name="ocupacion">
				<%
					OcupacionService ocu = new OcupacionServiceImpl();
					List<Ocupacion> ocupaciones = ocu.findAll();
					for(Ocupacion aux : ocupaciones){
						out.print("<option value="+ aux.getOcupacion()+">" +aux.getOcupacion()+ "</option>");
					}
				%>
				
			</select>
			<br>
			<label>Fecha de nacimiento</label>
			<br>
			<input type="date" name="fechanacimiento" placeholder="fechanacimiento" required="required">
			<br>
			<br>
			<input type="submit" value="Enviar">
		</form>
		<br>
			<a href="<%= request.getContextPath()%>/ListarServlet"><button>Listar</button></a>
		
	</body>
</html>