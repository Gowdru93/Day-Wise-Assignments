<!DOCTYPE html>
<html>
<head>
    <title>Student Feedback Form</title>
</head>
<body>
    <h2>Course Feedback</h2>
    <form method="post" action="SubmitFeedback">
        <label>Name:</label><br/>
        <input type="text" name="studentName" required/><br/><br/>

        <label>Email:</label><br/>
        <input type="email" name="email" required/><br/><br/>

        <label>Course Attended:</label><br/>
        <input type="text" name="course" required/><br/><br/>

        <label>Feedback/Suggestions:</label><br/>
        <textarea name="feedback" required></textarea><br/><br/>

        <input type="submit" value="Submit Feedback"/>
    </form>
</body>
</html>