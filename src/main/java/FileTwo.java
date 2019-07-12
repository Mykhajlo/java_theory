import java.io.*;
import java.util.Scanner;

/**
 * Created by mykhail on 7/10/19.
 */
public class FileTwo {
    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile(k1, k2);
        readFile();
    }


    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("file1.txt");

        for (int i = k1; i <= k2; i++) {

            nFile.write(i + "\n");
        }

        nFile.close();
    }

    public static void readFile() throws Exception {
        FileReader fr = new FileReader("sample1.txt");
        Scanner scan = new Scanner(fr);
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;

        }

    }

}