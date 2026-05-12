/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse dient zum Testen der Klasse Gruppe.
 * Es wird eine Liste von Studenten erstellt und
 * einer Gruppe zugewiesen.
 */
package tests;

import java.util.Arrays;
import java.util.List;

import objekte.Gruppe;

public class TestGruppe {
	

    /**
     * Hauptmethode zum Testen der Gruppe
     */
	public static void main(String[] args) {
		
		 // Array mit Namen erstellen
		String[] leute = {"Anna", "Boris", "Cezar", "Dora"};
		
		// Array in Liste umwandeln
		List<String> studenten = Arrays.asList(leute);
		
		// Gruppe erstellen
		Gruppe gr = new Gruppe("U29", "AE");
		
		 // Studenten setzen
		gr.setStudenten(studenten);
		
		// Ausgabe
		System.out.println();
	}

}
