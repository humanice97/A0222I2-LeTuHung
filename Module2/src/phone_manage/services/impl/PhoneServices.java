package phone_manage.services.impl;

import phone_manage.models.GenuinePhone;
import phone_manage.models.HandedPhone;
import phone_manage.models.Phone;
import phone_manage.services.ImplPhoneServices;
import phone_manage.utils.read_and_write.ReadAndWritePhone;
import phone_manage.utils.validate.CheckSearchException;
import phone_manage.utils.validate.Validate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneServices implements ImplPhoneServices {
    public Scanner scanner = new Scanner(System.in);
    public static Validate validate = new Validate();
    public static List<HandedPhone> handedPhones = new ArrayList<>();
    public static List<GenuinePhone> genuinePhones = new ArrayList<>();
    public static final String HANDED_PHONE = "src/phone_manage/data/handed_phone.csv";
    public static final String GENUINE_PHONE = "src/phone_manage/data/genuine_phone.csv";

    static {
        try {
            genuinePhones = ReadAndWritePhone.readGenuinePhone(GENUINE_PHONE);
            handedPhones = ReadAndWritePhone.readHandedPhone(HANDED_PHONE);
            if (genuinePhones.isEmpty() || handedPhones.isEmpty()) {
                throw new IOException("Data is empty");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void addNewHandedPhone() {
        List<HandedPhone> newHand = new ArrayList<>();
        handedPhones = ReadAndWritePhone.readHandedPhone(HANDED_PHONE);
        int id;
        if (handedPhones.isEmpty()) {
            id = 1;
        } else {
            id = handedPhones.get(handedPhones.size() - 1).getId() + 1;
        }
        System.out.println("Enter the name");
        String name = validate.checkInputString();
        System.out.println("Enter the price");
        double price = validate.checkInputDouble();
        System.out.println("Enter the company");
        String company = validate.checkInputString();
        System.out.println("Enter the country");
        String country = validate.checkInputString();
        System.out.println("Enter the status");
        String status = validate.checkInputString();
        System.out.println("Add Success");
        newHand.add(new HandedPhone(id, name, price, company, country, status));
        ReadAndWritePhone.writeHandedPhone(newHand, HANDED_PHONE, true);

    }

    @Override
    public void addNewGenuinePhone() {
        List<GenuinePhone> newGenuine = new ArrayList<>();
        genuinePhones = ReadAndWritePhone.readGenuinePhone(GENUINE_PHONE);
        int id;
        if (genuinePhones.isEmpty()) {
            id = 1;
        } else {
            id = genuinePhones.get(genuinePhones.size() - 1).getId() + 1;
        }
        System.out.println("Enter the name");
        String name = validate.checkInputString();
        System.out.println("Enter the price");
        double price = validate.checkInputDouble();
        System.out.println("Enter the company");
        String company = validate.checkInputString();
        System.out.println("Enter the warranty period");
        int warrantyPeriod = validate.checkInputInt();
        System.out.println("Enter the warranty code");
        int warrantyCode = validate.checkInputInt();
        newGenuine.add(new GenuinePhone(id, name, price, company, warrantyPeriod, warrantyCode));
        System.out.println("Add Success");
        ReadAndWritePhone.writeGenuinePhone(newGenuine, GENUINE_PHONE, true);
    }

    @Override
    public void deletePhoneById() {
        displayPhone();
        System.out.println("1. Delete HandedPhone");
        System.out.println("2. Delete GenuinePhone");
        int choice = validate.checkInputInt();
        if (choice == 1) {
            System.out.println("Enter id of handed phone which you want delete!!");
            int id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < handedPhones.size(); i++) {
                if (handedPhones.get(i).getId() == id) {
                    handedPhones.remove(i);
                    ReadAndWritePhone.writeHandedPhone(handedPhones, HANDED_PHONE, false);
                    System.out.println("Deleted Success");
                    break;
                }
            }
        } else {
            System.out.println("Enter id of genuine phone which you want delete!!");
            int id = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < genuinePhones.size(); i++) {
                if (genuinePhones.get(i).getId() == id) {
                    genuinePhones.remove(i);
                    ReadAndWritePhone.writeGenuinePhone(genuinePhones, GENUINE_PHONE, false);
                    System.out.println("Deleted Success");

                    break;

                }
            }
        }

    }

    @Override
    public void displayPhone() {
        try {
            genuinePhones = ReadAndWritePhone.readGenuinePhone(GENUINE_PHONE);
            handedPhones = ReadAndWritePhone.readHandedPhone(HANDED_PHONE);
            if (genuinePhones.isEmpty() || handedPhones.isEmpty()) {
                throw new IOException("Data is empty");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        int count = 1;
        for (GenuinePhone gp : genuinePhones) {
            System.out.println("No " + count++ + ". " + gp.toString());
        }
        for (HandedPhone hp : handedPhones) {
            System.out.println("No " + count++ + ". " + hp.toString());
        }

    }

    @Override
    public void searchPhoneByName() throws CheckSearchException {
        System.out.println("Enter the name need search: ");
        String searchName = scanner.nextLine();
        for (int i = 0; i < createNewList().size(); i++) {
            if (createNewList().get(i).getName().contains(searchName)) {
                System.out.println(createNewList().get(i));
            } else {
                throw new CheckSearchException("Name not found!");
            }
        }
    }

    public List<Phone> createNewList() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.addAll(handedPhones);
        phoneList.addAll(genuinePhones);
        return phoneList;
    }

}
