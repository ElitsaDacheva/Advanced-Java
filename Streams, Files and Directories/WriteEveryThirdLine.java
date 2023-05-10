package AdvancedLab.StreamsFilesDirectories;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        String path = "input.txt";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        BufferedWriter writer = new BufferedWriter(new FileWriter("everyThirdLineOutput.txt"));

        int count = 0;
        String line = reader.readLine();
        while (line != null) {
            count++;
            if (count % 3 == 0) {
                writer.write(line);
                writer.newLine();
            }
            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
