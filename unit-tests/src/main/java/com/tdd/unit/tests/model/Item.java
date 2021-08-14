package com.tdd.unit.tests.model;

public class Item {
	
	public Item(Produto produto, int quantidade) {
		super();
		this._produto = produto;
		this._quantidade = quantidade;
	}
	
	public Produto getProduto() {
		return _produto;
	}
	
	public int getQuantidade() {
		return _quantidade;
	}
	
	public double getValorTotal() {
		return this._quantidade * this._produto.getValor();
	}

	private Produto _produto;
	private int _quantidade;
	
}
