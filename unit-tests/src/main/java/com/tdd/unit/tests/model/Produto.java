package com.tdd.unit.tests.model;

public class Produto {
	
	public Produto(String _nome, double _valor) {
		super();
		this._nome = _nome;
		this._valor = _valor;
	}

	public String getNome() {
		return _nome;
	}

	public double getValor() {
		return _valor;
	}
	
	public void setNome(String nome) {
		this._nome = nome;
	}

	public void setValor(double valor) {
		this._valor = valor;
	}

	private String _nome;
	
	private double _valor;

}
