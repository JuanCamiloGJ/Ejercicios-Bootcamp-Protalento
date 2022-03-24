<!DOCTYPE html>
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
				
				<option value="1">Ingeniero de Sistemas</option>
			</select>
			<br>
			<label>Fecha de nacimiento</label>
			<br>
			<input type="date" name="fechanacimiento" placeholder="fechanacimiento" required="required">
			<br>
			<br>
			<input type="submit" value="Enviar">
		</form>
	</body>
</html>