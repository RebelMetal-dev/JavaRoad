
# Lernskript: `static` vs. Instanz-Mitglieder

Dieses Konzept unterscheidet zwischen Mitgliedern, die zu einem einzelnen Objekt gehören, und solchen, die zur Klasse selbst gehören. Die Analogie ist ein Bauplan (`Klasse`) vs. gebaute Häuser (`Objekte`).

---

## 1. Instanz-Mitglieder (Gehören zum Objekt)

- **Konzept:** "Normale" Klassenmitglieder, die für jedes erstellte Objekt individuell existieren.
- **Analogie:** Jedes Haus hat eine **eigene** `wandfarbe` (Instanzfeld) und eine **eigene** `klingeln()`-Methode (Instanzmethode).
- **Regel:** Zugriff erfordert immer eine Instanz (ein Objekt).
  ```java
  Haus meinHaus = new Haus();
  meinHaus.wandfarbe = "Blau";
  meinHaus.klingeln();


2. static-Mitglieder (Gehören zur Klasse)

   Konzept: Klassenmitglieder, die es nur ein einziges Mal für die gesamte Klasse gibt, unabhängig von der Anzahl der Objekte.

   Analogie: Die Gesamtanzahl aller gebauten Häuser (static int anzahlGebauterHaeuser) ist eine Information des Bauplans, nicht eines einzelnen Hauses.

   Regel: Zugriff erfolgt über den Klassennamen.
   Generated java


// Zugriff über den Klassennamen ist der korrekte Stil
Haus.anzahlGebauterHaeuser = 10;
double steuer = Haus.berechneGrundsteuer();


3. Wichtige Regeln und Unterschiede

   Speicher: Instanzfelder werden pro Objekt angelegt. Statische Felder nur einmal pro Klasse.

   Zugriff:

        static-Methoden können NICHT auf Instanz-Mitglieder (this) zugreifen. Sie wissen nicht, von welchem Objekt sie sprechen.

        Instanz-Methoden können auf beides zugreifen: ihre eigenen Instanz-Mitglieder und alle statischen Mitglieder der Klasse.

4. Typische Anwendungsfälle für static

   static final Konstanten: Globale, unveränderliche Werte für eine Klasse.
   Generated java


public static final int MAX_STOCKWERKE = 3;

Utility-Methoden: Hilfsmethoden, die keinen Objektzustand benötigen. Das bekannteste Beispiel ist die Math-Klasse.
Generated java


double wurzel = Math.sqrt(25);

    