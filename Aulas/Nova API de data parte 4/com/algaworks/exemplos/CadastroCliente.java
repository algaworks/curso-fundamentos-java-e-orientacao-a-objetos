package com.algaworks.exemplos;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.algaworks.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("João Silva", LocalDate.of(1988, Month.AUGUST, 13));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf("OK, pode ser cadastrado. Sua idade é: %d", idade);
		} else {
			System.err.printf("Sua idade é: %d. Então não pode ter carteira.", idade);
		}
	}
}
