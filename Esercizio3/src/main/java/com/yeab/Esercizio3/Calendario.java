package com.yeab.Esercizio3;

import java.util.ArrayList;
import java.util.List;


public class Calendario {
	
	private String nome;
	private String descrizione;
	private List<Evento> eventi = new ArrayList<Evento>();
	
	
	// costruttore vuoto e con parametri
	public Calendario() {}
	
	public Calendario(String nome, String descrizione, List<Evento> eventi) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.eventi = eventi;
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

	public List<Evento> getEventi() {
		return eventi;
	}

	public void setEventi(List<Evento> eventi) {
		this.eventi = eventi;
	}
	
	// metodo add
	public void add(Evento e) {
		 eventi.add(e) ;
	}
	
	// metodo remove
	public void remove(Evento e) {
		for(int i = 0; i < eventi.size(); i++) {
			if( e.getAnno() == eventi.get(i).getAnno() &&
				e.getGiorno() == eventi.get(i).getGiorno() && 
				e.getMese() == eventi.get(i).getMese() &&
				e.getNome() == eventi.get(i).getNome()
					) {
				eventi.remove(i);
			}
		}
	}
	
	// metodo per visualizzare
	public void visEvCal() {
		for(int i=0; i< eventi.size();i++) {
			System.out.println("Di seguito : " +
					eventi.get(i).getNome()+
					eventi.get(i).getDescrizione()+
					eventi.get(i).getMese()+
					eventi.get(i).getGiorno()+
					eventi.get(i).getAnno()	);
		}
	}

}
