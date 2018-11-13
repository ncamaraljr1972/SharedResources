<%@page import="org.eclipse.jetty.example.Error"%>
<html>
<%
	Error fruit = new Error();
   String description = fruit.getDescription(pageContext);
%>
</html>