package ss16_io_text_file.bai_tap.read_file_csv;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        ReadAndWriteCountry readAndWriteCountry = new ReadAndWriteCountry();
        List<String[]> strList = readAndWriteCountry.readFile("src/ss16_io_text_file/bai_tap/read_file_csv/country.csv");
        for (String[] item : strList) {
            countryList.add(new Country(Integer.parseInt(item[0]), item[1], item[2]));
        }
        for (Country list : countryList) {
            System.out.println(list.toString());
        }
    }
}
