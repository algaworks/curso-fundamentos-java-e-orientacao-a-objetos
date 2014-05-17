package com.algaworks;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

	private Fibonacci fibonacci;
	
	@Before
	public void init() {
		fibonacci = new Fibonacci();
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_1() {
		// 1. Cenário
		long posicao = 1L;
		
		// 2. Ação
		long valor = fibonacci.calcular(posicao);
		
		// 3. Validação
		assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_2() {
		long posicao = 2L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(1L, valor);
	}
	
	@Test
	public void deve_retornar_fibonacci_posicao_0() {
		long posicao = 0L;
		
		long valor = fibonacci.calcular(posicao);
		
		assertEquals(0L, valor);
	}
	
}
