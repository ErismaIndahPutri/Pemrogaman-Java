package ExceptionsListThreadsFiles;

import java.io.File;
import java.util.Scanner;

public class ReadAFile {
    public static void main(String[] args) {
        try {
            File f = new File("a.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNext()) {
                String a = sc.next();
                String b = sc.next();

            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}
