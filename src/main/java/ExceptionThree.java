/**
 * Created by mykhail on 7/11/19.
 */
public class ExceptionThree {
    public static void main(String[] args){
        int a = 5;
        int b = 0;
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Делить на нуль - нельзя!");
        }
        System.out.println("Программа работает успешно!");
    }
}
