import java.util.Scanner;

/**
 * Created by mykhail on 7/5/19.
 */
public class SwitchOne {
    public static void main(String args[]){
        System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number){
            case 1: System.out.println ("Вы ввели число 1");
                break;
            case 2: System.out.println ("Вы ввели число 2");
                break;
            case 3: System.out.println ("Вы ввели число 3");
                break;
            case 4: System.out.println ("Вы ввели число 4");
                break;
            default: System.out.println("Вы ввели неправильное число");
        }
    }
}
