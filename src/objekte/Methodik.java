/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt eine Methodik.
 * Eine Methodik ist z.B.:
 * - Teamwork
 * - Selbstlernen
 */
package objekte;

public class Methodik extends MutterObjekt {
	
	private String name;
	private String beschreibung;
	public String getName() {
		return name;
	}
	  /**
     * Standardkonstruktor
     */
	public Methodik() {
		super();
	}
	
	   /**
     * Konstruktor mit Name
     * 
     * @param name Name der Methodik
     */
	public Methodik(String name) {
		super();
		this.name = name;
	}
	
	
	 /**
     * Setzt den Namen
     */
	public void setName(String name) {
		this.name = name;
	}
	
	 /**
     * Gibt die Beschreibung zurück
     */
	public String getBeschreibung() {
		return beschreibung;
	}
	
	  /**
     * Setzt die Beschreibung
     */
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	
	 /**
     * Gibt nur den Namen zurück (für schöne Ausgabe)
     */
	@Override
	public String toString() {
		return name;
	}
	
	

}
