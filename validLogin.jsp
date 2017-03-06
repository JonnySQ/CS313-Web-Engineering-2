<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <h2>Create new post!</h2>
    <body>
        <form method="GET" action="CreateDiscussionPost">
        Topic: <input type="text" name="txtTopic" /><br />
        Content: <input type="text" name="txtContent" /><br />
        <input type="submit" value="Submit" />
    </form>   
    </body>
</html>
