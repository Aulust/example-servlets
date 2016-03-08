<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>JSP Page</title>
</head>

<body>
    <c:out value="Jetty JSP Example"></c:out>
    <br />
    Current date is: <%=new java.util.Date()%>
</body>
</html>
