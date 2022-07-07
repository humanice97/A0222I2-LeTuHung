package phone_manage;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        boolean check = true;
        while (check) {
            System.out.println("Menu Product Manager");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Delete Product by Id");
            System.out.println("4. Search Product by Name");
            System.out.println("0. Exited");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("1. Add Product Handed");
                    System.out.println("2. Add Product Genuine");
                    System.out.println("3. Return");
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1 -> manager.addProduct(true," Country", " Status");
                        case 2 -> manager.addProduct(false," Warranty Period"," Warranty Code");
                        case 3 -> System.out.println("Return to main menu");
                    }
                    break;
                case 2:
                    System.out.println("1. Display Product Handed");
                    System.out.println("2. Display Product Genuine");
                    System.out.println("3. Return");
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1 -> manager.displayProduct(true);
                        case 2 -> manager.displayProduct(false);
                        case 3 -> System.out.println("Return to main menu");
                    }
                    break;
                case 3:
                    manager.deleteProductById();
                    break;
                case 4:
                    break;
                case 0:
                    System.out.println("Exited");
                    check = false;
                    break;
            }
        }
    }
}
