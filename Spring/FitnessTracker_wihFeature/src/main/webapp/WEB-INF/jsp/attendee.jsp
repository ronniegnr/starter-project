<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Attendee</title>
</head>
<body>

    <a href="?language=en">English</a> | <a href="?language=bn">Bangla</a>

    <h1>Attendee Input</h1>
    <form:form commandName="attendee" method="post">
        <form:errors path="*" cssClass="errorBlock" element="div" />
        <label for="textInput1"><spring:message code="enter.name" /></label>
        <form:input id="textInput1" path="name" cssErrorClass="error" />
        <br />
        <label for="textInput2"><spring:message code="enter.email" /> </label>
        <form:input id="textInput2" path="email" cssErrorClass="error" />
        <br />
        <input type="submit" value="Enter Attendee" />
    </form:form>
</body>
</html>
