package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteStringInFile {
    public List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        int count = 0;
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                count += line.length();
                stringList.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File not found or error !");
        }
        System.out.println("The number of character in file is: " + count);
        return stringList;
    }

    public void writeFile(String filePath, String str) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true));
            bw.write(str);
            bw.newLine();
            bw.close();

        } catch (IOException e) {
            System.out.println("The copy file is not found !");
        }

    }
}
