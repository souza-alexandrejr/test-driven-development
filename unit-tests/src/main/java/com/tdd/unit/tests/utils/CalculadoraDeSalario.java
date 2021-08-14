package com.tdd.unit.tests.utils;

import com.tdd.unit.tests.model.Cargo;
import com.tdd.unit.tests.model.Funcionario;

public class CalculadoraDeSalario {
	
	/*
	 * Regra de Negocio:
	 * 	- Desenvolvedores possuem 20% de desconto caso seu salário 
	 *    seja maior do que R$ 3000,0. Caso contrário, o desconto é de 10%.
	 *  - DBAs e testadores possuem desconto de 25% se seus salários forem maiores
	 *	  do que R$ 2500,0. 15%, em caso contrário.
	 */
	
	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
			if (funcionario.getSalario() > 3000) { 
				return funcionario.getSalario() * 0.8;
			}
			else {
				return funcionario.getSalario() * 0.9;
			}
		}
		else if (funcionario.getCargo().equals(Cargo.DBA) || 
				 funcionario.getCargo().equals(Cargo.TESTADOR)) {
			if (funcionario.getSalario() > 2500) {
				return funcionario.getSalario() * 0.75;
			} 
			else {
				return funcionario.getSalario() * 0.85;
			}
		}
		else {
			return -1;
		}
	}

}
