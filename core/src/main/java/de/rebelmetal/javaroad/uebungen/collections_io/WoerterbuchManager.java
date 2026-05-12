package de.rebelmetal.javaroad.uebungen.collections_io;

import java.io.BufferedWriter; // Efficient writing via internal buffer — avoids a disk write on every line.
import java.io.FileWriter;     // Establishes the file connection for writing.
import java.io.IOException;    // Must be handled because file system operations can fail.
import java.util.HashMap;      // Fast implementation for key-value pairs.
import java.util.Map;          // Interface for key-value pairs — keeps the code flexible.

/**
 * Practice exercise for Milestone 2: Collections & I/O.
 *
 * Demonstrates using a HashMap to store key-value pairs and exporting
 * that data to a formatted text file via BufferedWriter and try-with-resources.
 *
 * @author Christoph Breddin
 * @version 1.0
 */
public class WoerterbuchManager {
    public static void main(String[] args) {
        Map<String, String> woerterbuch = new HashMap<>();

        woerterbuch.put("Katze", "cat");
        woerterbuch.put("Haus", "house");
        woerterbuch.put("Auto", "car");
        woerterbuch.put("Arbeit", "work");
        woerterbuch.put("Geld", "money");

        // Absolute file path — ensures the file is always created in the same location
        // regardless of the working directory at runtime.
        String dateiName = "C:\\Users\\bred-\\CBredJavaProjekte\\JavaRoad\\src\\main\\java\\de\\rebelmetal\\javaroad\\uebungen\\collections_io\\woerterbuch.txt";

        // try-with-resources guarantees that the writer is closed automatically,
        // even if an exception occurs — prevents resource leaks.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dateiName))) {
            writer.write("--- My German-English Dictionary ---");
            writer.newLine();
            // Map.Entry gives direct access to both key and value in a single loop step.
            for (Map.Entry<String, String> eintrag : woerterbuch.entrySet()) {
                String zeile = "DE: " + eintrag.getKey() + " -> EN: " + eintrag.getValue();
                writer.write(zeile);
                writer.newLine();
            }
            System.out.println("Dictionary exported successfully to: " + dateiName);
        } catch (IOException e) {
            // Catches I/O errors — e.g. missing permissions or full disk.
            System.err.println("ERROR exporting dictionary to: " + dateiName);
            System.err.println("Possible cause: " + e.getMessage());
        }
    }
}
