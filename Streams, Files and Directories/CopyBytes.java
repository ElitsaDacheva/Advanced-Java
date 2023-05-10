package AdvancedLab.StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("bytesOutput.txt");

        int bytes = inputStream.read();
        while (bytes != - 1){
            if (bytes == 32 || bytes == 10){
                outputStream.write((char)bytes);
            }else {
                String digits = String.valueOf(bytes);
                for (int i = 0; i < digits.length(); i++) {
                    outputStream.write(digits.charAt(i));
                }
            }

            bytes = inputStream.read();
        }


    }
}
