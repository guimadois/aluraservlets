package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.model.Banco;
import br.com.alura.gerenciador.servlet.model.Empresa;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet(urlPatterns = "/listaEmpresas")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();

		request.setAttribute("listEmpresas", lista);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listaEmpresas.jsp");
		dispatcher.forward(request, response);
	}

}
