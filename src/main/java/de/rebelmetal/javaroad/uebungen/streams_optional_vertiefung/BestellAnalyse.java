package de.rebelmetal.javaroad.uebungen.streams_optional_vertiefung;

import java.util.List;
import java.util.Optional; // Notwendig für die Verwendung von Optional-Typen

/**
 * Diese Klasse demonstriert die Verwendung von Java Streams und Optional für die Analyse
 * einer Liste von Kundenbestellungen. Sie zeigt, wie man Daten filtern, transformieren
 * und aggregieren kann, um spezifische Geschäftsfragen zu beantworten.
 * <p>
 * Konkrete Anwendungsfälle sind die Berechnung des Gesamtumsatzes über einem Schwellenwert
 * und das Auffinden der ersten passenden Bestellung basierend auf mehreren Kriterien.
 *
 * @author Christoph Breddin
 * @version 1.0
 */

public class BestellAnalyse {

    public static void main(String[] args) {

        List<Bestellung> bestellungen = List.of(
                new Bestellung(101, "Anna", 89.90),
                new Bestellung(102, "Peter", 1200.50),
                new Bestellung(103, "Chris", 45.00),
                new Bestellung(104, "Maria", 2500.00),
                new Bestellung(105, "Anna", 150.25)
        );

        // Der Schwellenwert wird in einer Variablen definiert, um Änderungen zu zentralisieren
        // und "magische Zahlen" im Code zu vermeiden.
        double mindestBetragFuerFilter = 1000.00;

        // Berechnet den Gesamtumsatz nur für Bestellungen über dem Mindestbetrag.
        // Der Stream wird gefiltert, um nur relevante Bestellungen zu berücksichtigen,
        // und dann auf die Beträge gemappt, um diese direkt zu summieren.
        double gesamtUmsatzUeberTausend = bestellungen.stream()
                .filter(umsatz -> umsatz.betrag() > mindestBetragFuerFilter)
                .mapToDouble(Bestellung::betrag)
                .sum();

       /* System.out.println("Gesamtumsatz aller Bestellungen über " + mindestBetragFuerFilter + ": " + gesamtUmsatzUeberTausend);
        System.out.println("Gesamtumsatz aller Bestellungen über " + String.format("%.2f", mindestBetragFuerFilter) + ": " + String.format("%.2f", gesamtUmsatzUeberTausend));
        */

        // Formatiert die Ausgabe, um eine konsistente Anzeige von Währungsbeträgen zu gewährleisten.
        System.out.println(String.format("Gesamtumsatz aller Bestellungen über %.2f: %.2f", mindestBetragFuerFilter, gesamtUmsatzUeberTausend));

        // Suchkriterien für die erste passende Bestellung.
        String gesuchterKundenName = "Anna";
        double gesuchterBetragFuerFilter = 100.00;

        // Sucht nach der ersten Bestellung, die beide Kriterien erfüllt.
        // `findFirst()` liefert ein Optional, um die Möglichkeit auszudrücken,
        // dass kein passendes Element gefunden wird, und um NullPointerExceptions zu vermeiden.
        Optional<Bestellung> gefundeneBestellungVonKunden = bestellungen.stream()
                .filter(bestellung -> bestellung.kundenName().equals(gesuchterKundenName))
                .filter(bestellung -> bestellung.betrag() > gesuchterBetragFuerFilter)
                .findFirst();


        // Nutzt `ifPresentOrElse` zur direkten Behandlung beider Fälle (gefunden/nicht gefunden).
        // Dies ist prägnanter und sicherer als manuelle if-else-Prüfungen.
        gefundeneBestellungVonKunden.ifPresentOrElse(
                // Dieser Block wird nur ausgeführt, wenn eine Bestellung gefunden wurde,
                // und erlaubt direkten Zugriff auf das 'bestellung'-Objekt.
                bestellung -> System.out.println(String.format("Gefunden: Bestellung %d mit einem Betrag von %.2f.", bestellung.bestellNr(), bestellung.betrag())),
                // Dieser Block wird ausgeführt, wenn keine passende Bestellung gefunden wurde,
                // und bietet eine alternative Nachricht ohne Objektbezug.
                () -> System.out.println("Keine passende Bestellung für " + gesuchterKundenName + " gefunden.")
        );


    }
}
