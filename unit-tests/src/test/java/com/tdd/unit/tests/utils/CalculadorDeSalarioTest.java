package com.tdd.unit.tests.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.tdd.unit.tests.model.Cargo;
import com.tdd.unit.tests.model.Funcionario;

public class CalculadorDeSalarioTest {
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario dba = new Funcionario(Cargo.DBA, "Mauricio", 500.0);
	
		double salario = calculadoraDeSalario.calculaSalario(dba);
		
		assertEquals(500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario(Cargo.DBA, "Mauricio", 4000.0);
	
		double salario = calculadoraDeSalario.calculaSalario(desenvolvedor);
		
		assertEquals(4000.0 * 0.75, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDevsComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, "Mauricio", 1500.0);
	
		double salario = calculadoraDeSalario.calculaSalario(desenvolvedor);
		
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDevsComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario(Cargo.DESENVOLVEDOR, "Mauricio", 4000.0);
	
		double salario = calculadoraDeSalario.calculaSalario(desenvolvedor);
		
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaTestadoresComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario testador = new Funcionario(Cargo.TESTADOR, "Mauricio", 500.0);
	
		double salario = calculadoraDeSalario.calculaSalario(testador);
		
		assertEquals(500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaTestadoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();

		Funcionario testador = new Funcionario(Cargo.TESTADOR, "Mauricio", 4000.0);
	
		double salario = calculadoraDeSalario.calculaSalario(testador);
		
		assertEquals(4000.0 * 0.75, salario, 0.00001);
	}

}
