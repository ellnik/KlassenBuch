/**
 * @author Olena Nikolaienko
 * 
 * Basisklasse für alle Objekte im Projekt.
 * 
 * Diese Klasse enthält eine eindeutige ID,
 * die dem Primärschlüssel in einer relationalen Datenbank entspricht.
 */
package objekte;

public abstract class MutterObjekt {
	
	 /**
     * Eindeutige ID des Objekts (Primary Key)
     */
	private int id; 
	
	/**
     * Gibt die ID zurück
     * 
     * @return ID des Objekts
     */
	public int getId() {
		return id;
	}
	
	 /**
     * Setzt die ID
     * 
     * @param id neue ID
     */
	public void setId(int id) {
		this.id = id;
	}

}
