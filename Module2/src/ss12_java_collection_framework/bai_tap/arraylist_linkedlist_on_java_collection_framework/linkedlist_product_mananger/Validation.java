package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.linkedlist_product_mananger;

import java.util.Scanner;

public class Validation {
    public final Scanner scanner = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            int result = Integer.parseInt(scanner.nextLine().trim());
            if (result < min || result > max) {
                System.out.println("Your input wrong");
            } else {
                return result;
            }
        }
    }

    public String checkInputStringInt() {
        boolean check = false;
        while (true) {
            String result = scanner.nextLine();
            check = result.matches("^\\d+$");
            if (!result.isEmpty() && check) {
                return result;
            } else {
                System.out.println("Your input must be not string and null");
                System.out.println("Please input again");
            }
        }
    }

    public String checkInputStringDouble() {
        boolean check = false;
        while (true) {
            String result = scanner.nextLine();
            check = result.matches("^\\d+\\.\\d+$");
            if (!result.isEmpty() && check) {
                return result;
            } else {
                System.out.println("Your input must be not string and null");
                System.out.println("Please input again");
            }
        }
    }

    public int checkInputInt() {
        while (true) {
            String result = checkInputStringInt();
            if (Integer.parseInt(result) >= 0) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Invalid");
            }
        }
    }

    public double checkInputDouble() {
        while (true) {
            String result = checkInputStringDouble();
            if (Double.parseDouble(result) > 0.00) {
                return Double.parseDouble((result));
            } else {
                System.out.println("Invalid value\n Please check again");
            }
        }
    }
}
