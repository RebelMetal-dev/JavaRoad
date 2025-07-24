package de.rebelmetal.javaroad.bootcamp.overloading_vs_overriding;

import java.util.Scanner;

public class DruckerTest {

    public static void main(String[] args) {


        Drucker meinDrucker = new Drucker();
        meinDrucker.drucken("ene menen popel");
        meinDrucker.drucken("LEtz Fetz", 4);
        meinDrucker.drucken(33);

        FarbDrucker meinFarbDrucker = new FarbDrucker("Ansi-Gelb");
        meinFarbDrucker.drucken("Veni Vidi Vici");

        Drucker polyDrucker = new FarbDrucker("Ansi-Rot");
        polyDrucker.drucken("Veni Vidi Vici");

    }
}
