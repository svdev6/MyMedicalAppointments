package ui;

import java.util.Scanner;

public class UIMenu {

    public static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre", };


    public static void showMenu() {
        System.out.println("Welcome to My Medical Appointments!");
        System.out.println("Selecciona una opción");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for visiting! See you next time!");
                    break;
                default:
                    System.out.println("Please select a correct answer!");
            }
        } while (response != 0);
    }

    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. Show my appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 12; i++) {
                        System.out.println((i + 1) + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("Your current appointments");
                    break;
                case 0:
                    System.out.println("Returning to the main menu...");
                    System.out.println("\n");
                    showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer!");
            }
        } while (response != 0);
    }
}
