<%@page import="java.util.List"%>
<%@page import="CrudOperation.dao.DataBase"%>
<%@page import="CrudOperation.dto.Details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style>
a {
	color: white;
	text-decoration: none;
}

.table-action-btn {
	display: flex;
	justify-content: center;
	align-items:center
}

th,td{
   text-align: center;
}



a:hover {
	color: white;
}
</style>
</head>
<body>

	<%
	List<Details> details = (List<Details>) request.getAttribute("details");
	%>
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Student Name</th>
					<th scope="col">Address</th>
					<th scope="col">Phone</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>

				<%
				for (int i = 0; i < details.size(); i++) {
				%>

				<tr>
					<td><%=i + 1%></td>
					<td><%=details.get(i).getName()%></td>
					<td><%=details.get(i).getAddress()%></td>
					<td><%=details.get(i).getPhone()%></td>

					<td><div class="table-action-btn">


							<form action="update" method="post">
								<input type="hidden" value=<%=details.get(i).getId()%>
									name="updateid" />
								<button type="submit" class="btn btn-success">Update</button>
							</form>
							<form action="deleteid" method="post">
								<input type="hidden" value=<%=details.get(i).getId()%>
									name="deleteid" />
								<button type="submit" class="btn btn-danger mx-2">Delete</button>
							</form>
						</div></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</div>

</body>
</html>