<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Ae</a>
<form action="/a" method="post">
    <input type="text" name="id">
    <input type="text" name="name">
    <input type="text" name="score">
    <button>Save</button>
</form>
<h1>${X}</h1>
</body>
</html>