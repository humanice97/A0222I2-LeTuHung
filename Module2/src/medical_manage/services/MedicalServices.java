package medical_manage.services;

import medical_manage.controller.MedicalMain;
import medical_manage.models.MedicalRecord;
import medical_manage.models.NormalMedicalRecord;
import medical_manage.models.VipMedicalRecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalServices implements ImpMedicalRecord {
    public static Scanner scanner = new Scanner(System.in);
    public static List<MedicalRecord> medicalRecords = new ArrayList<>();

    @Override
    public void createMedicalRecord(int choice) {
        int id;
        if (medicalRecords.isEmpty()) {
            id = 1;
        } else {
            id = medicalRecords.get(medicalRecords.size() - 1).getId() + 1;
        }
        System.out.println("Enter medical record code: ");
        String medicalRecordCode = scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter day in: ");
        String dayIn = scanner.nextLine();
        System.out.println("Enter day out: ");
        String dayOut = scanner.nextLine();
        System.out.println("Enter Reason In: ");
        String reasonIn = scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter Hospital Costs: ");
            String hospitalCosts = scanner.nextLine();
            medicalRecords.add(new NormalMedicalRecord(id, medicalRecordCode, name, dayIn, dayOut, reasonIn, Double.parseDouble(hospitalCosts)));
        } else if (choice == 2) {
            System.out.println("Enter VIP Type");
            String vipType = scanner.nextLine();
            System.out.println("Enter VIP Duration");
            String vipDuration = scanner.nextLine();
            medicalRecords.add(new VipMedicalRecord(id, medicalRecordCode, name, dayIn, dayOut, reasonIn, vipType, vipDuration));
        }
    }


    @Override
    public void displayMedicalRecord() {
        for (MedicalRecord item : medicalRecords) {
            System.out.println(item.toString());
        }

    }

    @Override
    public void deleteMedicalRecord(int id) {
        for (int i = 0; i < medicalRecords.size(); i++) {
            if (medicalRecords.get(i).getId() == id) {
                medicalRecords.remove(i);
                System.out.println("Remove Success");
                return;
            }
        }
    }
}
