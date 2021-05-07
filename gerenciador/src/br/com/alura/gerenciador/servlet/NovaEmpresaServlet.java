package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.model.Banco;
import br.com.alura.gerenciador.servlet.model.Empresa;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(">>> cadastro nova empresa...");
		
		String nomeEmpresa = request.getParameter("nomeEmpresa");
		
		Empresa empresa = new Empresa(nomeEmpresa);
		
		Banco banco = new Banco();
		
		banco.adicionaBanco(empresa);
		
		System.out.println(">>> Empresa " + nomeEmpresa + " cadastrada com sucesso!");
		
		// chamar JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		request.setAttribute("nomeEmpresa", empresa.getNome());
		
		dispatcher.forward(request, response);
	}
}
