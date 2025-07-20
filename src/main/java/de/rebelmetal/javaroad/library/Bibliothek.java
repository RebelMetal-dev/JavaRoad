package de.rebelmetal.javaroad.library;

public class Bibliothek {
    public static void main(String[] args) {

       Buch buch1 = new Buch("Hamlet", "William Shakeseare", "978-1853260094");
       Buch buch2 = new Buch("1984", "George Orwell","978-0198185215");

       System.out.println("Titel: " +  buch1.getTitel() + "  " + "Autor: " +  buch1.getAutor() + "  " + "ISBN: " + buch1.getIsbn());

        System.out.println("---------------------------\n");

        System.out.println("Prüfen gültige Seitenzahl ");
        buch1.setSeitenzahl(100);
        System.out.println("Seitenzahl: " + buch1.getSeitenzahl());

        System.out.println("---------------------------\n");

        buch1.setSeitenzahl(-50);
        System.out.println("Seitenzahl: " + buch1.getSeitenzahl());

    }
}

