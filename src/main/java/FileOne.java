import java.io.*;
/**
 * Created by mykhail on 7/10/19.
 */
public class FileOne {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter( "sample1.txt" );
        fw.write("Хокку \nПодобен лучу самурайский клинок \nИ тот затупился \nПроклятая килька в томате!!");

        fw.close();

        FileReader fr = new FileReader( "sample2.txt" );
        fr.close();

    }
}
