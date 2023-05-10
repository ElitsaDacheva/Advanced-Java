package AdvancedLab.StreamsFilesDirectories;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\FilesAdvanced\\Files-and-Streams");
        File file = path.toFile();

        File[] files = file.listFiles();
        for (File f :files) {
            long lenght = 0;
            if (f.isFile()) {
                lenght += f.length();
                System.out.println(f+": "+ "[" + lenght + "]");
            }
        }
    }
}
