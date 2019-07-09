/**
 * Created by mykhail on 7/5/19.
 */
public class BreakOne {
    public static void main(String args[]){
        int i;
        int a;

        i = 1;
        a = 3;
        while(i <= 5){
            System.out.println(i + ": цикл выполняется!");
            if (i == a)
                break;
            i++;
        }
    }
}
