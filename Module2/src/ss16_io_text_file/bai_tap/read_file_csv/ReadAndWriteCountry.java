package ss16_io_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCountry {
    public List<String[]> readFile(String filePath) {
        List<String[]> list = new ArrayList<>();
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
                String[] countryArr = line.split(",");
                list.add(countryArr);
            }

        } catch (IOException e) {
            System.out.println("File is not found or error");
        }
        return list;
    }
}
