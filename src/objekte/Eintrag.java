/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt einen Eintrag im Klassenbuch.
 * Ein Eintrag enthält:
 * - ein Datum
 * - einen Inhalt
 * - eine Liste von Methodiken
 * - eine Referenz zum Klassenbuch
 */
package objekte;

import java.time.LocalDate;
import java.util.ArrayList;

public class Eintrag extends MutterObjekt {
	
	private LocalDate datum;
	private String inhalt;
	private ArrayList<Methodik> methodik = new ArrayList<>();

	private Klassenbuch klassenbuch;
	
	/**
     * Standardkonstruktor
     * Setzt das Datum automatisch auf das aktuelle Datum
     */
	
	public Eintrag() {
		this(LocalDate.now());
	}
	 /**
     * Konstruktor mit Datum
     * 
     * @param datum Datum des Eintrags
     */
	public Eintrag(LocalDate datum) {
	    super();
		this.datum = datum;
		methodik = new ArrayList<Methodik>();
	    
	}
	 /**
     * Gibt alle Informationen als String zurück
     */
	
	@Override
	public String toString() {
	    String info = "Eintrag vom " + datum;

	    if (klassenbuch != null) {
	        info += " der Gruppe " + klassenbuch.getGruppe().getName();
	    }

	    info += "\nInhalt: " + inhalt;
	    info += "\nMethodik: " + methodik;

	    return info;
	}
	
	 /**
     * Fügt eine Methodik hinzu
     */
	public void addMethodik(Methodik m) {
	    methodik.add(m);
	}
	
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public String getInhalt() {
		return inhalt;
	}
	public void setInhalt(String inhalt) {
		this.inhalt = inhalt;
	}
	public ArrayList<Methodik> getMethodik() {
		return methodik;
	}
	public void setMethodik(ArrayList<Methodik> methodik) {
		this.methodik = methodik;
	}
	 /**
     * Setzt das Klassenbuch (Verbindung)
     */
	public void setKlassenbuch(Klassenbuch klassenbuch) {
		 this.klassenbuch = klassenbuch;
		
	}
	 /**
     * Gibt das Klassenbuch zurück
     */
	
	public Klassenbuch getKlassenbuch() {
	    return klassenbuch;
	}
	
	//Getters und Setters Alt + Hochtaste + s
	
	

}
