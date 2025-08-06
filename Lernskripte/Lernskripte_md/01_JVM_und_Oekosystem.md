# Lernskript: Die JVM und das Java-Ökosystem

- **JDK (Java Development Kit):** Der Werkzeugkasten für Entwickler. Enthält den Compiler (`javac`).
- **JRE (Java Runtime Environment):** Die Laufzeitumgebung für Anwender. Enthält die JVM.
- **JVM (Java Virtual Machine):** Das Herzstück. Führt den Java-Bytecode aus und sorgt für:
    1.  **Plattformunabhängigkeit:** Durch Übersetzung von universellem Bytecode in nativen Maschinencode ("Write Once, Run Anywhere").
    2.  **Speicherverwaltung:** Der **Garbage Collector (GC)** räumt automatisch auf.
    3.  **Performance-Optimierung:** Der **Just-In-Time (JIT) Compiler** optimiert häufig genutzten Code zur Laufzeit.