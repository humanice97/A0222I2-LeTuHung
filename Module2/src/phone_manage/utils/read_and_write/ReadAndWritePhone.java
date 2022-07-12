package phone_manage.utils.read_and_write;

import phone_manage.models.GenuinePhone;
import phone_manage.models.HandedPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWritePhone {

    public static void writeHandedPhone(List<HandedPhone> list, String filePath, boolean isAppend) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            fileWriter = new FileWriter(file, isAppend);
            bw = new BufferedWriter(fileWriter);
            for (HandedPhone handedPhones : list) {
                bw.write(handedPhones.makeText());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error at write subject to Csv!!");
        }
    }

    public static void writeGenuinePhone(List<GenuinePhone> list, String filePath, boolean isAppend) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            fileWriter = new FileWriter(file, isAppend);
            bw = new BufferedWriter(fileWriter);
            for (GenuinePhone genuinePhone : list) {
                bw.write(genuinePhone.makeText());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error at write subject to Csv!!");
        }
    }

    public static List<HandedPhone> readHandedPhone(String filePath) {
        List<HandedPhone> handedPhoneList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] array;
            HandedPhone handedPhone;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                array = line.split(",");
                handedPhone = new HandedPhone(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), array[3], array[4], array[5]);
                handedPhoneList.add(handedPhone);
            }
            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error at read subject to Csv!!");
        }
        return handedPhoneList;
    }

    public static List<GenuinePhone> readGenuinePhone(String filePath) {
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] array;
            GenuinePhone genuinePhone;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                array = line.split(",");
                genuinePhone = new GenuinePhone(Integer.parseInt(array[0]), array[1], Double.parseDouble(array[2]), array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]));
                genuinePhoneList.add(genuinePhone);
            }
            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error at read subject to Csv!!");
        }
        return genuinePhoneList;
    }
}
