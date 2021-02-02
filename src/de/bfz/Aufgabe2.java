package de.bfz;

import java.util.Scanner;

public class Aufgabe2 {
    public static void main(String[] args) {
        // Scanner zum Einlesen der Eingabe
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte ganze Zahl eingeben: ");
        int num = scanner.nextInt();
        scanner.close();

        // Berechnung
        System.out.print("Teiler von " + num + ": ");
        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(num);
    }
}
