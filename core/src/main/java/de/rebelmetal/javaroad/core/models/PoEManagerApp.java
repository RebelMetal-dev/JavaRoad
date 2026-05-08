package de.rebelmetal.javaroad.core.models;


import de.rebelmetal.javaroad.core.services.BuildService;

public class PoEManagerApp {
    public static void main(String[] args) {
        // 1. Charakter erstellen
        PoECharacter myWitch = PoECharacter.of("NecroWitch", "Witch", 1, "Summoner");
        myWitch.withStats(Attribute.INTELLIGENCE, 150);
        myWitch.withStats(Attribute.DEXTERITY, 40);

        // 2. Service starten und speichern
        BuildService service = new BuildService();
        service.saveBuild(myWitch);

        // 3. Kontrolle: Alle gespeicherten Builds abrufen und ausgeben
        System.out.println("Anzahl gespeicherter Builds: " + service.getAllBuilds().size());

        for (PoECharacter c : service.getAllBuilds()) {
            System.out.println("Gespeicherter Charakter: " + c.name() + " (Level " + c.level() + ")");
        }

        System.out.println("Programm beendet.");
    }
}