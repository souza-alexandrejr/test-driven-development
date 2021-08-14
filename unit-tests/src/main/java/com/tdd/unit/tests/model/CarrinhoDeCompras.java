package com.tdd.unit.tests.model;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	public CarrinhoDeCompras() {
		super();
		this._itens = new ArrayList<Item>();
	}
	
	public void adiciona(Item item) {
		this._itens.add(item);
	}
	
	public List<Item> getItens() {
		return _itens;
	}

	public double getTotal() {
		return _total;
	}

	public void setItens(List<Item> itens) {
		this._itens = itens;
	}

	public void setTotal(double total) {
		this._total = total;
	}

	private List<Item> _itens;
	
	private double _total;

}
