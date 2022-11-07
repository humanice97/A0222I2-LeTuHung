package com.codegym.book.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;

public class ReadAndWriteFile {
    public static void writeListStringToCSV(String filePath, List<String> stringList) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
