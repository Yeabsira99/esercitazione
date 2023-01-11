package com.yeab.Esercizio3;

import java.util.List;

public class Evento {
	
	private String nome;
	private String descrizione;
	private String mese;
	private int giorno;
	private int anno;
	
	// costruttore vuoto
	public Evento() {}
	
	// costruttore con parametri
	public Evento(String nome, String descrizione, String mese, int giorno, int anno) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.mese = mese;
		this.giorno = giorno;
		this.anno = anno;
	}

	// getter & setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}
	
}
