package com.yeabsira.ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.yeabsira.ex2.Calcolatrice;



public class CalcolatriceTest {

	@Test
	void controllo() {	
		Calcolatrice cal = new Calcolatrice();
		double a = 8;
		double b = 2;
		assertEquals(a+b, cal.somma(a,b));
		assertEquals(a-b, cal.sottrazione(a, b));
		assertEquals(a/b, cal.divisione(a,b));
		assertEquals(Math.pow(a, b), cal.potenza(a,b));
		assertEquals((a+b)/2, cal.media(a,b));	
	}
	
	@Test
	void costruttore() {
		Calcolatrice cost = new Calcolatrice();
		assertSame(Calcolatrice.class, cost.getClass());
	}
	
	@Test
	void divByZero() {
		Calcolatrice dBZ = new Calcolatrice();
		double a = 8;
		double b = 0;
		IllegalArgumentException illegalArgumentException = 
				assertThrows(IllegalArgumentException.class,
				()-> dBZ.divisione(a, b));
				
		assertEquals("Non puoi dividere per zero ",
				illegalArgumentException.getMessage());
	}
	
}
