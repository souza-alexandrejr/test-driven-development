package com.tdd.unit.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Item;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenorTest {
	
	/*
	 * Cenarios a serem testados:
	 * 	- Produtos com valores em ordem crescente
	 * 	- Produtos com valores em ordem variada
	 * 	- Um unico produto no carrinho
	 *  - Um carrinho sem nenhum item
	 */
	
	@Test
	public void apenasUmItem() {
		Produto produto = new Produto("Geladeira", 450.0);
		
		Item item = new Item(produto, 1);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(item);

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item, algoritmo.getMenor());
		assertEquals(item, algoritmo.getMaior());
	}
	
	@Test
	public void carrinhoVazio() {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertNull(algoritmo.getMenor());
		assertNull(algoritmo.getMaior());
	}
	
	@Test
	public void ordemDescrescente() {
		Produto produto1 = new Produto("Geladeira", 450.0);
		Produto produto2 = new Produto("Liquificador", 250.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 1);
		Item item3 = new Item(produto3, 3);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(item1);
		carrinhoDeCompras.adiciona(item2);
		carrinhoDeCompras.adiciona(item3);
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item3, algoritmo.getMenor());
		assertEquals(item1, algoritmo.getMaior());
	}
	
	@Test
	public void ordemVariada() {
		Produto produto1 = new Produto("Liquificador", 250.0);
		Produto produto2 = new Produto("Geladeira", 450.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 1);
		Item item3 = new Item(produto3, 3);
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		carrinhoDeCompras.adiciona(item1);
		carrinhoDeCompras.adiciona(item2);
		carrinhoDeCompras.adiciona(item3);
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item3, algoritmo.getMenor());
		assertEquals(item1, algoritmo.getMaior());
	}

}
