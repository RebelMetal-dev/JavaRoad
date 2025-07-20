package de.rebelmetal.javaroad.library;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;
    private int seitenzahl;

    /** Parametriesierter Konstruktor initialisiert neue Buch-Objekte */
    public Buch (String titel,String autor,String isbn) {
        this.titel=titel;
        this.autor=autor;
        this.isbn=isbn;
    }
    /** Gibt den Titel des Buches zurück */
    public String getTitel() {
        return titel;
    }
    /** Gibt den Autor des Buches zurück */
    public String getAutor() {
        return autor;
    }
    /** Gibt die ISBN des Buches zurück */
    public String getIsbn() {
        return isbn;
    }
    /** Gibt die Seitenzahl des Buches zurück */
    public int getSeitenzahl() {
        return seitenzahl;
    }
    /** Setzt die Seitenzahl des Buches und überpüft die Gültigkeit der Eingabe, bei ungültigkeit wird eine Fehlermeldung geworfen. */
    public void setSeitenzahl(int seitenzahl) {

        if (seitenzahl <= 0) {
            System.out.println("Fehler: Seitenzahl muss positiv sein");
        } else
        this.seitenzahl = seitenzahl;
    }
}

