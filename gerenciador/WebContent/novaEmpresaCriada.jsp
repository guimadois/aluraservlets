<%@ page language="java" 
         contentType="text/html; charset=UTF-8"
    	 pageEncoding="UTF-8"
	    	 
%>
<% 
   String nomeEmpresa = (String) request.getAttribute("nomeEmpresa");
   System.out.println("Scriptlet, nova empresa: " + nomeEmpresa);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova Empresa Criada: <%=nomeEmpresa %></title>
</head>
<body>
		<!--  Empresa <% out.println(nomeEmpresa);%> cadastrada com sucesso! -->
		Empresa <%= nomeEmpresa %> cadastrada com sucesso!
</body>
</html>