package br.com.cleyton.pessoa;

public class Pessoa {
	private String name;
	private String cpf;
	private String endereco;
	
	//método construtor
	//o nome deverá ser igual ao nome da classe
	public Pessoa(String cpf, String name) {
		this.cpf = cpf;
		this.name = name;
	}
	
	public String getNome() {
		return this.name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getEndereco() {
		return this.endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
