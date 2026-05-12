/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein Modul.
 * Ein Modul hat:
 * - einen Namen
 * - eine Nummer
 */
package objekte;

public class Modul extends MutterObjekt {
	
	private String name;
	private int nummer;
	
	 /**
     * Konstruktor der Klasse Modul
     * 
     * @param name    Name des Moduls
     * @param nummer  Nummer des Moduls
     */
	public Modul(String name, int nummer) {
	    this.name = name;
	    this.nummer = nummer;
	}
	/**
     * Gibt den Namen zurück
     */
	public String getName() {
		return name;
	}
	
	 /**
     * Setzt den Namen
     */
	public void setName(String name) {
		this.name = name;
	}
	
	 /**
     * Gibt die Nummer zurück
     */
	public int getNummer() {
		return nummer;
	}
	
	 /**
     * Setzt die Nummer
     */
	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	/**
     * Gibt das Modul als String zurück
     */
	@Override
	public String toString() {
		return "Modul [name=" + name + ", nummer=" + nummer + "]";
	}
	
	

}
