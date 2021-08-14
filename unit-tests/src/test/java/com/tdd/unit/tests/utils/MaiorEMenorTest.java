package com.tdd.unit.tests.utils;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenorTest {
	
	public static void main(String[] args) {
		
		// Definicao do Cenario
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adiciona(new Produto("Geladeira", 450.0));
		carrinhoDeCompras.adiciona(new Produto("Liquificador", 250.0));
		carrinhoDeCompras.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		// Execucao de uma acao
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		
		algoritmo.encontra(carrinhoDeCompras);
		
		// Validacao dos resultados
		
		System.out.println("O menor produto: " + algoritmo.getMenor().getNome());
		System.out.println("O maior produto: " + algoritmo.getMaior().getNome());
	}

}
