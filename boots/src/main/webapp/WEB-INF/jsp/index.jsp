<%@page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<title>Bootstrap sample| Home</title>
	<link href="/static/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="/static/css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="#" class="navbar-brand">Bootsample</a>
			<div class="nav navbar-nav">
				<ul class="nav navbar-nav">
					<li><a href="#">Manage Task</a></li>				
					<li><a href="#">All tasks</a></li>				
				</ul>
			</div>
		</div>	
	</div>
	
	<div class="container invisible-at-first">
		<div class="jumbotron text-center" id="homeDiv">
			<h1>Welcome to Task Manager</h1>
		</div>
	</div>
	
	<div class="container text-center" id="tasksDiv">
		<h3>My Tasks</h3>
		<hr />
		<div class="table-responsive">
			<table class="table table-striped table-bordered">
				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Description</th>
						<th>Date created</th>
						<th>Finished</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="task" items="${tasks}">
						<tr>
							<td>${task.id}</td>
							<td>${task.name}</td>
							<td>${task.description}</td>
							<td>${task.dateCreated}</td>
							<td>${task.finished}</td>
						</tr>
					</c:forEach>		
				</tbody>	
			</table>
		</div>
	</div>
	
	
	
	
	<script type="text/javascript" src="/static/js/jquery-3.1.1.min.js">
	</script>
	<script type="text/javascript" src="/static/js/bootstrap.min.js">
	</script>

</body>
</html>
