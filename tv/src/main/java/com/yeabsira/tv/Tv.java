package com.yeabsira.tv;

import java.util.Scanner;

import org.apache.log4j.Logger;


public class Tv {
	
	final static Logger logger = Logger.getLogger(Tv.class);
	private int canale;
	
	public static void main(String[] args) {
		Tv obj = new Tv();
		obj.stampaCanale();
		obj.settaCanale();
	}
	
	Scanner console = new Scanner(System.in);
	
	public void stampaCanale() {
		
		try {
			logger.info("STAI GUARDANDO CANALE 7");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void settaCanale() {
		try {
			System.out.println("Vuoi cambiare canale? Insersci di seguito...");
			canale = console.nextInt();
			System.out.println("Ora stai guardando canale  " + canale );
		} catch (Exception e) {
			logger.error("Non hai inserito un valore numerico");
		}
	}

}
