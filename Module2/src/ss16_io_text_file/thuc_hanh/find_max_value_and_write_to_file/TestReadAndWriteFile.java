package ss16_io_text_file.thuc_hanh.find_max_value_and_write_to_file;

import java.util.List;
import java.util.Scanner;

public class TestReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        System.out.println("Input path file txt in: ");
        Scanner scanner = new Scanner(System.in);
        String filePathIn = scanner.nextLine();
        List<Integer> numbers = readAndWriteFile.readFile(filePathIn);
        int maxValue = readAndWriteFile.findMaxValue(numbers);
        System.out.println("Input path file txt out: ");
        String filePathOut = scanner.nextLine();
        readAndWriteFile.writeFile(filePathOut,maxValue);

    }
}
