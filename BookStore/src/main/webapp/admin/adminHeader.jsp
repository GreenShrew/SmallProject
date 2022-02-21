<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet" href="admin/css/admin.css">
<script src="script/jquery-3.6.0.js"></script>
<script src="admin/script/admin_script.js"></script>
</head>
<body>

<div id="adminFrame">
	<header>
		<h2>관리자 모드</h2>
		<ul>
			<li>Id : ${loginAdmin.id }&nbsp;|</li>
			<li>Name : ${loginAdmin.name}&nbsp;|</li>
			<li>Phone : ${loginAdmin.phone}&nbsp;</li>
			<li><a href="bs.do?cmd=adminLogout">logout</a></li>
		</ul>
	</header>




<!-- </div> -->
