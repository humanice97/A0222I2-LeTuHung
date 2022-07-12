package phone_manage.utils.validate;

import java.util.Scanner;

public class Validate {
    public static Scanner scanner = new Scanner(System.in);

    public String checkIsEmpty() {
        while (true) {
            String result = scanner.nextLine().trim();
            if (!result.isEmpty()) {
                return result;
            } else {
                System.out.println("Your input must be not null");
                System.out.println("Please input again");
            }
        }
    }

    public int checkInputInt() {
        boolean check;
        while (true) {
            String result = checkIsEmpty();
            check = result.matches("^\\d+$");
            if (check) {
                return Integer.parseInt(result);
            } else {
                System.out.println("Your input must be not string");
                System.out.println("Please input again");
            }
        }
    }
    public String checkInputString(){
        boolean check;
        while (true){
            String result = checkIsEmpty();
            check = result.matches("^[A-Za-z ]+$");
            if(check){
                return result;
            } else {
                System.out.println("Your input must be not number");
                System.out.println("Please input again");
            }
        }
    }
    public double checkInputDouble(){
        boolean check;
        while (true){
            String result = checkIsEmpty();
            check = result.matches("^\\d+\\.\\d+$");
            if(check){
                return Double.parseDouble(result);
            } else {
                System.out.println("Your input must be not string and int");
                System.out.println("Please input again");
            }
        }
    }
}
