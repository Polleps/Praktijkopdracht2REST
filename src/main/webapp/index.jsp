<%--
  Created by IntelliJ IDEA.
  User: Polle
  Date: 2-4-2017
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>REST SERVICE</title>
</head>
<body>
    <form action="/calc/bmi/get" method="get">
        <fieldset>
            <legend>Input</legend>
            <table>
                <tr><td>Lengte (m): </td><td><input name="lengte" type="text"></td></tr>
                <tr><td>Gewicht (kg): </td><td><input name="gewicht" type="text"></td></tr>
            </table>
        </fieldset>
        <input type="submit" value="Bereken">
    </form>
</body>
</html>
