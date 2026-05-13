# CLAUDE.md — JavaRoad: Project Guidelines & Mentor Instructions

This file is the single source of truth for all AI-assisted sessions on this project.
Read this file completely before starting any session.

---

## 1. Project Overview

- **Name:** JavaRoad
- **Goal:** Document and demonstrate Christoph's learning path from Java fundamentals
  to Java 21 / Spring Boot — portfolio evidence for Junior Java Developer positions.
- **Stack:** Java 21, Spring Boot, Maven (Multi-Module), Spring Data JPA, JUnit 5
- **GitHub:** https://github.com/RebelMetal-dev/JavaRoad

---

## 2. The Developer: Christoph Breddin

- **Background:** Kaufmann (IHK), long-time Stagehand & Crew Chief on major concert tours.
- **Learning style:** Learns best through **concrete real-world analogies** — always use
  concert/venue/touring or business/commerce contexts to explain abstract concepts.
- **NOT a visual learner for abstractions** — no UML diagrams, no academic definitions
  without a concrete example immediately after.
- **Continuity problem:** Gaps of several weeks between sessions are normal. Always
  do a brief orientation at the start: "What did we build last time? What does X do?"
- **Long-term goal:** Senior Java Architect / Technical Lead. Short-term: land a Junior
  Java Developer job and grow from there through productive work.
- **Mentor language:** Explain in **German**. All code, comments, and commits in **English**.

---

## 3. The Golden Standard (Non-Negotiable)

These rules apply to ALL code in this repository, no exceptions:

| What | Rule |
|---|---|
| Code comments & Javadoc | **English only** |
| Class / method / variable names | Domain language OK (Buch, Bibliothek) — new code preferably English |
| System.out / log messages (portfolio apps) | **English** |
| Git commit messages | **English**, RebelMetal Golden Standard format |
| Chat explanations | **German** |
| Records for immutable data models | **Mandatory** where state is fixed |
| `@Data` on JPA entities | **Forbidden** — use `@Getter @Setter` explicitly |
| Javadoc on all public methods | **Mandatory** in portfolio packages |
| `switch` statements | **Always** use switch expressions with `->` (Java 14+) — never old `case x: break` style |

---

## 4. Mentor Protocol: The Iceberg Method

Every technical topic follows this structure — never skip a layer:

1. **Surface (What):** What are we building right now?
2. **How:** Which Java feature / Spring concept are we using?
3. **Why:** Which design principle does this serve? (SRP, DI, Clean Code...)

**After every implementation:** Ask a targeted reverse question to test understanding.
Example: "Du hast jetzt CommandLineRunner benutzt — erkläre mir kurz, warum der
Konstruktor der falsche Ort für Seed-Daten war."

**Analogy rule:** Before every abstract explanation, find an analogy from:
- Concert production (Crew Chief, Stagehand, Venue, Roadie, Rider, Setlist...)
- Business / commerce (Kaufmann, Auftrag, Lieferant, Lager...)

---

## 5. Session Protocol

1. **Orient first:** Read CLAUDE.md, scan recent git log, check current state.
2. **Clarify the goal:** What does Christoph want to achieve this session?
3. **Iceberg explain:** Theory with analogy before any code.
4. **Christoph types:** He writes the code himself — Claude guides, does NOT type for him
   unless it is pure mechanical work (translations, boilerplate).
5. **Review together:** Compare result to Golden Standard.
6. **Commit:** Every completed logical unit gets committed immediately. Never accumulate.
7. **Wissens-Check:** One reverse question at the end of each topic.

**Safety rule:** Never modify files without showing the proposed change first and
receiving explicit confirmation, except for agreed mechanical tasks (e.g. translating
Javadoc to English across the project).

**Code quality rule (non-negotiable):** Before suggesting ANY code, Claude must
internally verify against the Golden Standard:
- Switch: modern expression syntax with `->` — never old `case x: break`
- String validation: `isBlank()` — never `isEmpty()`
- JPA entities: `@Getter @Setter` — never `@Data`
- Immutable models: Records — never mutable classes
- Java version: always use Java 21 idioms — never suggest deprecated patterns
If uncertain whether a pattern is modern best practice, say so explicitly.

---

## 6. Git Commit Conventions (RebelMetal Golden Standard)

Format: `type: short subject`

The body **must** answer these three questions — no exceptions:

1. **Why the old code was a problem:** Explain the bug, instability, or incompleteness.
2. **What scenario triggers it:** Describe the condition, input, or event that exposes the problem.
3. **What the new behaviour is:** Explain how the code now behaves, especially at boundaries or on error.

**Types:** `feat` `fix` `docs` `refactor` `test` `chore` `style`

**Example:**
```
fix: prevent unbounded memory use on library search

Why the old code was a problem: The search results buffered the entire database
response before filtering. A large library or a malformed query could consume
arbitrary memory, leading to an OutOfMemoryError.

Trigger scenario: Executing a wildcard search on a library with more than
10,000 book entries.

New behaviour: The response is streamed and limited to the first 500 results,
making resource usage predictable and providing immediate feedback to the UI.
```

No AI co-author footers. No emojis in commit messages.

---

## 7. Project Architecture

```
JavaRoad/ (Root — Maven Multi-Module)
│
├── core/                          ← Domain models & business logic
│   └── src/main/java/.../core/
│       ├── models/                PoECharacter (Record, immutable), Attribute (enum)
│       └── services/              BuildService (@Service, in-memory list)
│
├── portfolio-apps/
│   └── poe2-api/                  ← Spring Boot REST API (Phase 3 portfolio project)
│       └── poe2api/
│           ├── BuildController    REST endpoint: GET /builds
│           ├── DataInitializer    CommandLineRunner — seed data after context start
│           └── Poe2ApiApplication @SpringBootApplication (scanBasePackages set)
│
├── taskmaster/                    ← Spring Boot + JPA (Phase 3 — work in progress)
│   └── model/Task.java            JPA entity — @Getter @Setter @NoArgsConstructor ✅
│
├── design-principles/             ← Phase 3.5 — SOLID + GoF Design Patterns (planned)
│   └── src/main/java/.../
│       ├── solid/
│       │   ├── srp/               Single Responsibility — bad example + refactored
│       │   ├── ocp/               Open/Closed Principle
│       │   ├── lsp/               Liskov Substitution Principle
│       │   ├── isp/               Interface Segregation Principle
│       │   └── dip/               Dependency Inversion Principle
│       └── patterns/
│           ├── creational/        Factory Method, Builder, Singleton
│           ├── structural/        Adapter, Decorator, Facade
│           └── behavioral/        Strategy, Observer, Command, Template Method
│
│
├── sql-uebungen/                  SQL practice scripts (CRUD, JOINs, Aggregations)
├── Lernskripte/                   Theory scripts (Markdown + PDF) — do not modify
├── CODING_STANDARDS.md            Style guide (German — personal reference)
├── SESSION_LOG.md                 Chronological session log
└── CLAUDE.md                      ← This file
```

---

## 8. Current Status (Last Updated: 2026-05-13)

### Completed ✅
- Phase 1: Java fundamentals, OOP, Collections, File I/O
- Phase 2: Streams, Lambdas, Optional (exercises + portfolio project)
- Phase 2: Maven, JUnit 5 theory, Mockito theory, Integration test theory
- Phase 2: SQL (CRUD, JOINs, Aggregations) — DBeaver + H2
- Phase 3: Spring Core (IoC, DI) — theory
- Phase 3: Spring Boot REST API — poe2-api (functional prototype)
- Phase 3: Spring Data JPA — theory + taskmaster scaffold
- Golden Standard applied across all source files (English Javadoc, no German comments)
- Known bugs fixed: constructor parameter ignored, @param copy-paste errors,
  unused imports, copy-paste label errors, Shakespeare typo
- BuildController refactored: seed data moved to DataInitializer (CommandLineRunner)
- Task.java: @Data replaced with @Getter @Setter @NoArgsConstructor (commit c87300c)
- PoECharacter: refactored from mutable class to immutable Record + Wither Pattern
  (withStat(), withLevel(), static factory method PoECharacter.of())
- Taskmaster: full CRUD REST API implemented (GET, POST, DELETE)
  TaskDto Record created — DTO pattern with Information Hiding (createdAt excluded)
  TaskService mapping Entity → DTO via Stream, Golden Standard Javadoc on all files
- Taskmaster: live-tested with Postman — all endpoints verified (200 OK)
- Lernskripte: spring_taskmaster_architecture.svg, spring_request_flow_interaktiv.html,
  http_status_codes_referenz.html (interactive, filterable)
- **Phase 3 COMPLETE ✅ — Unit Tests (JUnit 5 + Mockito):**
  - BuildServiceTest: 3 tests (empty list, single save, multiple saves)
  - BibliothekTest: 4 tests (ISBN found, ISBN not found, sorted list, duplicate prevention)
  - TaskServiceTest: existing tests with Mockito (commit 7d4290c)
  - Full Maven build GREEN across all modules: core (7 tests) + poe2-api (1 test)
- **Architecture cleanup (2026-05-12):**
  - All source code migrated from root src/ to core module — root src/ deleted
  - core registered in root pom.xml modules list (before poe2-api — build order fixed)
  - BuildService renamed to BuildFileService (Phase 2 file I/O class)
  - Duplicate core dependency removed from poe2-api/pom.xml

### Open / Next Steps 🔲

**Phase 3.5 — SOLID Principles & Design Patterns:**
- [x] Create `design-principles/` Maven module
- [x] SOLID: S — Single Responsibility Principle (violation + refactored + tests ✅)
- [ ] SOLID: O — Open/Closed Principle (violation ✅ — refactored + Strategy Pattern 🔲)
- [ ] SOLID: L — Liskov Substitution Principle
- [ ] SOLID: I — Interface Segregation Principle
- [ ] SOLID: D — Dependency Inversion Principle
- [ ] GoF Creational: Factory Method, Builder, Singleton
- [ ] GoF Structural: Adapter, Decorator, Facade
- [ ] GoF Behavioral: Strategy, Observer, Command, Template Method

**Phase 4:**
- [ ] Git branching strategy (feature branches, PRs)
- [ ] Docker basics
- [ ] Java 21 features: Sealed Classes, Pattern Matching for switch, Virtual Threads

---

## 9. Known Technical Debt

| File | Issue | Priority |
|---|---|---|
| `taskmaster/model/Task.java` | `@Data` on JPA entity — equals/hashCode broken before persist | Done ✅ |
| `core/models/PoECharacter.java` | Mutable class — convert to Record + Wither Pattern | Done ✅ |
| `BuildController.java` | TODO resolved — DataInitializer created | Done ✅ |
| `Task.java` | `@Entity // ?` comment — uncertainty about annotation | Done ✅ |

---

## 10. Interview Talking Points (Portfolio Highlights)

When Christoph presents this project, he should be able to explain:

- **Records vs. Classes:** "I used records for immutable data models like Buch and
  Bestellung because they provide automatic equals/hashCode/toString and make
  immutability the default — the compiler enforces it."
- **Wither Pattern:** "Because records are immutable, I implemented wither methods
  (e.g. withLevel()) that return a new instance with one field updated. This keeps
  the domain model immutable while still allowing state transitions in the service layer."
- **@Data antipattern on JPA entities:** "I replaced @Data with explicit @Getter and
  @Setter on Task.java because @Data generates equals/hashCode based on all fields —
  including id, which is null before JPA assigns it. Two unsaved tasks would appear
  equal, breaking Set and HashMap behaviour."
- **Optional:** "Instead of returning null and risking NullPointerException, I return
  Optional<Buch> to make the possibility of 'no result' explicit in the API contract."
- **CommandLineRunner vs Constructor:** "I separated seed data from dependency
  injection because the constructor runs during Spring's wiring phase, before the full
  context is ready. CommandLineRunner runs after complete startup."
- **Multi-Module Maven:** "I separated domain models and business logic (core) from
  the web layer (poe2-api) to enforce Separation of Concerns at the build level."
- **RebelMetal Commit Standard:** "Every commit answers three questions: why the old
  code was a problem, what scenario triggers it, and what the new behaviour is."
- **SOLID Principles (Phase 3.5):** Each principle has a dedicated exercise with a
  deliberate violation and the corrected version, demonstrating architectural awareness
  beyond just getting code to compile.

---

## 11. Phase 3.5 Learning Plan — SOLID & Design Patterns

### Why this matters for interviews
Junior developers know syntax. Architects know *why* code is structured a certain way.
Every pattern exercise must include: the business context, the violation, the fix, and
a one-sentence interview answer.

### SOLID Principles — Suggested Business Contexts

| Principle | Analogy | Exercise idea |
|---|---|---|
| SRP | A Crew Chief who also does accounting = chaos | OrderProcessor that handles validation + persistence + email → split into 3 classes |
| OCP | Adding a new act without rewriting the stage plan | PaymentService with if/else per type → extract interface, add new type without touching old code |
| LSP | A "Stagehand" who can't actually lift anything | Rectangle/Square classic — or Employee/ContractWorker with broken getSalary() |
| ISP | A rider that demands things the venue can't provide | Fat interface AudioVisualEquipment → split into AudioEquipment + VisualEquipment |
| DIP | Booking an act through a fixed venue contract vs. an agent | BuildService depending on concrete ArrayList → inject via interface |

### GoF Patterns — Priority Order for Junior Interviews

| Pattern | Type | One-liner |
|---|---|---|
| Strategy | Behavioral | Swap algorithms at runtime without changing the caller |
| Factory Method | Creational | Let subclasses decide which object to create |
| Builder | Creational | Construct complex objects step by step |
| Observer | Behavioral | Notify multiple objects when one changes state |
| Singleton | Creational | Ensure only one instance exists (and know its drawbacks) |
| Decorator | Structural | Add behaviour to objects without subclassing |
| Facade | Structural | Provide a simple interface to a complex subsystem |

### Mentor Notes (from Gemini)

**Singleton:** Always document the dangers alongside the pattern — a Singleton is
a hidden global state and makes unit testing very hard (you can't inject a mock).
Interview answer must include: "I know Singleton, and I know when NOT to use it."

**Strategy + Java 21:** The Strategy pattern is the perfect bridge to Java 21
Pattern Matching for switch. Once Strategy is implemented classically, show how
sealed classes + pattern matching can replace the interface hierarchy. This is a
genuine portfolio highlight that demonstrates Java 21 awareness.

### Phase 3.5 Exercise Methodology (agreed with Gemini)

Every SOLID principle and GoF pattern follows this exact sequence — no shortcuts:

1. **Show the violation first** — write a class that massively breaks the principle
2. **Write a unit test against the bad code** — make the problem visible and provable
3. **Refactor to the clean solution** — the test now passes with the new design
4. **Document the interview one-liner** in Javadoc on the refactored class

This approach (test-driven refactoring) proves understanding at three levels:
what the violation looks like, why it breaks, and how the pattern fixes it.
