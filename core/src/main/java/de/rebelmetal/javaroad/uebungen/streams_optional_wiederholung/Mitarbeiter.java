package de.rebelmetal.javaroad.uebungen.streams_optional_wiederholung;

/**
 * Represents an employee with an ID, name, department, and salary.
 * Serves as the data model for the Streams & Optional review exercise.
 *
 * @author Christoph Breddin
 * @version 1.0
 * @param id         the unique ID of the employee.
 * @param name       the name of the employee.
 * @param abteilung  the department the employee works in.
 * @param gehalt     the annual salary of the employee.
 */
public record Mitarbeiter(int id, String name, String abteilung, double gehalt) {}
