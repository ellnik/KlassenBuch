/**
 * @author Olena Nikolaienko
 * 
 * Dieses Interface definiert eine Methode zum Speichern
 * eines Eintrags in einer Datei.
 */
package persistence;

import objekte.Eintrag;

public interface DataSaver {
	  /**
     * Speichert eine Instanz der Klasse Eintrag in eine Textdatei
     * 
     * @param eintrag Eintrag, der gespeichert werden soll
     * @return Fehlermeldung, wenn das Speichern fehlgeschlagen ist,
     *         sonst null
     */
	
	public String save(Eintrag eintrag);

}
