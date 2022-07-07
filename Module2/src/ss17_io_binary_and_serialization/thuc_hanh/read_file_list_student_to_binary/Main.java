package ss17_io_binary_and_serialization.thuc_hanh.read_file_list_student_to_binary;

import org.apache.groovy.json.internal.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String filePath, List<Student> students) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String filePath) {
        List<Student> students = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));
            students = (List<Student>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Đà Nẵng"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
//        writeToObject("src/ss17_io_binary_and_serialization/thuc_hanh/read_file_list_student_to_binary/Student.txt", students);
        List<Student> studentList = readDataFromFile("src/ss17_io_binary_and_serialization/thuc_hanh/read_file_list_student_to_binary/Student.txt");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }


}
