
# Coding Standards & Best Practices für JavaRoad

Dieses Dokument dient als persönlicher "Style Guide" und als Referenz für die professionellen Standards, die in diesem Projekt angestrebt werden. Es orientiert sich an branchenüblichen Konventionen und den Prinzipien von "Clean Code".

---

## 1. Namenskonventionen (Die offizielle Java-Grammatik)
- **Klassen & Interfaces:** `UpperCamelCase` (z.B. `Buch`, `Fliegbar`)
- **Methoden & Variablen:** `lowerCamelCase` (z.B. `berechnePreis`, `aktuelleSeite`)
- **Konstanten (`static final`):** `SCREAMING_SNAKE_CASE` (z.B. `MAX_ANZAHL_SEITEN`)
- **Pakete:** `lowercase.with.dots` (z.B. `de.rebelmetal.javaroad.uebungen`)

---

## 2. Formatierungs-Standards (Der visuelle Eindruck)
- **Einrückung:** Konsistente Nutzung von 4 Leerzeichen.
- **Klammersetzung:** Die öffnende Klammer `{` steht in der gleichen Zeile wie das Statement.
  ```java
  if (bedingung) {
      // ...
  }


    Leerzeichen: Sinnvoller Einsatz um Operatoren (a + b statt a+b) zur Verbesserung der Lesbarkeit.

3. "Clean Code" Best Practices (Die Philosophie)

   Aussagekräftige Namen: Eine Variable verstricheneZeitInTagen ist unendlich besser als zt. Der Code soll sich selbst dokumentieren.

   Kleine Methoden, die EINE Sache tun (Single Responsibility Principle): Eine Methode sendeRechnung() sollte nicht auch noch den Lagerbestand prüfen.

   DRY (Don't Repeat Yourself): Code-Duplizierung ist zu vermeiden. Wiederholte Logik gehört in eine eigene, wiederverwendbare Methode.

   Kommentare erklären das "Warum", nicht das "Was":

        Schlecht: // Erhöhe i um 1 (Das sehe ich am Code i++; selbst).

        Gut: // Wir müssen den Zähler vor der Prüfung erhöhen, da die ID bei 1 beginnt.

4. Branchenübliche Werkzeuge & Prozesse (Das Handwerkszeug)

   Build-Tools: Spätere Verwendung von Maven/Gradle zur Verwaltung von Abhängigkeiten.

   Versionierung (Git): Konsequente Nutzung von git mit aussagekräftigen, mehrzeiligen Commit-Nachrichten, die das "Warum" der Änderung erklären.

   Logging statt System.out.println: In realen Anwendungen werden Logging-Frameworks (wie SLF4J/Logback) verwendet. System.out.println ist nur für kleine Lern-Übungen akzeptabel.