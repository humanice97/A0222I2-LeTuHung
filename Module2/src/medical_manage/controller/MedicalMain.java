package medical_manage.controller;

import medical_manage.services.MedicalServices;
import medical_manage.utils.validate.ValidateMedical;

import java.util.Scanner;

public class MedicalMain {
    public static Scanner scanner = new Scanner(System.in);
    public static MedicalServices medicalServices = new MedicalServices();
    static ValidateMedical validateMedical = new ValidateMedical();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu Medical Record Manager");
            System.out.println("1. Add Medical Record");
            System.out.println("2. Display Medical Record");
            System.out.println("3. Delete Medical Record by Id");
            System.out.println("4. Exited");
            int choice = getChoose();
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    System.out.println("Exited");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again !! ");
            }
        }
    }

    public static void create() {
        System.out.println("1. Add Normal Medical Record");
        System.out.println("2. Add VIP Medical Record");
        int choice = validateMedical.checkInputIntLimit(1, 2);
        medicalServices.createMedicalRecord(choice);
    }

    public static void display() {
        System.out.println("1. Display All Product ");
        System.out.println("2. Return");
        int choice = getChoose();
        switch (choice) {
            case 1:
                medicalServices.displayMedicalRecord();
                break;
            case 2:
                System.out.println("Return to main menu");
                break;
        }
    }

    public static void delete() {
        System.out.println("Enter id if you remove! ");
        int id = Integer.parseInt(scanner.nextLine());
        medicalServices.deleteMedicalRecord(id);
    }

    public static int getChoose() {
        int choose;
        choose = Integer.parseInt(scanner.nextLine());
        return choose;
    }

}
