<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Countries</title>
</head>
<body>

<h1>Countries for ${region}</h1>
<table border=1>

<tr>
<th>Country</th>
<th>Region</th>
<th>Continent</th>
</tr>

<#list countries as country>
<tr>
<td>${country.name}</td>
<td>${country.region}</td>
<td>${country.continent}</td>
</tr>
</#list>
</table>


</body>
</html>