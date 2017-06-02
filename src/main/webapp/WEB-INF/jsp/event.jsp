<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.error{
	color:#ff0000;
}
.blockError{
	color:#000;
	backgroud-color:#ffeeee;
	border: 3px solid #ff00ff;
	padding: 8px;
	margin: 16px;
	text-aligment:center;
}

</style>



</head>
<body>

<form:form commandName="event" >
<form:errors path="*" element="div" cssClass="blockError"></form:errors>
<form:label for="textinput1" path="" > Enter minutes</form:label>
<form:input path="name" cssErrorClass="color"/>
<form:errors path="name" element="div" cssClass="error"></form:errors>
<br>
<form:button class="btn" type="submit">Enter</form:button>



</form:form>


</body>
</html>