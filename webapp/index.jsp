<%--

--%>

<%--This is a page directive, that will apply to the entire page--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>"

<%--Lets take a look at an instance variable, and like servlet vars, this will continue between page loads--%>
<%! int counter = 0; %>



<%-- lets increment page counter --%>
<% counter += 1; %>

