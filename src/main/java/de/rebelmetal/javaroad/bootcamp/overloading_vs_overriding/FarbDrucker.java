package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

/**
 * Ein spezialisierter Drucker, der in Farbe druckt.
 *
 * Diese Klasse erbt von Drucker und demonstriert das Konzept der
 * Methoden-Überschreibung (Overriding), indem sie das Verhalten
 * der `drucken(String text)`-Methode spezialisiert.
 */
public class FarbDrucker extends Drucker {
        // Der unveränderliche Farbcode, der für den Druck verwendet wird.
        private final String farbCode;

        /**
         * Erstellt einen neuen FarbDrucker mit dem angegebenen Farbcode.
         * Der Farbcode wird nach der Erstellung nicht mehr verändert.
         *
         * @param farbCode Der String-Farbcode (z.B. Hex-Code oder Name) für diesen Drucker.
         */
        public FarbDrucker(String farbCode) {// Ruft implizit den Standardkonstruktor der Superklasse 'Drucker' auf.
                // Ruft implizit den Standardkonstruktor der Superklasse 'Drucker' auf.
                this.farbCode = farbCode;
        }

        /**
         * Überschreibt die Standard-drucken-Methode, um den Text
         * mit dem Farbcodes dieses FarbDrucker-Objekts auszugeben.
         *
         * @param text Der auf der Konsole auszugebende String.
         */
        @Override
        public void drucken(String text) {
                System.out.println("Farb-Druck ( " + farbCode + " ): " + text);
        }

}
