package br.com.alura.gerenciador.servlet.model;

public class Empresa {

	private Integer id;
	private String nome;
	
	public Empresa(String nomeEmpresa) {
		this.nome = nomeEmpresa;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
