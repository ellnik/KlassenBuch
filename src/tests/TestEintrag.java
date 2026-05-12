/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse testet:
 * - Erstellung eines Eintrags
 * - Hinzufügen von Methodiken
 * - Verbindung mit einem Klassenbuch
 * - Speichern des Eintrags in eine Datei
 */
package tests;

import java.time.LocalDate;
import objekte.Eintrag;
import objekte.Gruppe;
import objekte.Klassenbuch;
import objekte.Methodik;
import objekte.Modul;
import persistence.DataSaver;
import persistence.SimpleFileSaver;

public class TestEintrag {
	
	/**
     * Hauptmethode zum Testen des Eintrags
     */

	public static void main(String[] args) {
		
		 // Eintrag erstellen
		Eintrag dienstag = new Eintrag();
		dienstag.setInhalt("Wir versuchen mit Objekten klarzukommen");
		
		// Methodiken hinzufügen
		Methodik method = new Methodik();
		method.setName("Teamwork");
		dienstag.addMethodik(method);
		
		dienstag.addMethodik(new Methodik("Selbermachen"));
		
		 // Ausgabe ohne Klassenbuch
		System.out.println(dienstag);
		System.out.println();
		
		// Klassenbuch erstellen und Eintrag hinzufügen
		Klassenbuch buch = new Klassenbuch(new Modul ("Java", 7), new Gruppe("Hyenen", "AE"));
		buch.addEintrag(dienstag);
		
		 // Ausgabe mit Klassenbuch
		System.out.println(dienstag);
		
		 // Eintrag speichern
		DataSaver saver = new SimpleFileSaver();
		
		String err = saver.save(dienstag);
		System.out.println("Fehler beim Speichern: " + err);
	}
}