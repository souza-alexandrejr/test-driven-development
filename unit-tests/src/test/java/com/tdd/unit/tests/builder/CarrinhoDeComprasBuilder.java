package com.tdd.unit.tests.builder;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Item;

public class CarrinhoDeComprasBuilder {
	
	public CarrinhoDeComprasBuilder() {
		this.carrinho = new CarrinhoDeCompras();
	}
	
	public CarrinhoDeComprasBuilder adicionarItens(Item... itens) {
		for(Item item : itens) {
			carrinho.adiciona(item);
		}
		return this;
	}
	
	public CarrinhoDeCompras build() {
		return this.carrinho;
	}
	
	private CarrinhoDeCompras carrinho;

}
