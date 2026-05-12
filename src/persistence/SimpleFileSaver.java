/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse speichert einen Eintrag in einer Textdatei.
 * Sie implementiert das Interface DataSaver.
 */
package persistence;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import objekte.Eintrag;

public class SimpleFileSaver implements DataSaver{
	
	 /**
     * Ordner, in dem die Dateien gespeichert werden
     */
	private static final String FOLDER = "./simple/"; 

	
	 /**
     * Speichert einen Eintrag in einer Datei
     * 
     * @param eintrag Eintrag, der gespeichert werden soll
     * @return Fehlermeldung bei Fehler, sonst null
     */
	@Override
	public String save(Eintrag eintrag) {

		String fileName = "dummy";
		if (eintrag.getKlassenbuch() != null)
		    fileName = eintrag.getKlassenbuch().getGruppe().getName();
		fileName += eintrag.getDatum();

		try {
		    FileOutputStream fileOutputStream = new FileOutputStream(FOLDER + fileName);
		    fileOutputStream.write(eintrag.toString().getBytes());
		    fileOutputStream.close();

		} catch (IOException e) {
		   return e.getMessage();
		} 

		return null;
	}

}
