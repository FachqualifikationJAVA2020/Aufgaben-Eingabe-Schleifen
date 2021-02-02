package de.bfz;

import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
	    // Scanner zum Einlesen der Eingabe
        Scanner sc = new Scanner(System.in);

        // Eingabe in Variable speichern
        System.out.print("Bitte eine Ganzzahl eingeben: ");
        int num = sc.nextInt();
        sc.close();

        // Bei Zahlen unter 0 wird das Programm beendet
        if(num > 0) {

            // Variablen zur Berechnung
            int quer, i, rest;
            quer = 0;
            i = num;

            // Berechnung
            while (num > 0) {
                rest = num % 10;
                quer = quer + rest;
                num = num / 10;
            }

            // Ausgabe
            System.out.println("Quersumme von " + i + " = " + quer);
        }
    }
}
