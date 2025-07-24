package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

/**
 * Ein spezialisierter Drucker, der in Farbe druckt.
 *
 * Diese Klasse erbt von Drucker und demonstriert das Konzept der
 * Methoden-Überschreibung (Overriding), indem sie das Verhalten
 * der `drucken(String text)`-Methode spezialisiert.
 */
public class FarbDrucker extends Drucker {
        private final String farbCode;

        public FarbDrucker(String farbCode) {
            this.farbCode = farbCode;
        }

        @Override
        public void drucken(String text) {
                System.out.println("Farb-Druck ( " + farbCode + " ): " + text);
        }

}
