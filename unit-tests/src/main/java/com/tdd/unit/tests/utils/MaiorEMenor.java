package com.tdd.unit.tests.utils;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenor {
	
	public void encontra(CarrinhoDeCompras carrinhoDeCompras) {
		for (Produto produto : carrinhoDeCompras.getProdutos()) {
			if (_menor == null || produto.getValor() < _menor.getValor()) {
				_menor = produto;
			}
			
			if (_maior == null || produto.getValor() > _maior.getValor()) {
				_maior = produto;
			}
		}
	}
	
	public Produto getMaior() {
		return _maior;
	}
	
	public Produto getMenor() {
		return _menor;
	}
	
	private Produto _maior;
	
	private Produto _menor;

}
