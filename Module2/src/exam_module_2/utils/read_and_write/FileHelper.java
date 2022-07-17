package exam_module_2.utils.read_and_write;

import exam_module_2.models.HocVien;
import exam_module_2.models.NhanVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static void writeHocVien(List<HocVien> list, String filePath, boolean isAppend) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file");
            }
            fileWriter = new FileWriter(file, isAppend);
            bw = new BufferedWriter(fileWriter);
            for (HocVien hocVien : list) {
                bw.write(hocVien.makeData());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error at write subject to Csv!!");
        }
    }

    public static void writeNhanVien(List<NhanVien> list, String filePath, boolean isAppend) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bw = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file");
            }
            fileWriter = new FileWriter(file, isAppend);
            bw = new BufferedWriter(fileWriter);
            for (NhanVien nhanVien : list) {
                bw.write(nhanVien.makeData());
                bw.newLine();
            }
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error at write subject to Csv!!");
        }
    }

    public static List<HocVien> readHocVien(String filePath) {
        List<HocVien> hocVienList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] array;
            HocVien hocVien;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                array = line.split(",");
                hocVien = new HocVien(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), Integer.parseInt(array[5]), array[6], array[7]);
                hocVienList.add(hocVien);
            }
            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error at read subject to Csv!!");
        }
        return hocVienList;
    }

    public static List<NhanVien> readNhanVien(String filePath) {
        List<NhanVien> nhanVienList = new ArrayList<>();
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file");
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            String[] array;
            NhanVien nhanVien;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                array = line.split(",");
                nhanVien = new NhanVien(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), Double.parseDouble(array[5]), array[6], array[7]);
                nhanVienList.add(nhanVien);
            }
            br.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Error at read subject to Csv!!");
        }
        return nhanVienList;
    }
}
