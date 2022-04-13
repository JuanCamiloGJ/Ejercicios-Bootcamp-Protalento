<%@page import="java.util.ArrayList"%>
<%@page import="com.carrousel.domain.Imagen"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listado Imagenes</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<jsp:include page="mensajeria.jsp"/>
		<%
	Collection<Imagen> img = new ArrayList<>();
	img = (Collection<Imagen>) request.getAttribute("imagenes");
	%>
	<div class="container-fluid">
		<div class="d-flex justify-content-center">
			<table class="table table-dark table-striped">

				<tr>
					<th>
						<p class="fs-3">ID</p>
					</th>
					<th>
						<p class="fs-3">Url</p>
					</th>
					<th>
						<p class="fs-3">Descripción</p>
					</th>
					<th>
						<p class="fs-3">Activar/Desactivar</p>

					</th>

					<th>
						<p class="fs-3">Modificar</p>

					</th>
				</tr>


				<%
				for (Imagen aux : img) {
				%>
				<tr>


					<form action="<%=request.getContextPath()%>/ActualizarDatosServlet"
						method="POST">
						<td>
						<input type='hidden' name='id' value="<%=aux.getId()%>"/>
						<label type="text"class="form-label" id="id1" name="id1"><%=aux.getId()%></label>
							
						</td>
						<td>
						<input type="text" class="form-control" placeholder="URL"
							aria-label="Url" aria-describedby="basic-addon1"
							value="<%=aux.getImagen()%>" name="url">
						</td>
						<td><input type="text" class="form-control"
							placeholder="Descripción" aria-label="Descripcion"
							aria-describedby="basic-addon1" value="<%=aux.getDescripcion()%>"
							name="des"></td>

						<td>
							<div class="d-flex justify-content-center">
								<input class="form-check-input" type="checkbox" value="true"
									id="flexCheckChecked" <%if (aux.getActivo()){%> checked
									<%};%>  name="act">
							</div>
						</td>

						<td>
							<button type="submit" class="btn btn-success">Guardar</button>
						</td>

					</form>

				</tr>
				<%
				}
				%>



			</table>

		</div>
			<form action="<%=request.getContextPath()%>/CarrouselServlet" method="post">
			
			<button type="submit" class="btn btn-dark">Mostrar Imagenes</button>
			</form>
	</div>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>