package com.yeabsira.ex2;

public class Calcolatrice {
	
	public Calcolatrice() {}
	
	public double somma(double a , double b) {
		double som = a + b;
		return som;
	}
	
	public double sottrazione(double a , double b) {
		double sott = a - b;
		return sott;
	}
	
	public double divisione(double a , double b) {
		
		if(b==0) {
			throw new IllegalArgumentException("Non puoi dividere per zero ");
		}
		return a / b;
	}
	
	public double potenza(double a , double b) {
		double pot = Math.pow(a, b);
		return pot;
	}
	
	public double media(double a , double b) {
		double med = (a + b) / 2;
		return med;
	}

}
