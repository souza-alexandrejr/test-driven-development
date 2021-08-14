package com.tdd.unit.tests.utils;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Item;

public class MaiorEMenor {
	
	public void encontra(CarrinhoDeCompras carrinhoDeCompras) {
		for (Item item : carrinhoDeCompras.getItens()) {
			if (_menor == null || item.getValorTotal() < _menor.getValorTotal()) {
				_menor = item;
			}
			
			if (_maior == null || item.getValorTotal() > _maior.getValorTotal()) {
				_maior = item;
			}
		}
	}
	
	public Item getMaior() {
		return _maior;
	}
	
	public Item getMenor() {
		return _menor;
	}
	
	private Item _maior;
	
	private Item _menor;

}
