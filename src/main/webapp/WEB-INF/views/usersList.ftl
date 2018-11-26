<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="scripts/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="scripts/custom.js"></script>
    <title>Title</title>
</head>
<body>
<h1>List of users</h1>
<br/>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Age</th>
    </tr>
    <#list users as user>
        <tr data-href="user/${user.id}">
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>