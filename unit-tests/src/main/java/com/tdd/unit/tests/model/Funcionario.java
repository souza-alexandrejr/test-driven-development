package com.tdd.unit.tests.model;

public class Funcionario {
	
	public Funcionario(Cargo cargo, String nome, double salario) {
		super();
		this._cargo = cargo;
		this._nome = nome;
		this._salario = salario;
	}
	
	public Cargo getCargo() {
		return _cargo;
	}

	public String getNome() {
		return _nome;
	}

	public double getSalario() {
		return _salario;
	}

	private Cargo _cargo;
	private String _nome;
	private double _salario;

}
