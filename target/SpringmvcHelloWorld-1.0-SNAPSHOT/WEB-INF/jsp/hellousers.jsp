<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2> Backend Developers List </h2>
	

	<c:if test="${not empty map}">

		<ul>
			<c:forEach items="${map}" var="entry">

                <li><a href="usersdetails.html?id=<c:url value='${entry.key}'/>">${entry.value.getName()}</a></li>
            </c:forEach>

		</ul>

	</c:if></br>

</body>
</html>