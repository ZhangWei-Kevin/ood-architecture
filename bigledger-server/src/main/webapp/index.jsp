<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="asia.wavelet.bigledger.system.common.StringUitls"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<body>
<h2> ${ctx}</h2>
<%=
   StringUitls.getHello()
%>
</body>
</html>
