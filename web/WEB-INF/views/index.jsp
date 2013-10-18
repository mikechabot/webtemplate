<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Template</title>
  </head>
  <body>
  	 <c:if test="${not empty jSessionId}">
  		JSESSIONID=<c:out value="${jSessionId}"/> 
  	 </c:if>
	 <c:if test="${empty jSessionId}">
	 	This request was sent without a JSESSIONID. Hit refresh or <a href="/index.jsp">click here</a>.
	 </c:if>
  </body>
</html>
