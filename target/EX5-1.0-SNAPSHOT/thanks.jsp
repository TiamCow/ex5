
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey Result</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="result-box">
        <h1>Thanks for filling out our survey!</h1>

        <p>Your information:</p>
        <label>Email:</label> ${user.email}<br>
        <label>First Name:</label> ${user.firstName}<br>
        <label>Last Name:</label> ${user.lastName}<br>
        <label>Date of Birth:</label> ${user.dob}<br>
        <label>Heard About:</label> ${user.hearAbout}<br>
        <label>Offers:</label> ${user.offers}<br>
        <label>Email Offers:</label> ${user.emailOffers}<br>
        <label>Contact:</label> ${user.contact}<br>

        <hr>
        <h3>Current Date:</h3>
        ${currentDate}<br>

        <h3>First Two Users:</h3>
        <c:if test="${not empty userList}">
            <p>User 1: ${userList[0].firstName} ${userList[0].lastName}</p>
        </c:if>
        <c:if test="${userList.size() > 1}">
            <p>User 2: ${userList[1].firstName} ${userList[1].lastName}</p>
        </c:if>

        <h3>Customer Service Email:</h3>
        ${initParam.custServEmail}<br><br>

        <form action="index.jsp" method="get">
            <input type="submit" value="Return">
        </form>
    </div>

    <%@ include file="includes/footer.jsp" %>
</body>
</html>
