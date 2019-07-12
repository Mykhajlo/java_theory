import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by mykhail on 7/11/19.
 */
public class ExceptionOne {
    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello World!");
            //fileWriter.close();
        } catch (IOException e) {
           // e.printStackTrace();
            System.out.println("Ошибка - Нельзя записать в закрытый файл!");
        }
        finally {
            System.out.println("Выполняюсь всегда! finaly block");
        }
        System.out.println("Программа работает успешно!");
    }
}
