package ss16_io_text_file.thuc_hanh.sum_of_number_in_text_file;

import java.util.Scanner;

public class TestReadFileExample {
    public static void main(String[] args) {
        System.out.println("Input path file txt: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
