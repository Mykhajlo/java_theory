import java.util.Scanner;

/**
 * Created by mykhail on 7/5/19.
 */
public class ScanSix {
    public static void main(String args[]){
        System.out.print("Введите любое дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("Вы ввели число " + number);
    }
}
