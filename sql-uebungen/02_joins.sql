-- =============================================================
--  JavaRoad - SQL-Bootcamp - Übung 2: Daten verknüpfen mit JOINs
-- =============================================================
-- Dieses Skript demonstriert die Verwendung von INNER, LEFT und RIGHT
-- JOINs, um Daten aus mehreren verknüpften Tabellen abzufragen.
-- =============================================================

-- -------------------------------------------------------------
-- TEIL A: Setup - Erstellen der Tabellen und Testdaten
-- -------------------------------------------------------------

-- A.1: Alte Tabellen löschen für einen sauberen, wiederholbaren Start.
DROP TABLE IF EXISTS PRODUKTE;
DROP TABLE IF EXISTS AUTOREN;

-- A.2: AUTOREN-Tabelle erstellen.
CREATE TABLE AUTOREN (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(255) NOT NULL
);

-- A.3: PRODUKTE-Tabelle mit Fremdschlüssel-Beziehung zu AUTOREN erstellen.
CREATE TABLE PRODUKTE (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    TITEL VARCHAR(255) NOT NULL,
    PREIS DOUBLE,
    KATEGORIE VARCHAR(100),
    AUTOR_ID INT,
    FOREIGN KEY (AUTOR_ID) REFERENCES AUTOREN(ID)
);

-- A.4: Autoren und Produkte einfügen.
INSERT INTO AUTOREN (ID, NAME) VALUES (1, 'Christian Ullenboom'), (2, 'Robert C. Martin'), (3, 'Kathy Sierra');
INSERT INTO PRODUKTE (TITEL, PREIS, KATEGORIE, AUTOR_ID) VALUES
('Java ist auch eine Insel', 49.90, 'Bücher', 1),
('Clean Code', 44.99, 'Bücher', 2),
('Head First Java', 59.90, 'Bücher', 3),
('Premium Laptop Pro', 1499.99, 'Elektronik', NULL);

-- A.5: Füge einen Autor OHNE zugeordnetes Buch hinzu, um OUTER JOINs zu demonstrieren.
INSERT INTO AUTOREN (NAME) VALUES ('Martin Fowler');


-- -------------------------------------------------------------
-- TEIL B: JOIN-Abfragen
-- -------------------------------------------------------------

-- B.1: INNER JOIN - Gibt nur die Schnittmenge zurück (Produkte, die einen Autor haben).
-- Ergebnis: 3 Zeilen. Der Laptop fehlt. Martin Fowler fehlt.
SELECT P.TITEL, A.NAME AS AUTOREN_NAME -- AS gibt der Spalte einen neuen Namen für die Ausgabe
FROM PRODUKTE P
INNER JOIN AUTOREN A ON P.AUTOR_ID = A.ID;


-- B.2: LEFT JOIN - Gibt ALLE Zeilen der linken Tabelle (PRODUKTE) zurück.
-- Ergebnis: 4 Zeilen. Der Laptop ist dabei, sein Autorenname ist NULL.
SELECT P.TITEL, A.NAME AS AUTOREN_NAME
FROM PRODUKTE P
LEFT JOIN AUTOREN A ON P.AUTOR_ID = A.ID;


-- B.3: RIGHT JOIN - Gibt ALLE Zeilen der rechten Tabelle (AUTOREN) zurück.
-- Ergebnis: 4 Zeilen (in H2, manche DBs zeigen 5). Martin Fowler ist dabei, sein Titel ist NULL.
SELECT P.TITEL, A.NAME AS AUTOREN_NAME
FROM PRODUKTE P
RIGHT JOIN AUTOREN A ON P.AUTOR_ID = A.ID;