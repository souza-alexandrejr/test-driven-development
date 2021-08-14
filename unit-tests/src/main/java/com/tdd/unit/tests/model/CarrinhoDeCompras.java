package com.tdd.unit.tests.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	public CarrinhoDeCompras() {
		super();
		this._produtos = new ArrayList<Produto>();
	}
	
	public void adiciona(Produto produto) {
		this._produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return _produtos;
	}

	public double getTotal() {
		return _total;
	}

	public void setItens(List<Produto> produtos) {
		this._produtos = produtos;
	}

	public void setTotal(double total) {
		this._total = total;
	}

	private List<Produto> _produtos;
	
	private double _total;

}
