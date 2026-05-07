package de.rebelmetal.javaroad.library;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;
    private int seitenzahl = 0;

    /** Parameterized constructor — initializes a new book object. */
    public Buch(String titel, String autor, String isbn) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title.
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Returns the author of the book.
     *
     * @return the author.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return the ISBN.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Returns the page count of the book.
     *
     * @return the page count.
     */
    public int getSeitenzahl() {
        return seitenzahl;
    }

    /**
     * Sets the page count of the book after validating the input.
     * Prints an error message if the value is not positive.
     *
     * @param seitenzahl the new page count.
     */
    public void setSeitenzahl(int seitenzahl) {
        if (seitenzahl <= 0) {
            System.out.println("Error: page count must be positive.");
        } else {
            this.seitenzahl = seitenzahl;
        }
    }
}
