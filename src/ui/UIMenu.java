package ui;

import java.util.Scanner;

public class UIMenu {
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
                    break;
                case 2:
                    System.out.println("Your current appointments");
                    break;
                case 0:
                    System.out.println("Thank you for visiting! See you next time!");
                    break;
                default:
                    System.out.println("Please select a correct answer!");
            }
        } while (response != 0);
    }
}
