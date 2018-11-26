<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User info</title>
</head>
<body>
<h1>Details for user ${user.name}:</h1>
<br/>
<table>
    <td>
        <th>id</th>
        <th>name</th>
        <th>email</th>
        <th>age</th>
    </td>
    <td>
        <tr>${user.id}</tr>
        <tr>${user.name}</tr>
        <tr>${user.email}</tr>
        <tr>${user.age}</tr>
    </td>
</table>
</body>
</html>