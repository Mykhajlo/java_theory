import java.util.Scanner;

/**
 * Created by mykhail on 7/5/19.
 */
public class ScanFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);
    }

}
