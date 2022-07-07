package phone_manage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    public Scanner scanner = new Scanner(System.in);
    public static List<HandedPhone> handedPhones = new ArrayList<>();
    public static List<GenuinePhone> genuinePhones = new ArrayList<>();

//    public void addProductHanded() {
//        Scanner scanner = new Scanner(System.in);
//        List<HandedPhone> handedPhones = new ArrayList<>();
//        System.out.println("Enter the name");
//        String name = scanner.nextLine();
//        System.out.println("Enter the price");
//        double price = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter the company");
//        String company = scanner.nextLine();
//        System.out.println("Enter the country");
//        String country = scanner.nextLine();
//        System.out.println("Enter the status");
//        String status = scanner.nextLine();
//
//        handedPhones.add(new HandedPhone(name, price, company, country, status));
//        System.out.println(handedPhones);
//    }
//
//    public void addProductGenuine() {
//        Scanner scanner = new Scanner(System.in);
//        List<GenuinePhone> genuinePhones = new ArrayList<>();
//        System.out.println("Enter the name");
//        String name = scanner.nextLine();
//        System.out.println("Enter the price");
//        double price = Double.parseDouble(scanner.nextLine());
//        System.out.println("Enter the company");
//        String company = scanner.nextLine();
//        System.out.println("Enter the warranty period");
//        int warrantyPeriod = Integer.parseInt(scanner.nextLine());
//        System.out.println("Enter the warranty code");
//        int warrantyCode = Integer.parseInt(scanner.nextLine());
//
//        genuinePhones.add(new GenuinePhone(name, price, company, warrantyPeriod, warrantyCode));
//        System.out.println(genuinePhones);
//    }

    public void addProduct(boolean check, String nameOP1, String nameOP2) {

        while (true) {
            try {
                System.out.println("Enter the Name");
                String name = scanner.nextLine();
                System.out.println("Enter the Price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter the Company");
                String company = scanner.nextLine();
                System.out.println("Enter the" + nameOP1);
                String op1 = scanner.nextLine();
                System.out.println("Enter the" + nameOP2);
                String op2 = scanner.nextLine();

                if (check) {
                    handedPhones.add(new HandedPhone(name, price, company, op1, op2));
                } else {
                    genuinePhones.add(new GenuinePhone(name, price, company, Integer.parseInt(op1), Integer.parseInt(op2)));
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input err");
            }

        }
    }

    public void displayProduct(boolean check) {

        if (check) {
            for (HandedPhone hp : handedPhones) {
                System.out.println(hp.toString());
            }
        } else {
            for (GenuinePhone gp : genuinePhones) {
                System.out.println(gp.toString());
            }
        }
    }

    public void deleteProductById() {
        boolean check = true;
        System.out.println("Enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < handedPhones.size(); i++) {
            if (handedPhones.get(i).getId() == id) {
                handedPhones.remove(i);
                check = false;
                System.out.println("Deleted Success");
                break;
            }
        }
        for (int i = 0; i < genuinePhones.size(); i++) {
            if (genuinePhones.get(i).getId() == id) {
                genuinePhones.remove(i);
                check = false;
                System.out.println("Deleted Success");
                break;
            }
        }

        if(check) {
            System.out.println("Id not found");
        }


    }
}
