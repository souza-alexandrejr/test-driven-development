package com.tdd.unit.tests.model;

public class Produto {
	
	public Produto(String nome, double valor) {
		super();
		this._nome = nome;
		this._valor = valor;
	}
	
	public Produto(String descricao, String nome, double valor) {
		super();
		this._descricao = descricao;
		this._nome = nome;
		this._valor = valor;
	}
	
	public String getDescricao() {
		return _descricao;
	}

	public String getNome() {
		return _nome;
	}

	public double getValor() {
		return _valor;
	}
	
	public void setDescricao(String descricao) {
		this._descricao = descricao;
	}
	
	public void setNome(String nome) {
		this._nome = nome;
	}

	public void setValor(double valor) {
		this._valor = valor;
	}

	private String _descricao;
	private String _nome;
	private double _valor;

}
