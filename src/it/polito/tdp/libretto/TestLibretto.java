package it.polito.tdp.libretto;

import java.time.LocalDate;

/** questa classe serve a testare tutte le funzioni implementate
 * il suo vantaggio è che sono sicuro di non usare dati privati
 * oltre al fatto che il main è un metodo statico quindi non si riuscirebbe 
 * a prendere le variabili istanza
 * @author macbook
 *
 */
public class TestLibretto {

	public static void main(String[] args) {
		
		Libretto libr=new Libretto();
		
		libr.add(new Voto(22, "Analisi I", LocalDate.of(2017, 1, 22)));
		libr.add(new Voto(28, "Analisi II", LocalDate.of(2018, 6, 18)));
		libr.add(new Voto(22, "Diritto", LocalDate.of(2019, 1, 15)));
		libr.add(new Voto(18, "Fisica II", LocalDate.of(2018, 2, 15)));
		libr.add(new Voto(19, "Ricerca Operativa", LocalDate.of(2018, 9, 23)));
		libr.add(new Voto(18, "Statistica", LocalDate.of(2018, 1, 30)));
		libr.add(new Voto(30, "Programmazione a Oggetti", LocalDate.of(2019, 1, 22)));
		libr.add(new Voto(22, "Geometria", LocalDate.of(2017, 9, 6)));

	}

}
