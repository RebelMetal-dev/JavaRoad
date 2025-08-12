-- ====================================================================
--  JavaRoad - SQL-Bootcamp - Übung 3: Daten aggregieren
-- ====================================================================
-- Dieses Skript demonstriert die Verwendung von Aggregatfunktionen
-- (COUNT, SUM, MAX) und die Gruppierung von Daten mit GROUP BY
-- sowie die Filterung von Gruppen mit HAVING.
-- ====================================================================


-- --------------------------------------------------------------------
-- TEIL A: Setup - Erstellen der Tabelle und Testdaten
-- --------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS BESTELLUNGEN (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    KUNDE VARCHAR(255) NOT NULL,
    PRODUKT_KATEGORIE VARCHAR(100),
    PREIS DOUBLE,
    BESTELL_DATUM DATE
);

DELETE FROM BESTELLUNGEN;

INSERT INTO BESTELLUNGEN (KUNDE, PRODUKT_KATEGORIE, PREIS, BESTELL_DATUM) VALUES
('Anna', 'Bücher', 49.90, '2025-08-01'),
('Peter', 'Elektronik', 1299.99, '2025-08-01'),
('Anna', 'Haushalt', 89.50, '2025-08-02'),
('Maria', 'Bücher', 24.95, '2025-08-02'),
('Peter', 'Bücher', 44.99, '2025-08-03'),
('Anna', 'Elektronik', 349.50, '2025-08-04');


-- --------------------------------------------------------------------
-- TEIL B: Einfache Aggregatfunktionen
-- --------------------------------------------------------------------

-- Zählt die Gesamtzahl aller Bestellungen in der Tabelle.
SELECT COUNT(*) AS GESAMTANZAHL_BESTELLUNGEN
FROM BESTELLUNGEN;

-- Berechnet die Summe aller Preise (Gesamtumsatz).
SELECT SUM(PREIS) AS GESAMTUMSATZ
FROM BESTELLUNGEN;

-- Findet den höchsten Einzelpreis in der Tabelle.
SELECT MAX(PREIS) AS TEUERSTE_BESTELLUNG
FROM BESTELLUNGEN;


-- --------------------------------------------------------------------
-- TEIL C: Gruppierung mit GROUP BY
-- --------------------------------------------------------------------

-- Gruppiert die Daten nach Kunde und berechnet für jede Gruppe (jeden Kunden)
-- die Anzahl der Bestellungen und den jeweiligen Gesamtumsatz.
SELECT KUNDE, COUNT(*) AS ANZAHL_BESTELLUNGEN, SUM(PREIS) AS UMSATZ_PRO_KUNDE
FROM BESTELLUNGEN
GROUP BY KUNDE;


-- --------------------------------------------------------------------
-- TEIL D: Filtern von Gruppen mit HAVING
-- --------------------------------------------------------------------

-- Findet nur die Kundengruppen, deren Gesamtumsatz (die Summe der Preise)
-- größer als 1000.00 ist.
-- WICHTIG: WHERE filtert einzelne Zeilen VOR der Gruppierung.
--          HAVING filtert ganze Gruppen NACH der Gruppierung.
SELECT KUNDE, SUM(PREIS) AS GESAMTUMSATZ
FROM BESTELLUNGEN
GROUP BY KUNDE
HAVING SUM(PREIS) > 1000;