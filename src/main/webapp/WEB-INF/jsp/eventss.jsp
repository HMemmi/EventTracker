
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html ng-app>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>helloo my events</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script type="text/javascript" src="<spring:url value="/js/events.js"/>" ></script>

</head>


<body>

	<div ng-controller="Events">

		I have {{events.length}}
		<ul>
			<li ng-repeat="event in events">{{event.name}}</li>
		</ul>

	</div>

</body>


</html>