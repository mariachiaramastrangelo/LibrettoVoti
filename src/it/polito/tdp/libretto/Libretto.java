package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {
	//definisci le variabili nel modo più generale possibile
	private List<Voto> voti;
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	//ho due ipotesi per l'aggiunta
	public void add(int voto, String corso, LocalDate data) {
		
	}
	public void add(Voto v) {
		//questa è la soluzione più giusta perché se si modifica la classe voto
		//con questa soluzione sono a posto 
		
	}
}
