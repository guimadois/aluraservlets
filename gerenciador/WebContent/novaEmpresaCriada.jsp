<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
	    	 
%>
<% 
   String nomeEmpresa = "Google";
   System.out.println("Scriptlet: " + nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova Empresa Criada</title>
</head>
<body>
		<!--  Empresa <% out.println(nomeEmpresa);%> cadastrada com sucesso! -->
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body>
</html>