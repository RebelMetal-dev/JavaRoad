package de.rebelmetal.javaroad.portfolio.poe2manager;

public class PoEManagerApp {
    public static void main(String[] args) {
        // 1. Charakter erstellen
        PoECharacter myWitch = new PoECharacter("NecroWitch", "Witch");
        myWitch.setStat(Attribute.INTELLIGENCE, 150);
        myWitch.setStat(Attribute.DEXTERITY, 40);

        // 2. Service starten und speichern
        BuildService service = new BuildService();
        service.saveBuild(myWitch);

        System.out.println("Programm beendet.");
    }
}