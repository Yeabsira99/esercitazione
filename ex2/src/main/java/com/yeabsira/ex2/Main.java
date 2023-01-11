package com.yeabsira.ex2;

public class Main {

	public static void main(String[] args) {
		Calcolatrice calc = new Calcolatrice();
		double a = 8;
		double b = 2;
		System.out.println("La somma e' : "+calc.somma(a,b));
		System.out.println("La sottrazione e' : "+calc.sottrazione(a,b));
		System.out.println("La divisione e' : "+calc.divisione(a,b));
		System.out.println("La potenza e' : "+calc.potenza(a,b));
		System.out.println("La media e' : "+calc.media(a,b));		

	}
}
