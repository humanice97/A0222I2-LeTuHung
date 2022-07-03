package case_study.controllers;

import java.util.Scanner;

public class FuramaController {
    public static void displayMainMenu() {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Managementd\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            int choose;
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1\tDisplay list employees\n" +
                            "2\tAdd new employee\n" +
                            "3\tEdit employee\n" +
                            "4\tReturn main menu\n");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Returned main menu");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Returned main menu");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Returned main menu");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            System.out.println("Returned main menu");
                            break;
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    choose = input.nextInt();
                    switch (choose) {
                        case 1:
                        case 2:
                        case 3:
                            System.out.println("Returned main menu");
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Exited");
                    check = false;
                    break;
            }
        }

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
