<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <img src="murachlogo.jpg" alt="Murach Logo">

    <h2>Survey</h2>
    <p>Please fill out the survey below:</p>

    <form action="emailList" method="post">
        <input type="hidden" name="action" value="add">

        <label>First Name:</label>
        <input type="text" name="firstName"><br>

        <label>Last Name:</label>
        <input type="text" name="lastName"><br>

        <label>Email:</label>
        <input type="email" name="email"><br>

        <label>Date of Birth:</label>
        <input type="text" name="dob"><br>

        <h3>How did you hear about us?</h3>
        <input type="radio" name="hearAbout" value="search" checked> Search engine<br>
        <input type="radio" name="hearAbout" value="word"> Word of mouth<br>
        <input type="radio" name="hearAbout" value="social"> Social Media<br>
        <input type="radio" name="hearAbout" value="other"> Other<br>

        <h3>Would you like to receive announcements?</h3>
        <input type="checkbox" name="offers" value="yes"> YES, I'd like that.<br>
        <input type="checkbox" name="emailOffers" value="yes"> YES, send email announcements.<br>

        <label>Preferred Contact:</label>
        <select name="contact">
            <option>Email or postal mail</option>
            <option>Email only</option>
            <option>Postal mail only</option>
        </select><br><br>

        <input type="submit" value="Join Now">
    </form>

    <%@ include file="includes/footer.jsp" %>
</body>
</html>
