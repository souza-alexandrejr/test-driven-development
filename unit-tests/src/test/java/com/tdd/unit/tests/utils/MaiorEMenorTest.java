package com.tdd.unit.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tdd.unit.tests.model.CarrinhoDeCompras;
import com.tdd.unit.tests.model.Produto;

public class MaiorEMenorTest {
	
	@Test
	public void ordemDescrescente() {
		
		// Definicao do Cenario
		
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adiciona(new Produto("Geladeira", 450.0));
		carrinhoDeCompras.adiciona(new Produto("Liquificador", 250.0));
		carrinhoDeCompras.adiciona(new Produto("Jogo de Pratos", 70.0));
		
		// Execucao de uma acao
		
		MaiorEMenor algoritmo =  new MaiorEMenor();
		
		algoritmo.encontra(carrinhoDeCompras);
		
		// Validacao dos resultados
		
		assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
		assertEquals("Geladeira", algoritmo.getMaior().getNome());
	}

}
