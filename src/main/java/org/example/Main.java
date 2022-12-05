package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Witaj w naszym banku!");

        System.out.println("Wprowadź swoje imię: ");
        String name = scan.nextLine();

        System.out.println("Wprowadź swoje nazwisko: ");
        String lastName = scan.nextLine();

        System.out.println("Wprowadź swoje pesel: ");
        int pesel = scan.nextInt();


        System.out.println("Menu \n 1. Informacje o koncie \n 2. Wplata pieniedzy \n 3. Wyplata pieniedzy \n 4. Wyjscie ";
        );




    }
}