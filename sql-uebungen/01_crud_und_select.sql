-- ====================================================================
--  JavaRoad - SQL-Bootcamp - Übung 1: CRUD & SELECT Grundlagen
-- ====================================================================
-- Dieses Skript ist ein authentisches Protokoll unserer interaktiven
-- Lerneinheit. Es enthält alle Befehle in der Reihenfolge,
-- in der wir sie erarbeitet haben.
-- ====================================================================


-- --------------------------------------------------------------------
-- TEIL A: Initiales Setup und erste Daten
-- --------------------------------------------------------------------

-- A.1: Erstellen der grundlegenden Tabellenstruktur.
CREATE TABLE PRODUKTE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL,
    PREIS DOUBLE,
    KATEGORIE VARCHAR(100)
);

-- A.2: Einfügen des ersten, einfachen Datensatzes.
INSERT INTO PRODUKTE (NAME, PREIS, KATEGORIE) VALUES ('Laptop Pro X', 1499.99, 'Elektronik');
INSERT INTO PRODUKTE (NAME, PREIS, KATEGORIE) VALUES ('Kaffee-Vollautomat', 689.50, 'Haushalt');
INSERT INTO PRODUKTE (NAME, PREIS, KATEGORIE) VALUES ('Java-Lehrbuch', 49.95, 'Bücher');


-- --------------------------------------------------------------------
-- TEIL B: Grundlegende Lese-Operationen (SELECT)
-- --------------------------------------------------------------------

-- B.1: Alle Spalten und Zeilen auslesen.
SELECT * FROM PRODUKTE;

-- B.2: Nur bestimmte Spalten für eine Übersicht auswählen.
SELECT NAME, PREIS FROM PRODUKTE;

-- B.3: Filtern nach einem exakten Textwert mit WHERE.
SELECT * FROM PRODUKTE WHERE NAME = 'Laptop Pro X';

-- B.4: Filtern nach einem numerischen Wert.
SELECT * FROM PRODUKTE WHERE PREIS > 100;

-- B.5: Einfaches Filtern mit dem LIKE-Wildcard (beginnt mit...).
SELECT * FROM PRODUKTE WHERE KATEGORIE LIKE 'Elektronik%';


-- --------------------------------------------------------------------
-- TEIL C: Vertiefung mit erweitertem Datensatz
-- --------------------------------------------------------------------

-- C.1: Bereinigen der Tabelle für den nächsten Lernschritt.
DELETE FROM PRODUKTE;

-- C.2: Einfügen eines größeren Datensatzes, inklusive eines absichtlichen Fehlers für die UPDATE-Übung.
INSERT INTO PRODUKTE (NAME, PREIS, KATEGORIE) VALUES
('Premium Laptop Pro', 1499.99, 'Elektronik'),
('Standard Laptop', 899.00, 'Elekttronikk'), -- Absichtlicher Tippfehler für UPDATE-Demo
('Kaffee-Vollautomat', 689.50, 'Haushaltsgeräte'),
('Espresso-Maschine', 250.00, 'Haushaltsgeräte'),
('Das Java Lehrbuch', 49.95, 'Bücher'),
('SQL für Einsteiger - Das Buch', 39.95, 'Bücher');


-- --------------------------------------------------------------------
-- TEIL D: Vertiefung der LIKE-Operation
-- --------------------------------------------------------------------

-- D.1: Findet alles, was mit 'Laptop' anfängt.
SELECT * FROM PRODUKTE WHERE NAME LIKE 'Laptop%';

-- D.2: Findet alles, was auf 'Buch' endet.
SELECT * FROM PRODUKTE WHERE NAME LIKE '%Buch';

-- D.3: Findet alles, was 'Java' irgendwo enthält.
SELECT * FROM PRODUKTE WHERE NAME LIKE '%Java%';

-- D.4: Kombiniert einen exakten Filter mit einem LIKE-Filter.
SELECT * FROM PRODUKTE WHERE KATEGORIE = 'Haushaltsgeräte' AND NAME LIKE '%Maschine%';


-- --------------------------------------------------------------------
-- TEIL E: Daten-Modifikation (UPDATE & DELETE)
-- --------------------------------------------------------------------

-- E.1: Aktualisiert einen bestehenden Datensatz, um den absichtlichen Fehler zu korrigieren.
UPDATE PRODUKTE SET KATEGORIE = 'Elektronik' WHERE NAME = 'Standard Laptop';

-- E.2: Löscht einen bestehenden Datensatz.
DELETE FROM PRODUKTE WHERE NAME = 'SQL für Einsteiger - Das Buch';


-- --------------------------------------------------------------------
-- TEIL F: Finale Überprüfung
-- --------------------------------------------------------------------

-- Zeigt den finalen Zustand der Tabelle nach allen Manipulationen an.
SELECT * FROM PRODUKTE;