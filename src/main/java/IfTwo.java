import java.util.Scanner;

/**
 * Created by mykhail on 7/5/19.
 */
public class IfTwo {
    public static void main (String [] args) {

        System.out.print ("Введите число 1: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println ("Вы ввели число 1");
        }
        else {
            System.out.println ("Вы ввели число не равное 1");
        }
    }
}
