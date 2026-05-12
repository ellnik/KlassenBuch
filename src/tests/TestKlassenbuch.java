/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse dient zum Testen der Funktionalität
 * des Klassenbuchs.
 * 
 * Es wird geprüft:
 * - Erstellung von Modul und Gruppe
 * - Erstellung eines Klassenbuchs
 * - Hinzufügen eines Eintrags
 * - Ausgabe der Ergebnisse auf der Konsole
 */
package tests;

import objekte.Eintrag;
import objekte.Gruppe;
import objekte.Klassenbuch;
import objekte.Modul;

public class TestKlassenbuch {
	 /**
     * Hauptmethode zum Starten des Tests
     */
	public static void main(String[] args) {
		
		// Modul und Gruppe erstellen
		Modul m = new Modul("Java", 7);
		Gruppe g = new Gruppe("U29", "AE");
		
		// Klassenbuch erstellen
		Klassenbuch klBuch = new Klassenbuch(m, g);
		
		 // Ausgabe vor dem Hinzufügen eines Eintrags
		System.out.println(klBuch);
		
		 // Eintrag erstellen
		Eintrag ein = new Eintrag();
		ein.setInhalt("Wir arbeiten am Klassenbuch-Projekt");
		
		// Eintrag hinzufügen
		klBuch.addEintrag(ein);
		
		// Ausgabe nach dem Hinzufügen
		System.out.println(klBuch);
	}

}
