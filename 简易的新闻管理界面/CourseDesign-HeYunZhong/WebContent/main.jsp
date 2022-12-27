<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon"
	href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/favicon.ico">
<link rel="canonical"
	href="https://getbootstrap.com/docs/3.4/examples/dashboard/">

<title>Dashboard Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link
	href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/css/ie10-viewport-bug-workaround.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/examples/dashboard/dashboard.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie-emulation-modes-warning.js"></script>

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">20大新闻管理系统</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<form class="navbar-form navbar-right"
				action="NewsController?op=find" method="post">
				<input type="text" class="form-control" placeholder="Search..."
					name="title">
				<button type="submit" class="btn btn-default">查找</button>
			</form>
		</div>

	</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a href="NewsController">新闻管理<span class="sr-only">(current)</span></a></li>
					<li><a href="/CourseDesign-HeYunZhong/login.jsp">退出系统</a></li>
				</ul>
			</div>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h2 class="sub-header">新增记录</h2>

				<div class="row placeholders">
					<form class="navbar-form navbar-left"
						action="NewsController?op=insert" method="post">
						ID：<input type="text" class="form-control" name="id">
						Title：<input type="text" class="form-control" name="title">
						Source：<input type="text" class="form-control" name="source">
						Date：<input type="text" class="form-control" name="date">
						
						<button type="submit" class="btn btn-default">添加</button>
						<form role="form">
							<div class="form-group ">
								<textarea placeholder="Content" name="content" class="form-control" rows="3" cols="138" ></textarea>
							</div>
						</form>
					</form>
				</div>

				<h2 class="sub-header">记录列表</h2>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th style="width: 60px; text-align: center">ID</th>
								<th style="width: 120px; text-align: center">Title</th>
								<th style="width: 120px; text-align: center">Source</th>
								<th style="width: 120px; text-align: center">Content</th>
								<th style="width: 120px; text-align: center">Date</th>
								<th style="width: 120px; text-align: center">操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="news" items="${list}">
								<tr>
									<form class="navbar-form navbar-left"
										action="NewsController?op=update" method="post">
										<td><input type="text" class="form-control"
											value="${news.id}" style="text-align: center" readonly
											name="id"></td>
										<td><input type="text" class="form-control"
											value="${news.title}" style="text-align: center" name="title"></td>
										<td><input type="text" class="form-control"
											value="${news.source}" style="text-align: center"
											name="source"></td>
										<td><input type="text" class="form-control"
											value="${news.content}" style="text-align: center"
											name="content"></td>
										<td><input type="text" class="form-control"
											value="${news.date}" style="text-align: center" name="date"></td>
										<td style="text-align: center">
											<button type="submit" class="btn btn-default">修改</button> <a
											href="NewsController?id=${news.id}&op=delete">
												<button type="button" class="btn btn-default">删除</button>
										</a>
										</td>
									</form>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"
		integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ"
		crossorigin="anonymous"></script>
	<script>
		window.jQuery
				|| document
						.write('<script src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/vendor/jquery.min.js"><\/script>')
	</script>
	<script
		src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/dist/js/bootstrap.min.js"></script>
	<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
	<script
		src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/vendor/holder.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="https://cdn.jsdelivr.net/npm/@bootcss/v3.bootcss.com@1.0.25/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
