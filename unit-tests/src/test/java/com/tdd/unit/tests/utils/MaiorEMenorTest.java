package com.tdd.unit.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.tdd.unit.tests.builder.CarrinhoDeComprasBuilder;
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
	public void deveRetornarValorDoItem_CarrinhoComApenasUmElemento() {
		// garante que o carrinho está vazio
		assertEquals(0, carrinhoDeCompras.getItens().size());
				
		Produto produto = new Produto("Geladeira", 450.0);
		
		Item item = new Item(produto, 1);
		
		CarrinhoDeComprasBuilder builder = new CarrinhoDeComprasBuilder();
		
		carrinhoDeCompras = builder.adicionarItens(item).build();
		
		assertEquals(1, carrinhoDeCompras.getItens().size());
		assertEquals(item, carrinhoDeCompras.getItens().get(0));

		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item, algoritmo.getMenor());
		assertEquals(item, algoritmo.getMaior());
	}
	
	@Test
	public void deveRetornarNull_CarrinhoVazio() {
		MaiorEMenor algoritmo = new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertNull(algoritmo.getMenor());
		assertNull(algoritmo.getMaior());
	}
	
	@Test
	public void deveRetornarMaiorValor_CarrinhoContemMuitosElementos_OrdemDecrescente() {
		// garante que o carrinho está vazio
		assertEquals(0, carrinhoDeCompras.getItens().size());
		
		Produto produto1 = new Produto("Geladeira", 450.0);
		Produto produto2 = new Produto("Liquificador", 250.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 1);
		Item item3 = new Item(produto3, 3);
		
		CarrinhoDeComprasBuilder builder = new CarrinhoDeComprasBuilder();
		
		carrinhoDeCompras = builder.adicionarItens(item1, item2, item3).build();
		
		assertEquals(3, carrinhoDeCompras.getItens().size());
		assertEquals(item1, carrinhoDeCompras.getItens().get(0));
		assertEquals(item2, carrinhoDeCompras.getItens().get(1));
		assertEquals(item3, carrinhoDeCompras.getItens().get(2));
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item3, algoritmo.getMenor());
		assertEquals(item1, algoritmo.getMaior());
	}
	
	@Test
	public void deveRetornarMaiorValor_CarrinhoContemMuitosElementos_OrdemVariada() {
		// garante que o carrinho está vazio
		assertEquals(0, carrinhoDeCompras.getItens().size());
		
		Produto produto1 = new Produto("Liquificador", 250.0);
		Produto produto2 = new Produto("Geladeira", 450.0);
		Produto produto3 = new Produto("Jogo de Pratos", 70.0);
		
		Item item1 = new Item(produto1, 2);
		Item item2 = new Item(produto2, 1);
		Item item3 = new Item(produto3, 3);
		
		CarrinhoDeComprasBuilder builder = new CarrinhoDeComprasBuilder();
		
		carrinhoDeCompras = builder.adicionarItens(item1, item2, item3).build();

		assertEquals(3, carrinhoDeCompras.getItens().size());
		assertEquals(item1, carrinhoDeCompras.getItens().get(0));
		assertEquals(item2, carrinhoDeCompras.getItens().get(1));
		assertEquals(item3, carrinhoDeCompras.getItens().get(2));
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		algoritmo.encontra(carrinhoDeCompras);
		
		assertEquals(item3, algoritmo.getMenor());
		assertEquals(item1, algoritmo.getMaior());
	}
	
	@BeforeEach
	public void init() {
		carrinhoDeCompras = new CarrinhoDeCompras();
	}
	
	private CarrinhoDeCompras carrinhoDeCompras;

}
