# CLAUDE.md — JavaRoad: Project Guidelines

Coding standards and architectural rules for this repository.

---

## 1. Project Overview

- **Name:** JavaRoad
- **Purpose:** A multi-module Java project covering fundamentals through Spring Boot,
  with SOLID principles and design patterns implemented as runnable, tested comparisons.
- **Stack:** Java 21, Maven (multi-module), Spring Boot, Spring Data JPA, JUnit 5, Mockito

---

## 2. The Golden Standard (Non-Negotiable)

| What | Rule |
|---|---|
| Code comments and Javadoc | English only |
| Javadoc on public methods | Mandatory in portfolio packages |
| Commit messages | English, format below |
| Records for immutable data models | Mandatory where state is fixed |
| `@Data` on JPA entities | Forbidden — use explicit `@Getter` / `@Setter` |
| `switch` | Switch expressions with `->` (Java 14+), never `case x: break` |
| String checks | `isBlank()`, not `isEmpty()` |
| Java version | Java 21 idioms throughout |

---

## 3. Architecture

```
JavaRoad/  (Maven multi-module)
│
├── core/                 Domain models and business logic
│   ├── models/           PoECharacter (Record, immutable), Attribute (enum)
│   └── services/         BuildService (@Service)
│
├── portfolio-apps/
│   └── poe2-api/         Spring Boot REST API
│                         BuildController, DataInitializer (CommandLineRunner)
│
├── taskmaster/           Spring Boot + JPA — full CRUD REST API
│                         Task entity, TaskDto (Record), TaskService
│
├── design-principles/    SOLID principles: each with a deliberate violation,
│                         a unit test that proves the problem, and the
│                         refactored solution
│
├── sql-uebungen/         SQL scripts (CRUD, JOINs, aggregations)
├── Lernskripte/          Theory scripts (Markdown)
└── CODING_STANDARDS.md   Style guide
```

---

## 4. Git Commit Conventions

Format: `type: short subject`

The body must answer three questions:

1. Why the old code was a problem
2. What scenario triggers it
3. What the new behaviour is

**Types:** `feat` `fix` `docs` `refactor` `test` `chore` `style`

Example:

```
fix: prevent unbounded memory use on library search

Why the old code was a problem: The search buffered the entire database response
before filtering. A large library or a malformed query could consume arbitrary
memory, leading to an OutOfMemoryError.

Trigger scenario: A wildcard search on a library with more than 10,000 entries.

New behaviour: The response is streamed and limited to the first 500 results,
making resource usage predictable.
```

No emojis in commit messages.

---

## 5. Implementation State

**Completed**

- `core`: domain models and services, 7 unit tests (JUnit 5)
- `poe2-api`: Spring Boot REST API, seed data via `CommandLineRunner`
- `taskmaster`: full CRUD REST API (GET, POST, DELETE), DTO pattern with a Record,
  entity-to-DTO mapping via Stream, Mockito unit tests
- `PoECharacter`: refactored from a mutable class to an immutable Record with
  wither methods and a static factory
- `Task`: `@Data` replaced with explicit `@Getter` / `@Setter` — `@Data` derives
  equals/hashCode from all fields including the id, which is null before persist,
  so two unsaved entities compared as equal and broke Set and HashMap behaviour
- `design-principles`: Single Responsibility (violation, test, refactored),
  Open/Closed violation
- Maven build green across all modules

**Open**

- Open/Closed refactoring via the Strategy pattern
- Liskov, Interface Segregation, Dependency Inversion
- GoF patterns: Factory Method, Builder, Strategy, Observer, Decorator, Facade
