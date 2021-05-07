package br.com.alura.gerenciador.servlet.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<Empresa>();
	
	static {
		
		listaEmpresas.addAll(Arrays.asList(new Empresa("Amazon"), new Empresa("Google")));
	}
	
	public void adicionaBanco(Empresa empresa) {
		Banco.listaEmpresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}
}
