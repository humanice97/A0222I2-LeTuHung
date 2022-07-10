package phone_manage.controller;

import phone_manage.services.impl.PhoneServices;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneServices manager = new PhoneServices();

        boolean check = true;
        while (check) {
            System.out.println("Menu Product Manager");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Delete Product by Id");
            System.out.println("4. Search Product by Name");
            System.out.println("5. Exited");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("1. Add Product Handed");
                    System.out.println("2. Add Product Genuine");
                    System.out.println("3. Return");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1" -> manager.addNewHandedPhone();
                        case "2" -> manager.addNewGenuinePhone();
                        case "3" -> System.out.println("Return to main menu");
                    }
                    break;
                case "2":
                    System.out.println("1. Display All Product ");
                    System.out.println("2. Return");
                    choose = scanner.nextLine();
                    switch (choose) {
                        case "1" -> manager.displayPhone();
                        case "2" -> System.out.println("Return to main menu");
                    }
                    break;
                case "3":
                    manager.deletePhoneById();
                    break;
                case "4":
                    manager.searchPhoneByName();
                    break;
                case "5":
                    System.out.println("Exited");
                    check = false;
//                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again !! ");
            }

        }
    }
}
