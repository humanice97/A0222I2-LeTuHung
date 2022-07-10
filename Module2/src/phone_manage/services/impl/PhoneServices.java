package phone_manage.services.impl;

import phone_manage.models.GenuinePhone;
import phone_manage.models.HandedPhone;
import phone_manage.models.Phone;
import phone_manage.services.ImplPhoneServices;
import phone_manage.utils.read_and_write.ReadAndWritePhone;
import phone_manage.utils.validate.Validate;

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

    @Override
    public void addNewHandedPhone() {
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
        handedPhones.add(new HandedPhone(name, price, company, country, status));
        System.out.println("Add Success");
        ReadAndWritePhone.writeHandedPhone(handedPhones, HANDED_PHONE);

    }

    @Override
    public void addNewGenuinePhone() {
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
        genuinePhones.add(new GenuinePhone(name, price, company, warrantyPeriod, warrantyCode));
        System.out.println("Add Success");
        ReadAndWritePhone.writeGenuinePhone(genuinePhones, GENUINE_PHONE);
    }

    @Override
    public void deletePhoneById() {
        displayPhone();
        boolean check = true;
        System.out.println("Enter id of phone which you want delete!!");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < createNewList().size(); i++) {
            if (createNewList().get(i).getId() == id) {
                createNewList().remove(i);
                check = false;
                System.out.println("Deleted Success");
                break;
            }
        }
        if (check) {
            System.out.println("Id not found");
        }
    }

    @Override
    public void displayPhone() {
//        try {
//            genuinePhones = ReadAndWritePhone.readGenuinePhone(GENUINE_PHONE);
//            handedPhones = ReadAndWritePhone.readHandedPhone(HANDED_PHONE);
//            if (genuinePhones.isEmpty() || handedPhones.isEmpty()) {
//                throw new IOException("Data is empty");
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
        for (GenuinePhone gp : genuinePhones) {
            System.out.println(gp.toString());
        }
        for (HandedPhone hp : handedPhones) {
            System.out.println(hp.toString());
        }

    }

    @Override
    public void searchPhoneByName() {
        boolean check = false;
        System.out.println("Enter the name need search: ");
        String searchName = scanner.nextLine();
        for (int i = 0; i < createNewList().size(); i++) {
            if (createNewList().get(i).getName().equals(searchName)) {
                System.out.println(createNewList().get(i));
                check = true;
            }
        }
        if (!check) {
            System.out.println("Name not found!");
        }
    }

    public List<Phone> createNewList() {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.addAll(handedPhones);
        phoneList.addAll(genuinePhones);
        return phoneList;
    }

}
