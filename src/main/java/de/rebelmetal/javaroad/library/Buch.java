package de.rebelmetal.javaroad.library;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;
    private int seitenzahl = 0;

    /** Parametriesierter Konstruktor initialisiert neue Buch-Objekte */
    public Buch (String titel,String autor,String isbn) {
        this.titel=titel;
        this.autor=autor;
        this.isbn=isbn;
    }
    /** Gibt den Titel des Buches zurück
     * @return  Der Titel des Buches.
     * */
    public String getTitel() {
        return titel;
    }
    /** Gibt den Autor des Buches zurück
     * @return  Der Autor des Buches.
     * */
    public String getAutor() {
        return autor;
    }
    /** Gibt die ISBN des Buches zurück
     * @return  Die ISBN des Buches.
     * */
    public String getIsbn() {
        return isbn;
    }
    /** Gibt die Seitenzahl des Buches zurück
     * @return  Die Seitenzahl des Buches.
     * */
    public int getSeitenzahl() {
        return seitenzahl;
    }
    /** Setzt die Seitenzahl des Buches und überpüft die Gültigkeit der Eingabe, bei ungültigkeit wird eine Fehlermeldung geworfen.
     * @param seitenzahl Die neue Seitenzahl
     * */
    public void setSeitenzahl(int seitenzahl) {

        if (seitenzahl <= 0) {
            System.out.println("Fehler: Seitenzahl muss positiv sein");
        } else
        this.seitenzahl = seitenzahl;
    }
}

