<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2> Backend Developers Details </h2>

	<c:if test="${not empty employee}">
		<ul>
		<li>${employee.getName()}</br>
		${employee.getCompany()}</br>
		${employee.getEmail()}</li>

		</ul>

	</c:if>
	${name}
	</br>
   <center><button><a href="../index.jsp">Back</a></button></center>

</body>
</html>