<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: #ff0000;
}

.blockError {
	color: #000;
	backgroud-color: #ffeeee;
	border: 3px solid #ff00ff;
	padding: 8px;
	margin: 16px;
	text-aligment: center;
}
</style>



</head>
<body>

	<a href=<spring:url value="?language=en"/>> english</a>
	|
    <a href=<spring:url value="?language=sw"/>> swedish</a>
	<form:form commandName="attendee">
		<form:errors path="*" element="div" cssClass="blockError"></form:errors>
		<form:label for="textinput1" path="">
			<spring:message code="attendee.name" />
		</form:label>
		<form:input path="name" cssErrorClass="color" />
		<form:errors path="name" element="div" cssClass="error"></form:errors>
		<br>


		<form:label for="textinput2" path="">
			<spring:message code="attendee.emailAdress" />
		</form:label>
		<form:input path="emailAdress" cssErrorClass="color" />
		<form:errors path="emailAdress" element="div" cssClass="error"></form:errors>
		<br>
		
			<form:label for="textinput3" path="">
			<spring:message code="attendee.phoneNumber" />
		</form:label>
		<form:input path="phone" cssErrorClass="color" />
		<form:errors path="phone" element="div" cssClass="error"></form:errors>
		<br>
		<form:button class="btn" type="submit">Enter</form:button>



	</form:form>


</body>
</html>