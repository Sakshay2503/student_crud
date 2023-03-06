<!DOCTYPE html>
<%@page import="CrudOperation.dto.Details"%>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<style>

 body{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    width: 100vw;
    height: 100vh;
  }
  .form{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    padding: 20px;
    width: 50%;
    background-color: #98e2ff;
  }

</style>
<body>
	<%
	Details details = (Details) request.getAttribute("details");
	%>

  <form class="form" action="updaterecord" method="post">
  <input type="hidden" value=<%=details.getId() %> name="id">
    <div class="mb-3 w-75">
      <label for="exampleInputEmail1" class="form-label"> Student Name</label>
      <input type="text" class="form-control " value=<%=details.getName() %> name="name" id="exampleInputEmail1" aria-describedby="emailHelp">
     
    </div>

    <div class="mb-3 w-75">
      <label for="exampleInputEmail1" class="form-label">Address</label>
      <input type="text" class="form-control " value=<%=details.getAddress() %> name="address" id="exampleInputEmail1" aria-describedby="emailHelp">
     
    </div>

    <div class="mb-3 w-75">
      <label for="exampleInputEmail1" class="form-label">Phone No</label>
      <input type="number" class="form-control " value=<%=details.getPhone() %> name="phone" id="exampleInputEmail1" aria-describedby="emailHelp">
      
    </div>
    
    <button type="submit" class="btn btn-primary w-75">Add Details</button>
  </form>
</body>
</html>