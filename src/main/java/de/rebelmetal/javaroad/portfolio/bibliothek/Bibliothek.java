package de.rebelmetal.javaroad.portfolio.bibliothek;

import java.util.*;

/**
 * Die Klasse {@code Bibliothek} verwaltet den gesamten Buchbestand der Anwendung.
 * <p>
 * Sie dient als zentraler Speicherort für {@link Buch}-Objekte
 * und stellt sicher, dass jedes Buch dank der Verwendung eines {@link Set}
 * und der eindeutigen ISBN nur einmal im Bestand vorhanden ist.
 * <p>
 */
public class Bibliothek {
    private final Set<Buch> buecher;

    /**
     * Erstellt eine neue, leere Bibliothek.
     */
    public Bibliothek(Set<Buch> buecher) {
        this.buecher = new HashSet<>();
    }

    /**
     * Fügt ein neues Buch zur Bibliothek hinzu.
     *
     * @param neuesBuch Das hinzuzufügende {@link Buch}-Objekt.
     */
    public void buchHinzufuegen(Buch neuesBuch) {
        this.buecher.add(neuesBuch);
    }

    /**
     * Sucht nach einem Buch in der Bibliothek anhand seiner ISBN.
     *
     * @param isbn Die ISBN des gesuchten Buches.
     * @return Ein {@code Optional} mit dem gefundenen Buch, oder ein leeres {@code Optional}.
     */
    public Optional<Buch> findeBuchNachIsbn(String isbn){
        return this.buecher.stream()
                .filter(buch -> buch.isbn().equals(isbn))
                .findFirst();
    }

    /**
     * Gibt eine Liste aller Bücher zurück, sortiert nach Titel.
     * <p>
     * Die Methode verwendet eine Stream-Pipeline, um das Set in eine Liste zu konvertieren
     * und diese mithilfe eines {@link Comparator} nach dem Titel zu sortieren.
     * </p>
     *
     * @return Eine nach Titel sortierte {@link List} aller Bücher.
     */
    public List<Buch> findeAlleBuecher() {
        return this.buecher.stream()
                .sorted(Comparator.comparing(Buch::titel))
                .toList();
    }



}
