package com.tdd.unit.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenorTest {
	
	/*
	 * Cenarios a serem testados:
	 * 	- Produtos com valores em ordem crescente
	 * 	- Produtos com valores em ordem variada
	 * 	- Um unico produto no carrinho
	 */
	
	@Test
	public void apenasUmProduto() {
		Produto produto = new Produto("Geladeira", 450.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(produto);

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(produto, algoritmo.getMenor());
		assertEquals(produto, algoritmo.getMaior());
	}
	
	@Test
	public void ordemDescrescente() {
		Produto produto1 = new Produto("Geladeira", 450.0);
		Produto produto2 = new Produto("Liquificador", 250.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(produto1);
		carrinhoDeCompras.adiciona(produto2);
		carrinhoDeCompras.adiciona(produto3);
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(produto3, algoritmo.getMenor());
		assertEquals(produto1, algoritmo.getMaior());
	}
	
	@Test
	public void ordemVariada() {
		Produto produto1 = new Produto("Liquificador", 250.0);
		Produto produto2 = new Produto("Geladeira", 450.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(produto1);
		carrinhoDeCompras.adiciona(produto2);
		carrinhoDeCompras.adiciona(produto3);
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(produto3, algoritmo.getMenor());
		assertEquals(produto2, algoritmo.getMaior());
	}

}
