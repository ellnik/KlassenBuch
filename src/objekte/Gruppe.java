/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt eine Gruppe.
 * Eine Gruppe hat einen Namen (z.B. U29) und einen Bildungsgang (z.B. AE).
 * Außerdem enthält sie eine Liste von Studenten.
 */
package objekte;
 
import java.util.ArrayList;
import java.util.List;
 
public class Gruppe extends MutterObjekt {
	
	// Name der Gruppe (z.B. U29)
	private String name; 
	
	// Bildungsgang der Gruppe (z.B. AE)
	private String bildungsgang; 
	
	// Liste der Studenten in der Gruppe
	private List<?> studenten; 
	
	/**
	 * Konstruktor der Klasse Gruppe
	 * Initialisiert Name, Bildungsgang und Studentenliste
	 * 
	 * @param name Name der Gruppe
	 * @param bildungsgang Bildungsgang der Gruppe
	 */
	public Gruppe(String name, String bildungsgang) {		
		super();
		this.name = name;
		this.bildungsgang = bildungsgang;
		studenten = new ArrayList<>();
	}
	/**
	 * Gibt den Namen der Gruppe zurück
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setzt den Namen der Gruppe
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Gibt den Bildungsgang zurück
	 */
	public String getBildungsgang() {
		return bildungsgang;
	}
	/**
	 * Setzt den Bildungsgang
	 */
	public void setBildungsgang(String bildungsgang) {
		this.bildungsgang = bildungsgang;
	}
	/**
	 * Gibt die Studentenliste zurück
	 */
	public List<?> getStudenten() {
		return studenten;
	}
	/**
	 * Setzt die Studentenliste
	 */
	public void setStudenten(List<?> studenten) {
		this.studenten = studenten;
	}

	@Override
	public String toString() {
		return "Gruppe [name=" + name + ", bildungsgang=" + bildungsgang + ", studenten=" + studenten + "]";
	}
	
	
}
 
 