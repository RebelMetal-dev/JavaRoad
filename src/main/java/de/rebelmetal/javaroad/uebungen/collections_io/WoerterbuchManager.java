package de.rebelmetal.javaroad.uebungen.collections_io;

import java.io.BufferedWriter; // Für effizientes Schreiben großer Textmengen durch Pufferung.
import java.io.FileWriter;     // Stellt die Dateiverbindung zum Schreiben her.
import java.io.IOException;    // Muss behandelt werden, da Dateisystemoperationen fehlschlagen können.
import java.util.HashMap;      // Schnelle Implementierung für Schlüssel-Wert-Paare.
import java.util.Map;          // Definiert die Schnittstelle für Schlüssel-Wert-Paare (fördert Flexibilität).


/**
 * Praxis-Übung zu Meilenstein 2: Collections & I/O.
 *
 * Diese Klasse demonstriert die Verwendung einer HashMap zur Speicherung von
 * Schlüssel-Wert-Paaren und den Export dieser Daten in eine formatierte
 * Textdatei mittels BufferedWriter und try-with-resources.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class WoerterbuchManager {
    public static void main(String[] args) {
        Map<String, String> woerterbuch = new HashMap<>();

        woerterbuch.put("Katze","cat");
        woerterbuch.put("Haus","house");
        woerterbuch.put("Auto","car");
        woerterbuch.put("Arbeit","work");
        woerterbuch.put("Geld","money");

        // Definiert den absoluten Dateipfad.
        // Stellt sicher, dass die Datei immer am selben Ort erstellt wird, unabhängig vom Startverzeichnis.
        String dateiName = "C:\\Users\\bred-\\CBredJavaProjekte\\JavaRoad\\src\\main\\java\\de\\rebelmetal\\javaroad\\uebungen\\collections_io\\woerterbuch.txt";

        // Schreibt die Datei; try-with-resources stellt automatisches und zuverlässiges Schließen der Ressourcen sicher.
        // Verhindert Ressourcenlecks und macht den Code robuster.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dateiName))) {
            writer.write("--- Mein Deutsch-Englisch - Wörterbuch ---");
            writer.newLine();
            // Verwendung von Map.Entry für effizienten Zugriff auf Schlüssel und Wert.
            for(Map.Entry<String, String> eintrag : woerterbuch.entrySet()){
                String zeile = "DE: " + eintrag.getKey() + " -> EN: " + eintrag.getValue();
                writer.write(zeile);
                writer.newLine();
            }
            /*File datei = new File(dateiName);
            System.out.println("Wörterbuch erfolgreich in '" + datei.getAbsolutePath() + "' exportiert.");*/
            System.out.println("Wörterbuch erfolgreich in '" + dateiName + "' exportiert.");
        } catch (IOException e) {
          /*  e.printStackTrace();*/
            // Fängt I/O-Fehler ab.
            // Behandlung notwendig, da Dateisystemoperationen fehlschlagen können (z.B. fehlende Rechte, voller Speicher)
            System.err.println("FEHLER beim Exportieren des Wörterbuchs nach '" + dateiName + "'.");
            System.err.println("Mögliche Ursache: " + e.getMessage());

        }
    }
}
