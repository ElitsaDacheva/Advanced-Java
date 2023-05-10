package AdvancedLab.StreamsFilesDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static void main(String[] args){
        String path = "D:\\FilesAdvanced\\Files-and-Streams";
        File file = new File(path);

        Deque<File> directories = new ArrayDeque<>();
        directories.offer(file);

        int count = 0;
        while (!directories.isEmpty()){
            File current = directories.poll();
            System.out.println(current.getName());
            count++;

            for (File d: current.listFiles()) {
                if (d.isDirectory()){
                    directories.offer(d);
                }
            }
        }
        System.out.println(count + " folders");
    }
}