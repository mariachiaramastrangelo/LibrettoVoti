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
	public boolean add(Voto v) {
		//questa è la soluzione più giusta perché se si modifica la classe voto
		//con questa soluzione sono a posto e posso interagire anzi devo con le classi sapendo il meno possibile delle classi
		if(!this.esisteGiaVoto(v) && !this.votoInConflitto(v)) {
			voti.add(v); //per ordine di inserimento, aggiunge nuovo voto al libretto
			return true;
		}else {
			return false;
		}
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
	public Voto cercaEsame(String nomeEsame) {
		//indexOf vuole un oggetto dello stesso tipo degli elementi della lista
		//per usare indexOf posso usare un trucco ovvero creo un oggetto parzialmente costruito
		//e quindi glielo passo come parametro perché tanto il metodo equals è consultato 
		//dal metodo indexOf --> uso interfacce di più alto livello 
		Voto voto= new Voto(0, nomeEsame, null);
		int pos= voti.indexOf(voto);
		if(pos==-1)
			return null;
		else
			return voti.get(pos);
	}
	/**
	 * Dato un {@link Voto} determina se esiste già un voto con uguale corso ed uguale punteggio
	 * 
	 * @param v
	 * @return {@code true} se ha trovato un corso e punteggio uguali
	 * 		{@code false} se non ha trovato il corso o se l'ha trovato con voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
//		Voto trovato= this.cercaEsame(v.getCorso());
//			if(trovato==null) {
//				return false;
//			}
//			if(trovato.getPunti()==v.getPunti()) {
//				return true;
//			}else {
//				return false;
//			}
		
		int pos= this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			return (v.getPunti()==voti.get(pos).getPunti());
	}
	public boolean votoInConflitto(Voto v) {
		
		int pos= this.voti.indexOf(v);
		if(pos==-1)
			return false;
		else 
			return (v.getPunti()!=voti.get(pos).getPunti());
	}
}
