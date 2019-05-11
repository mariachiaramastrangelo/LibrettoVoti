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
	
	//questa è un esempio di delega
	public void add(Voto v) {
		//questa è la soluzione più giusta perché se si modifica la classe voto
		//con questa soluzione sono a posto e posso interagire anzi devo con le classi sapendo il meno possibile delle classi
		voti.add(v); //per ordine di inserimento, aggiunge nuovo voto al libretto
	}
	//questo è il modo migliore per cercare voti in un libretto perché questa classe non si deve occupare di formattazione
	//ma solo di gestire i dati
	
	/**
	 * Seleziona un sottoinsieme di voti che hanno il puntegio specificato
	 * @param punti da ricercare
	 * @return lista di {@link Voto} aventi quel punteggio
	 */
	public List<Voto> CercaVoti(int punti){
		List<Voto> result= new ArrayList<Voto>();
		for(Voto v: this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
}
