[# JavaRoad - Session Log

Dieses Dokument dient als Gedächtnisprotokoll für die Mentoring-Sessions zwischen JavaMasta und seinem Schüler.

---

### **Sitzung vom: 13.05.2026**

_Status: Phase 3.5 gestartet. SRP vollständig abgeschlossen. OCP Violation fertig. Bereit für OCP Refactoring (Strategy Pattern)._

---

**1. Abgeschlossene Themen dieser Session:**

- **Projekt-Housekeeping:**
  - RebelMetal Golden Standard für Commits in CLAUDE.md, GEMINI.md und DMM vereinheitlicht
  - Format: `type: short subject` + 3-Fragen-Body (Why / Trigger / New behaviour)
  - `CLAUDE.md` + `CODING_STANDARDS.md` um Pflicht-Regeln ergänzt:
    - Switch Expressions mit `->` (Java 14+) — alter `case x: break` Stil verboten
    - `isBlank()` statt `isEmpty()` — fängt Whitespace-only Strings ab
  - `design-principles` Maven-Modul registriert und committed
  - `.idea/workspace.xml` aus Git-Tracking entfernt (`git rm --cached`)

- **Phase 3.5 — SRP: Single Responsibility Principle (vollständig ✅):**
  - Analogie: Crew Chief der gleichzeitig Bühne baut, Buchhaltung macht und Presseaussendungen schreibt
  - `violation/OrderProcessor`: eine Klasse mit 3 Verantwortlichkeiten (Validierung, Persistence, E-Mail)
  - `violation/OrderProcessorTest`: 3 Tests grün — beweist die Vermischung
  - `refactored/OrderValidator`, `OrderRepository`, `OrderMailer`, `OrderProcessor`
  - Dependency Injection im Konstruktor — Abhängigkeiten von außen injiziert
  - `refactored/OrderValidatorTest`: 3 Tests grün
  - `refactored/OrderProcessorTest`: 3 Tests grün

- **Phase 3.5 — OCP: Open/Closed Principle (Violation fertig 🔲):**
  - Analogie: Setlist mit festem Inhalt vs. Setlist mit freiem Bonus-Slot
  - `violation/DiscountService`: Switch Expression mit REGULAR (5%) und VIP (20%)
  - `violation/DiscountServiceTest`: 3 Tests grün — beweist korrekte Berechnung
  - Problem sichtbar: neuer Rabatttyp = bestehende Klasse aufschneiden

- **Konzepte erklärt:**
  - `assertThatThrownBy` vs. `assertThatNoException` vs. `assertThat` — wann was
  - Lambda in Tests: warum AssertJ die Kontrolle über den Aufruf braucht
  - AAA-Pattern: Arrange / Act / Assert
  - `assertThrows` (JUnit 5 nativ) vs. AssertJ — Unterschied und warum AssertJ bevorzugt
  - `isBlank()` vs. `isEmpty()` — Java 11+, Whitespace-Falle
  - Dependency Injection: Abhängigkeiten reingeben statt selbst erstellen
  - Switch Expression (`->`) vs. alter Switch (`case x: break`) — Java 14+

**2. Commits dieser Session:**

- `chore: register design-principles as Maven module`
- `docs: align all mentor files to RebelMetal Golden Standard commit format`
- `feat: implement SRP exercise with violation and refactored solution`
- `feat: implement OCP violation exercise with DiscountService`
- `docs: enforce Java 21 switch expression syntax in Golden Standard`

**3. Nächster Schritt:**

- **OCP Refactoring:** Strategy Pattern einführen
  - Interface `DiscountStrategy` erstellen
  - `RegularDiscount`, `VipDiscount`, `BlackFridayDiscount` implementieren
  - `DiscountService` nutzt Interface — kein `switch` mehr, kein alter Code wird angefasst
- **INTERVIEW_PREP.md** anlegen mit Fragen/Antworten zu Phase 1–3.5
- **LSP** (Liskov Substitution Principle) danach

---

### **Sitzung vom: 12.05.2026**

_Status: Phase 3 vollständig abgeschlossen. Architektur bereinigt. Bereit für Phase 3.5._

---

**1. Abgeschlossene Themen dieser Session:**

- **Unit Tests — Phase 3 Final:**
  - `BuildServiceTest` (3 Tests): leere Liste, einzelner Save, mehrere Saves
  - `BibliothekTest` (4 Tests): ISBN gefunden, ISBN nicht gefunden (Optional.empty()),
    alphabetische Sortierung, Duplikat-Schutz via HashSet
  - Alle Tests grün: `mvn test` auf Root-Ebene — core (7) + poe2-api (1) = BUILD SUCCESS

- **Architektur-Bereinigung:**
  - Root-`src/`-Verzeichnis vollständig per `git rm -rf src/` entfernt (war Duplikat nach Migration)
  - `core` als Modul in Root-`pom.xml` eingetragen (vor `poe2-api` — Maven Build-Reihenfolge)
  - Doppelten `core`-Dependency-Eintrag in `poe2-api/pom.xml` entfernt
  - Korrupten Git-Index repariert (`.git/index.lock` entfernt, Index neu aufgebaut)
  - `BuildService` (Phase 2, File I/O) umbenannt in `BuildFileService` zur Klarheit

- **Konzepte erklärt:**
  - `.m2`-Verzeichnis: lokaler Maven-Cache (Lager-Analogie)
  - JAR-Datei: kompiliertes Java-Archiv (Flightcase-Analogie)
  - Maven Build-Reihenfolge: Abhängigkeiten müssen vor dem Konsumenten gebaut sein
  - `mvn install` vs. `mvn test`: install legt JAR ins `.m2`, test kompiliert nur lokal

**2. Commits dieser Session:**

- `test(core): add BuildServiceTest and BibliothekTest`
- `refactor(core): migrate portfolio, bootcamp and uebungen into core module`
- `chore(root): remove duplicate src/ and register core module in root pom`
- `test(bibliothek): complete unit test coverage for Bibliothek`
- `fix(poe2-api): remove duplicate core dependency declaration`

**3. Nächster Schritt:**

- **Phase 3.5 starten: SOLID Principles & Design Patterns**
- Erstes Thema: SRP — Single Responsibility Principle
- Vorgehen: violation first → unit test → refactor → interview one-liner
- Neues Maven-Modul `design-principles/` anlegen

---

### **Sitzung vom: 06.01.2026**

_Status: Phase 3 (Spring & APIs) erfolgreich abgeschlossen. Übergang zu Phase 4._

---
**1. Letztes abgeschlossenes Thema:**

- **PHASE 3 ABGESCHLOSSEN: Spring Framework & APIs.**
    - [x] Spring Core (IoC, DI) verstanden und angewendet.
    - [x] Spring Boot REST-API erfolgreich implementiert.
    - [x] Multi-Modul-Architektur (`core` & `api`) physisch aufgebaut und Maven-Build-Prozess (via `mvnw`) etabliert.
- **WWM-Vorbereitung:** Die Infrastruktur für die Integration von **Where Winds Meet** ist im API-Design bereits berücksichtigt.
- **Dokumentation:** Die `README.md` wurde auf den aktuellen Stand der Architektur gebracht.

---

**2. Aktueller Stand der Roadmap:**

- **Phase 1: Fundamente auffrischen & Java 8+ vertiefen**
  - [x] Meilenstein 1: Java-Grundlagen & Syntax-Wiederholung
  - [x] Meilenstein 1.5: Java's Kern-Konzepte & Schlüsselwörter (Fundament-Bootcamp)
  - [x] Meilenstein 2: Kern-APIs (Collections, I/O)
  - [x] Meilenstein 3: Java 8+ Features
  - [x] Abschluss: Gesamt-Quiz & Integratives Portfolio-Projekt
- **Phase 2: Build-Tools, Testing & Datenbanken**
  - [x] Meilenstein: Maven/Gradle
  - [x] Meilenstein: JUnit 5 & Mockito
  - [x] Meilenstein: Grundlagen der Integrationstests
  - [x] Meilenstein: SQL-Grundlagen & JDBC
  - [x] SQL-Bootcamp: Praxis-Training für SQL mit DBeaver & H2
- **Phase 3: Spring Framework & APIs** <-- **WIR SIND HIER**
    - [x] Meilenstein: Spring Core (IoC, DI)
    - [x] Meilenstein: Spring Boot & REST-APIs
    - [x] Meilenstein: Spring Data JPA
- **Phase 4: Fortgeschrittene Themen & Best Practices** <-- **WIR SIND HIER**
    - [ ] Meilenstein: Git-Grundlagen (Branching, Merging)
    - [ ] Meilenstein: Clean Code & Refactoring (Fokus: API-Struktur)
    - [ ] Meilenstein: Design Patterns
    - [ ] Meilenstein: Docker Basics
- **Phase 5: Bewerbungsphase & Portfolio-Projekte** [ ]

**3. Unser beschlossenes Vorgehen (Die 3-Phasen-Lernstrategie & Anki):**

Für jedes neue Thema gilt der folgende Ablauf:

- **Phase 1: Umfassende Erklärung (JavaMasta):** JavaMasta gibt eine vollständige Erklärung zu einem Thema. Nach dem **"'Classic vs. Modern'-Prinzip"** werden dabei sowohl traditionelle als auch die neuesten, empfohlenen Ansätze (z.B. aus Java 17/21) vorgestellt.
- **Phase 2: Aktives Erinnern (Schüler):** Der Schüler beantwortet gezielte Fragen, die sich auf die Erklärung aus Phase 1 beziehen. Die Fragen werden explizit Vergleiche zwischen "klassisch" und "modern" beinhalten.
- **Phase 3: Feedback & Vertiefung (JavaMasta):** JavaMasta gibt Feedback zu den Antworten und reichert das Wissen anschließend mit zusätzlichen Fakten, Profi-Tipps oder Kontext an.
- **Phase 4: Anki-Export (JavaMasta & Schüler):** JavaMasta erstellt einen CSV-formatierten Text mit Lernkarten zum Thema. Die Karten werden explizit Vergleiche zwischen "klassisch" und "modern" beinhalten.

**4. Prozess für Lern-Skripte (FINAL):**

- **Zeitpunkt:** Nachdem Phase 3 (Feedback & Vertiefung) für ein Thema abgeschlossen ist.
- **Ablauf:**
  1. JavaMasta erstellt den **vollständigen Markdown-Text**, der sowohl die ursprüngliche Erklärung (Phase 1) als auch die "Profi-Tipps" (aus Phase 3) enthält.
  2. Der Schüler erstellt eine entsprechende `.md`-Datei im `Lernskripte`-Ordner, fügt den Inhalt ein und committet die Datei.


**5. Nächste unmittelbare Aufgabe:**

- **Thema: Clean Code & Git-Workflows am praktischen Beispiel WWM.**
- **Ziel:** Wir nutzen die Integration von **Where Winds Meet**, um saubere Design Patterns (wie das Strategy- oder Factory-Pattern) anzuwenden.
- **Task:** Erstellung eines dedizierten Branches für das WWM-Feature, um professionelle Git-Workflows zu üben.

**6. Prozess für Plan-Anpassungen (NEU - Das "Agile Roadmap"-Prinzip):**

- Die Roadmap ist ein lebendiges Dokument.
- Der Schüler kann jederzeit vorschlagen, Themen hinzuzufügen, zu vertiefen oder die Reihenfolge anzupassen.
- Wir besprechen den Vorschlag und integrieren beschlossene Änderungen in den `SESSION_LOG`.
- Der grundlegende Lernprozess wird auf alle neuen oder vertieften Themen angewendet.

**7. Prozess für API-lastige Meilensteine (FINAL - Der "Üben & Anwenden"-Workflow):**

- Nach der Theorie-Phase (1-4) und dem Diagnose-Quiz folgt:
- **Phase 5 ("Praktische Übungen"):**
  - JavaMasta stellt kleine bis mittlere, fokussierte Programmieraufgaben.
  - Der Schüler implementiert diese in einem dedizierten Paket innerhalb eines `Uebungen`-Ordners.
  - Jede Übung wird auf GitHub gepusht und in der `README.md` verlinkt.
  - JavaMasta führt eine Code-Review auf GitHub durch.
- **Phase 6 ("Portfolio-Projekt"):**
  - Im Anschluss folgt eine größere, zusammenhängende Aufgabe, die die geübten Konzepte kombiniert und für das GitHub-Portfolio bestimmt ist.

---]