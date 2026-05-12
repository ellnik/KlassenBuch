/**
 * @author Olena Nikolaienko
 * 
 * Diese Klasse beschreibt ein Klassenbuch.
 * Sie verwaltet:
 * - ein Modul
 * - eine Gruppe
 * - eine Liste von Einträgen
 */
package objekte;

import java.util.ArrayList;
import java.util.List;

public class Klassenbuch extends MutterObjekt {

    private Modul modul;
    private Gruppe gruppe;
    private List<Eintrag> eintraege;

    /**
     * Konstruktor der Klasse Klassenbuch
     * 
     * @param modul  Modul des Klassenbuchs
     * @param gruppe Gruppe des Klassenbuchs
     */
    public Klassenbuch(Modul modul, Gruppe gruppe) {
        this.modul = modul;
        this.gruppe = gruppe;
        this.eintraege = new ArrayList<>();
    }

    /**
     * Fügt einen Eintrag hinzu und setzt die Verbindung zum Klassenbuch
     */
    public void addEintrag(Eintrag e) {
        if (e == null) return;

        e.setKlassenbuch(this); // verbindung
        eintraege.add(e);
    }

    /**
     * Entfernt einen Eintrag aus der Liste
     * 
     * @return true wenn erfolgreich, sonst false
     */
    public boolean removeEintrag(Eintrag e) {
        if (e == null) return false;

        return eintraege.remove(e);
    }

    /**
     * Gibt das Modul zurück
     */
    public Modul getModul() {
        return modul;
    }
    /**
     * Gibt die Gruppe zurück
     */
    public Gruppe getGruppe() {
        return gruppe;
    }
    /**
     * Gibt alle Einträge zurück
     */
    public List<Eintrag> getEintraege() {
        return eintraege;
    }

    /**
     * Setzt die Einträge (optional)
     */
    public void setEintraege(List<Eintrag> eintraege) {
        this.eintraege = eintraege;
    }

    @Override
    public String toString() {
        return "Klassenbuch [modul=" + modul +
               ", gruppe=" + gruppe +
               ", eintraege=" + eintraege + "]";
    }
}