import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mykhail on 7/11/19.
 */
public class ExceptionTwo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("out.txt");
        //fileWriter.close();
        fileWriter.write("Hello World");
        fileWriter.close();
        System.out.println("Программа работает успешно!");
    }
}
