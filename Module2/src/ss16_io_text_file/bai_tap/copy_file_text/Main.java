package ss16_io_text_file.bai_tap.copy_file_text;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteStringInFile readAndWriteStringInFile = new ReadAndWriteStringInFile();
        List<String> strList = readAndWriteStringInFile.readFile("src/ss16_io_text_file/bai_tap/copy_file_text/fileMain");
        for (String item : strList) {
            readAndWriteStringInFile.writeFile("src/ss16_io_text_file/bai_tap/copy_file_text/fileCopy", item);

        }
    }
}
