package br.com.alura.gerenciador.servlet.model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa("Google");
		listaEmpresas.add(empresa);
		empresa = new Empresa("Amazon");
		listaEmpresas.add(empresa);

	}
	public void adicionaBanco(Empresa empresa) {
		Banco.listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}
}
