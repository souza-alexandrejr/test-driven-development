package com.tdd.unit.tests.utils;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenorTest {
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adiciona(new Produto("Liquificador", 250.0));
		carrinhoDeCompras.adiciona(new Produto("Geladeira", 450.0));
		carrinhoDeCompras.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		
		algoritmo.encontra(carrinhoDeCompras);
		
		System.out.println("O menor produto: " + algoritmo.getMenor().getNome());
		System.out.println("O maior produto: " + algoritmo.getMaior().getNome());
	}

}
