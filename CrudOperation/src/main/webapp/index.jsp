<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
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
  .box1{
    display: flex;
    align-items: center;
    justify-content: center;
    flex-direction: column;
    padding: 20px;
    width: 20%;
    background-color: #98e2ff;
  }
</style>
<body>

  <div class="box1">
   
     <a href="addDetails.jsp" class="btn btn-primary w-75 m-3">Add New</a>
    
    <a href="displayAllRecords" class="btn btn-primary w-75 m-3">Display All</a>

  </div>
  
</body>
</html>