# Lernskript: Grundlegende Syntax

- **Datentypen:**
    - **Primitive:** `int`, `double`, `boolean`, `char`. Speichern direkte Werte.
    - **Referenztypen:** `String`, `ArrayList`. Speichern eine Adresse (Referenz) zu einem Objekt.
- **Variablen:** `Datentyp variablenName = Wert;`. Konvention: `lowerCamelCase`.
- **Operatoren:** Arithmetisch (`+`, `%`), Vergleich (`==`, `>`), Logisch (`&&`, `||`, `!`).
    - **Wichtig:** `==` vergleicht bei Objekten nur die Speicheradresse, nicht den Inhalt! Für den Inhaltsvergleich **immer** `.equals()` verwenden.
- **Kontrollstrukturen:**
    - `if-else`, `while`, `do-while`, `for`.
    - **Modern:** Die `for-each`-Schleife (`for (String s : liste)`) ist der Standard für Collections. Die `switch`-Expression (seit Java 14) ist die sichere, moderne Alternative zum `switch`-Statement.