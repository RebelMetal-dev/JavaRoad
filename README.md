# JavaRoad - Mein Lernpfad zum Junior Java Entwickler

Willkommen zu meinem "JavaRoad"-Repository! Dies ist mein persönliches Lern- und Projektportfolio, das meinen Weg zum Junior Java Entwickler dokumentiert. Hier sammle ich Code-Beispiele, Übungen und Projekte, um meine Fähigkeiten nach neuesten Standards zu schärfen.

---

## 🎯 Mein Ziel

Schnellstmögliche Auffrischung und Vertiefung meiner Java-Kenntnisse, um erfolgreich als Junior Java Entwickler durchzustarten. Dieses Repository dient als transparenter Nachweis meines Lernprozesses und meiner praktischen Fähigkeiten.

---


## 🧭 Mein Lernansatz: Agil, MEthodisch & Qualitätsgesichert


Ich verfolge keinen starren Lehrplan, sondern einen agilen und zyklischen Lernprozess. Jeder Meilenstein wird nach einer strukturierten Methode bearbeitet, die auf kontinuierlicher Selbstüberprüfung und praktischer Anwendung basiert. Dieser Lernansatz stützt sich auf zwei Säulen:

1.  **KI-gestütztes Mentoring:** Ich nutze ein von mir konfiguriertes und trainiertes KI-Modell (Google's Gemini 2.5 Pro), das als personalisierter Mentor "JavaMasta" agiert. Dieses Werkzeug dient als Sparringspartner für die Theorie und zur Generierung von praxisnahen Übungsaufgaben.
2.  **Senior-Level Code Review:** Alle Konzepte, Prozesse und vor allem der von mir geschriebene Code werden regelmäßig von einem erfahrenen Senior Entwickler überprüft, um die Einhaltung von professionellen Standards und Best Practices sicherzustellen.

Dieser duale Ansatz kombiniert die Geschwindigkeit und Verfügbarkeit moderner KI-Werkzeuge mit der Tiefe und praktischen Weisheit menschlicher Expertise.

### Die Methodik im Detail

1.  **Anforderungsanalyse & Roadmap:** Die Lern-Roadmap wurde durch Recherche und im Dialog mit meinem KI-Mentor "JavaMasta" erstellt, um die aktuell gefragtesten Fähigkeiten für Junior-Positionen abzudecken.
2.  **Wissensstand-Diagnose:** Vor jedem neuen Themenblock wird mein aktueller Kenntnisstand durch ein gezieltes Quiz ermittelt, um den Lernfokus zu schärfen.
3.  **Theorie & Wissensaufbau:** Das Thema wird durch einen KI-Mentor tiefgehend erklärt und das Wissen in permanenten Artefakten (Lern-Skripten, Anki-Karten) für nachhaltiges Lernen gesichert.
4.  **Praxis & Wiederholung:** Das theoretische Wissen wird durch eine Reihe kleinerer, fokussierter Programmierübungen gefestigt. Jede Übung wird versioniert und ist hier im Repository einsehbar.
5.  **Qualitätssicherung & Abschluss:** Jeder Meilenstein endet mit einem zusammenfassenden Gesamt-Quiz und einem größeren, integrativen Portfolio-Projekt, das die erlernten Fähigkeiten in einem praxisnahen Szenario kombiniert.

### Qualitätssicherung
Um professionelle Standards zu garantieren, wird der gesamte Prozess – und insbesondere der von mir geschriebene Code – regelmäßig von einem erfahrenen Senior Entwickler überprüft.

---

## 💡 Lern-Roadmap Übersicht

*Dies ist eine interaktive, hierarchische Übersicht meines Fortschritts. Jede Ebene kann aufgeklappt werden, um die Details anzuzeigen.*

<details open>
<summary><b> [x] Phase 1: Fundamente auffrischen & Java 8+ vertiefen</b></summary>
<table>
<tr>
<td>

<details>
<summary>     [x] Meilenstein 1: Java-Grundlagen & Syntax-Wiederholung</summary>
<br>

- [x] Thema: JVM & Java-Ökosystem
- [x] Thema: Grundlegende Syntax

</details>
<details>
<summary>     [x] Meilenstein 1.5: Java's Kern-Konzepte & Schlüsselwörter (Fundament-Bootcamp)</summary>
<br>

- [x] Thema: `static` vs. Instanz
- [x] Thema: Zugriffsmodifikatoren
- [x] Thema: Konstruktoren, `this` und `super`
- [x] Thema: `final`
- [x] Thema: Die `Object`-Klasse (`equals`, `hashCode`, `toString`)
- [x] Thema: `abstract class` vs. `interface`
- [x] Thema: Methoden-Überladung vs. -Überschreidung

</details>
<details>
<summary>     [x] Meilenstein 2: Kern-APIs (Collections, I/O)</summary>
<br>

- [x] Thema: Das Java Collections Framework
- [x] Thema: Einfache Dateiein- und -ausgabe

</details>
<details>
<summary>     [x] Meilenstein 3: Java 8+ Features</summary>
<br>

- [x] Thema: Lambdas & Funktionale Interfaces
- [x] Thema: Die Java Stream API
- [x] Thema: Der `Optional<T>`-Typ

</details>

</td>
</tr>
</table>
</details>

<details>
<summary><b> [x] Phase 2: Build-Tools, Testing & Datenbanken</b></summary>
<table>
<tr>
<td>

- [x] Meilenstein: Maven/Gradle
- [x] Meilenstein: JUnit 5 & Mockito
- [x] Meilenstein: Grundlagen der Integrationstests
- [x] Meilenstein: SQL-Grundlagen & JDBC
- [x] **SQL-Bootcamp:** Praxis-Training für SQL mit DBeaver & H2

</td>
</tr>
</table>
</details>

<details>
<summary><b> [x] Phase 3: Spring Framework & APIs</b></summary>
<table>
<tr>
<td>

- [x] Meilenstein: Spring Core (IoC, DI)
- [x] Meilenstein: Spring Boot & REST-APIs — inkl. CommandLineRunner-Refactoring (DataInitializer)
- [x] Meilenstein: Spring Data JPA — Taskmaster-Scaffold, @Data-Antipattern behoben
- [x] Golden Standard vollständig umgesetzt: Javadoc & Kommentare auf Englisch
- [x] PoECharacter → Record + Wither Pattern (withStat, withLevel, static factory of())
- [x] TaskController REST-Endpoints (GET, POST, DELETE) — Postman-verifiziert
- [x] DTO-Pattern: TaskDto Record, Entity→DTO Mapping via Stream, Information Hiding
- [ ] Unit Tests: JUnit 5 + Mockito für TaskService, BuildService & Bibliothek

</td>
</tr>
</table>
</details>

<details>
<summary><b> [] Phase 3.5: SOLID-Prinzipien & GoF Design Patterns</b></summary>
<table>
<tr>
<td>

*Jedes Prinzip und Pattern enthält: eine bewusste Verletzung, die korrigierte Lösung, einen JUnit-Test und einen Interview-Einzeiler.*

**SOLID-Prinzipien:**
- [ ] S — Single Responsibility Principle
- [ ] O — Open/Closed Principle
- [ ] L — Liskov Substitution Principle
- [ ] I — Interface Segregation Principle
- [ ] D — Dependency Inversion Principle

**GoF Design Patterns (Priorität für Junior-Interviews):**
- [ ] Strategy (Behavioral)
- [ ] Factory Method (Creational)
- [ ] Builder (Creational)
- [ ] Observer (Behavioral)
- [ ] Singleton (Creational)
- [ ] Decorator (Structural)
- [ ] Facade (Structural)

</td>
</tr>
</table>
</details>

<details>
<summary><b> [] Phase 4: Fortgeschrittene Themen</b></summary>
<table>
<tr>
<td>

- [ ] Meilenstein: Git-Branching-Strategie (Feature Branches, Pull Requests)
- [ ] Meilenstein: Docker Basics
- [ ] Meilenstein: Java 21 Features (Sealed Classes, Pattern Matching, Virtual Threads)

</td>
</tr>
</table>
</details>

*(Weitere Phasen folgen)*

---

## 🚀 Portfolio-Projekte

*Hier präsentiere ich die größeren, zusammenhängenden Projekte, die mehrere Konzepte kombinieren und die Highlights der jeweiligen Lernphasen darstellen.*

### Phase 1: Java Fundamente & Kernkonzepte
- **[Integratives Projekt: Bibliotheks-Verwaltung 1.0](src/main/java/de/rebelmetal/javaroad/portfolioprojekt/)**
  - **Beschreibung:** Eine Kommandozeilen-Anwendung zur Verwaltung eines Buchbestands. Das Projekt demonstriert eine saubere 3-Schichten-Architektur (Daten, Logik, Präsentation) und eine professionelle Git-Historie.
  - **Demonstrierte Fähigkeiten:** OOP (`record`), Collections (`Set`, `List`), Java 8+ Features (`Stream`, `Optional`, `Comparator`), Clean Code, Javadoc, Git Best Practices.

### 🚀 Phase 2: Fortgeschrittene Datenstrukturen & Dateisysteme
- **[PoE2 Build-Manager](src/main/java/de/rebelmetal/javaroad/portfolio/poe2manager/)**
    - **Beschreibung:** Ein Tool zur Verwaltung von Path of Exile 2 Charakter-Builds. Der Fokus liegt auf der Persistenz ohne Datenbank durch direkte Dateisystem-Interaktion.
    - **Highlights:** * **Typensicheres Design:** Nutzung von Enums für PoE2-Attribute (Str, Dex, Int) zur Vermeidung von Logikfehlern.
        * **Dateisystem-Persistenz:** Einsatz von `java.nio.file` (Files/Paths) zum automatisierten Erstellen von Build-Dateien.
        * **Datenstrukturen:** Verwendung von `HashMap` zur flexiblen Verwaltung von Charakter-Stats.
        * **Robustheit:** Implementierung von Exception-Handling für sicheren Datei-Zugriff.

### Phase 3: Spring Boot & Multi-Modul Architektur
- **[Game Build API (Multi-Modul Project)](portfolio-apps/poe2-api/)**
    - **Beschreibung:** Eine moderne REST-API für PoE2-Charakter-Builds. Markiert den Übergang von lokalen Konsolen-Anwendungen zu professioneller verteilter Architektur.
    - **Highlights:**
        - **Separation of Concerns:** Strikte Trennung von Geschäftslogik (`core`) und Web-Interface (`poe2-api`).
        - **Spring Boot Lifecycle:** Seed-Daten sauber über `CommandLineRunner` (DataInitializer) statt im Konstruktor.
        - **Multi-Modul Maven:** Dependency Injection über Modulgrenzen hinweg.
    - **Status:** Funktionaler Prototyp — `GET /builds` liefert JSON.

- **[Taskmaster — Spring Data JPA](taskmaster/)**
    - **Beschreibung:** Spring Boot REST API mit echter Datenbankpersistenz via JPA & H2. Vollständiger CRUD-Stack mit DTO-Pattern — live getestet mit Postman.
    - **Highlights:**
        - **DTO-Pattern & Information Hiding:** `TaskDto` (Record) entkoppelt die API von der DB-Struktur. `createdAt` bleibt intern — der Browser sieht nur was er sehen darf.
        - **Entity→DTO Mapping:** Stream-basiertes Mapping im Service — SRP in Aktion.
        - **JPA-Entity korrekt:** `@Getter @Setter @NoArgsConstructor` statt `@Data` — verhindert broken `equals()`/`hashCode()` vor dem ersten Persist.
        - **`@PrePersist`:** `createdAt` wird automatisch beim Speichern gesetzt.
    - **Endpoints:** `GET /tasks` · `POST /tasks` · `DELETE /tasks/{id}`
    - **Status:** Vollständig implementiert & Postman-verifiziert ✅

*(Weitere Portfolio-Projekte für Phase 3.5 und Phase 4 folgen)*

---

## 📚 Interaktive Lernskripte

*Begleitend zum Code entstehen interaktive Lernmaterialien — direkt im Browser nutzbar, kein Setup nötig.*

| Skript | Beschreibung |
|--------|-------------|
| [🔵 Spring Boot Request Flow](https://rebelmetal-dev.github.io/JavaRoad/Lernskripte/spring_request_flow_interaktiv.html) | 11-Schritt interaktiver Walkthrough: GET /tasks von Browser bis Datenbank und zurück |
| [🟠 HTTP Status Codes Referenz](https://rebelmetal-dev.github.io/JavaRoad/Lernskripte/http_status_codes_referenz.html) | Filterbare Referenz aller wichtigen HTTP Codes mit Spring Boot Kontext |
| [🟣 Taskmaster Architektur](https://rebelmetal-dev.github.io/JavaRoad/Lernskripte/spring_taskmaster_architecture.svg) | Vollständiger Programmablauf als Architekturdiagramm |

---
## 🧭 Projekt-Struktur & Architektur

Um die Wartbarkeit zu erhöhen, ist das Projekt in logische Module unterteilt:

```text
JavaRoad (Root — Maven Multi-Module)
├── core/                         # Domain-Modelle & Business-Logik
│   └── src/main/java/.../core/
│       ├── models/               # PoECharacter (Record), Attribute (Enum)
│       └── services/             # BuildService (@Service)
├── portfolio-apps/
│   └── poe2-api/                 # Spring Boot REST API
│       └── poe2api/              # BuildController, DataInitializer, Application
├── taskmaster/                   # Spring Data JPA — Entity, Repository
│   └── model/Task.java           # JPA Entity (@Getter @Setter @NoArgsConstructor)
├── design-principles/            # Phase 3.5 — SOLID & GoF Patterns (geplant)
│   └── solid/ + patterns/
├── src/main/java/.../
│   ├── portfolio/bibliothek/     # Phase 1 Portfolio-Projekt
│   ├── portfolio/poe2manager/    # Phase 2 Portfolio-Projekt
│   ├── bootcamp/                 # Grundlagen-Übungen
│   └── uebungen/                 # Stream / Optional / Collections Übungen
├── sql-uebungen/                 # SQL-Praxis (CRUD, JOINs, Aggregationen)
└── SESSION_LOG.md                # Chronologische Dokumentation des Lernfortschritts
```
---

## 📚 Detaillierte Lern- und Übungs-Chronik

*Hier dokumentiere ich meinen Lernfortschritt durch kleinere, fokussierte Übungsaufgaben. Sie zeigen den Weg und die fundamentalen Fähigkeiten, die zu den oben genannten Portfolio-Projekten führen.*

### Meilenstein 1.5: Java's Kern-Konzepte (Fundament-Bootcamp)
- [Übung 1: `static` vs. Instanz (`Autofabrik`)](./src/main/java/de/rebelmetal/javaroad/bootcamp/statics/Autofabrik.java)
- [Übung 2: Vererbung & Abstraktion (`Figuren`)](./src/main/java/de/rebelmetal/javaroad/bootcamp/vererbung/)
- [Übung 3: Overloading vs. Overriding (`Drucker`)](./src/main/java/de/rebelmetal/javaroad/bootcamp/overloading_vs_overriding/)
- [Übung 4: `equals` & `hashCode` Vertrag (`Buch`)](./src/main/java/de/rebelmetal/javaroad/bootcamp/equals_hashcode/)

### Meilenstein 2: Kern-APIs (Collections & I/O)
- [Übung 1: Wörterbuch erstellen (`Map` & `BufferedWriter`)](./src/main/java/de/rebelmetal/javaroad/uebungen/collections_io/WoerterbuchManager.java)

### Meilenstein 3: Java 8+ Features
- [Übung 1: Grundlagen von Streams (filter, map)](./src/main/java/de/rebelmetal/javaroad/uebungen/streams_lambdas/Datenverarbeitung.java)
- **Übung 2: Produktsuche (`Stream` & `Optional`)**
  - [Analyse-Logik (`Produktsuche.java`)] ./src/main/java/de/rebelmetal/javaroad/uebungen/optional_streams/Produktsuche.java)
- **Übung 3: Analyse von Kundenbestellungen(`Stream` & `Optional`)**
  - [Analyse-Logik (`BestellAnalyse.java`)](./src/main/java/de/rebelmetal/javaroad/uebungen/streams_optional_vertiefung/BestellAnalyse.java)
  - [Datenmodell (`Bestellung.java` als Record)](./src/main/java/de/rebelmetal/javaroad/uebungen/streams_optional_vertiefung/Bestellung.java)
- **Übung 4 (Wiederholung): Mitarbeiter-Suche (`Stream` & `Optional`)**
  - [Analyse-Logik (`HRAnalyse.java`)](./src/main/java/de/rebelmetal/javaroad/uebungen/streams_optional_wiederholung/HRAnalyse.java)
  - [Datenmodell (`Mitarbeiter.java` als Record)] (./src/main/java/de/rebelmetal/javaroad/uebungen/streams_optional_wiederholung/Mitarbeiter.java)

### Phase 2: Build-Tools, Testing & Datenbanken
- **SQL-Bootcamp - Übung 1: CRUD & einfache SELECTs**
  - [SQL-Skript (`01_crud_und_select.sql`)](./sql-uebungen/01_crud_und_select.sql)
- **SQL-Bootcamp - Übung 2: Daten verknüpfen mit JOINs**
  - [SQL-Skript (`02_joins.sql`)](./sql-uebungen/02_joins.sql)
- **SQL-Bootcamp - Übung 3: Daten aggregieren mit GROUP BY**
  - [SQL-Skript (`03_aggregationen.sql`)](./sql-uebungen/03_aggregationen.sql)

*(Weitere Übungen werden hier hinzugefügt)*


---

## 📞 Kontakt

Du möchtest dich vernetzen? Hier findest du mich:
- **LinkedIn:** [Mein LinkedIn Profil](https://www.linkedin.com/in/christoph-breddin-735b1b2a7/)
- **GitHub:** [Mein GitHub Profil](https://github.com/RebelMetal-dev)