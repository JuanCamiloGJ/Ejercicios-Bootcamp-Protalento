<%@page import="com.carrousel.domain.Imagen"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- CSS only -->
<link href="<%=request.getContextPath()%>/css/bootstrap.min.css"
	rel="stylesheet">

<title>Imagenes</title>
</head>
<body>
	<%Collection<Imagen> img = (Collection<Imagen>)request.getAttribute("imagenes"); 
	
	if(img == null || img.isEmpty()){
		
		response.sendRedirect(request.getContextPath()+"/CarrouselServlet");
		out.print("es null o vacio");
	}else{
	%>
	<div class="container-fluid">
		
		<div id="carouselExampleControls" class="carousel slide"
			data-bs-ride="carousel">
			<div class="carousel-inner">
				<%
				boolean first = true;
				for(Imagen aux : img){
				
				
				%>
				<% 
				if(first){
				
				%>
				<div class="carousel-item active">
					
					<img src="<%=aux.getImagen()%>" class="d-block w-100; img-thumbnail" alt="...">
				</div>
				<%first = false;
				}else{ %>	
				<div class="carousel-item">
					<img src="<%=aux.getImagen()%>" class="d-block w-100; img-thumbnail" alt="...">
				</div>
				
				<%
				}
				
				} %>
				
			</div>
			<button class="carousel-control-prev" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button"
				data-bs-target="#carouselExampleControls" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
		</div>
	</div>

<%} %>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>