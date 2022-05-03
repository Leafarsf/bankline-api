package com.dio.santander.banklineapi.model;

public class Correntista {
	private Iteger id;
	private String cpf;
	private String nome;
	
	private Conta conta;
	public Conta getConta() {
		return conta;
	}
	public Iteger getId() {
		return id;
	}
	public void setId(Iteger id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
