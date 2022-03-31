<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="tallerclase41.domain.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado de personas</title>
</head>
<body>
	<main>
	
		<table border="1">
		<tr>
			<th>
				Nombre	
			</th>
			<th>
				Apellido	
			</th>
			<th>
				Ocupación	
			</th>
			<th>
				Edad	
			</th>
			<th>
				Documento	
			</th>
			<th>
				Fecha de Nacimiento	
			</th>
		</tr>
		
		<% 
		Map <Integer, Persona> listado = (LinkedHashMap<Integer, Persona>) request.getAttribute("listadoPersonas");
		Iterator<Integer> it = listado.keySet().iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			Persona pj= listado.get(key);
			out.print(
			"<tr>"+
			"<td>"+pj.getNombre()+"</td>"+
			"<td>"+pj.getApellido()+"</td>"+
			"<td>"+pj.getOcupacion()+"</td>"+
			"<td>"+pj.getEdad()+"</td>"+
			"<td>"+pj.getDocumento()+"</td>"+
			"<td>"+pj.getFechaNacimiento()+"</td>"+ 
			"</tr>"
			);
		}
		
		%>
		 
		 
		 
		 	
		
		</table>
		<br>
		<a href="<%= request.getContextPath()%>/index.jsp"><button >Volver</button></a>
	</main>
</body>
</html>