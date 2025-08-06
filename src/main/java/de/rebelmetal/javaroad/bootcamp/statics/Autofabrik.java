package de.rebelmetal.javaroad.bootcamp.statics;

/**
 * Interaktive Übung zum Verständnis von `static` vs. Instanz-Mitgliedern.
 *
 * Diese Klasse simuliert eine Autofabrik und ein einzelnes Auto, um den
 * Unterschied zwischen klassen-spezifischen (static) und objekt-spezifischen
 * (Instanz) Eigenschaften und Fähigkeiten zu demonstrieren.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class Autofabrik {

    // --- 1. Instanzfeld (gehört zum OBJEKT) ---
    /**
     * Die Farbe dieses spezifischen Autos. Jedes Auto-Objekt (jede Instanz)
     * bekommt seine eigene, unabhängige Kopie dieses Feldes.
     */
    private String farbe;


    // --- 2. Statisches Feld (gehört zur KLASSE) ---
    /**
     * Zählt die Gesamtzahl aller jemals in dieser Fabrik produzierten Autos.
     * Dieses Feld existiert nur EINMAL und wird von allen Objekten geteilt.
     */
    public static int produzierteAutosCounter = 0;


    // --- 3. Der Konstruktor (verbindet beide Welten) ---
    /**
     * Der Konstruktor, um ein neues Auto-Objekt (eine Instanz) zu erstellen.
     * Er wird jedes Mal aufgerufen, wenn 'new Autofabrik()' verwendet wird.
     *
     * @param farbe Die Farbe für DIESES SPEZIFISCHE neue Auto.
     */
    public Autofabrik(String farbe) {
        // --- Zugriff auf das Instanzfeld ---
        // 'this.farbe' bezieht sich auf das Feld des gerade entstehenden Objekts.
        // Wir setzen die individuelle Eigenschaft.
        this.farbe = farbe;

        // --- Zugriff auf das statische Feld ---
        // Wir erhöhen den EINEN, GEMEINSAMEN Zähler der Klasse.
        produzierteAutosCounter++;

        System.out.println("Ein neues Auto wurde produziert! Farbe: " + this.farbe +
                ". Gesamtproduktion: " + produzierteAutosCounter);
    }

    // --- 4. Instanzmethode (Fähigkeit eines OBJEKTS) ---
    /**
     * Gibt die individuelle Farbe DIESES Autos zurück.
     * Diese Methode braucht ein konkretes Objekt, um aufgerufen zu werden.
     *
     * @return Die Farbe des Autos.
     */
    public String getFarbe() {
        // Greift auf das Instanzfeld 'this.farbe' zu.
        return this.farbe;
    }

    // --- 5. Statische Methode (Fähigkeit der KLASSE) ---
    /**
     * Gibt eine allgemeine Information über die Fabrik zurück.
     * Diese Methode kann ohne ein Objekt aufgerufen werden.
     */
    public static void zeigeFabrikStatus() {
        System.out.println("--- Fabrik-Status ---");
        System.out.println("Gesamt produzierte Autos: " + produzierteAutosCounter);

        // Der folgende Code würde einen FEHLER erzeugen, weil eine statische Methode
        // nicht weiß, von welchem Auto sie die Farbe nehmen soll. Es gibt kein 'this'.
        //System.out.println("Die Farbe des zuletzt produzierten Autos war: " + this.farbe);
    }


    public static void main(String[] args) {
        System.out.println("--- Produktionsstart ---");
        // Aufruf der statischen Methode über den Klassennamen
        Autofabrik.zeigeFabrikStatus();
        System.out.println("------------------------\n");

        // --- Wir bauen zwei Autos ---
        System.out.println("Produziere erstes Auto...");
        Autofabrik auto1 = new Autofabrik("Rot");

        System.out.println("\nProduziere zweites Auto...");
        Autofabrik auto2 = new Autofabrik("Blau");

        System.out.println("\n--- Produktionsende ---");

        // Erneuter Aufruf der statischen Methode
        Autofabrik.zeigeFabrikStatus();

        // --- Bestandsaufnahme der einzelnen Autos ---
        // Aufruf der Instanzmethoden auf den jeweiligen Objekten
        System.out.println("Farbe von Auto 1: " + auto1.getFarbe());
        System.out.println("Farbe von Auto 2: " + auto2.getFarbe());
    }
}
