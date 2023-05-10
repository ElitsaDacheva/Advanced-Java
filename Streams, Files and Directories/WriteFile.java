package AdvancedLab.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class WriteFile {
    public static void main(String[] args) {
        String path = "input.txt";
        try {

            FileInputStream inputStream = new FileInputStream(path);
            FileOutputStream outputStream = new FileOutputStream("output.txt");

            Set<Character> ponctuation = Set.of(',', '.', '!', '?');

            int read = inputStream.read();
            while (read != -1){
                if (!ponctuation.contains((char)read)) {
                    outputStream.write(read);
                }
                read = inputStream.read();
            }
        }
        catch (IOException ignored){

        }
    }
}
