package ss16_io_text_file.thuc_hanh.sum_of_number_in_text_file;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;

            while (((line = br.readLine()) != null)) {
                if(line.isEmpty()){
                    continue;
                }
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);

        } catch (Exception e) {
            System.out.println("File is not found or error !");
        }
    }
}
