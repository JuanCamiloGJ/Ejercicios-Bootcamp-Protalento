<%
	String error = (String) request.getAttribute("error");

	if(error !=null){
%>
	<div class="alert alert-danger" role="alert">
	 	<%=error%>
	</div>


<%} 

	String succes = (String) request.getAttribute("succes");
	if(succes !=null){
%>
	<div class="alert alert-success" role="alert">
  		<%=succes%>
	</div>
<%} %>