/**
 * Created by mykhail on 7/5/19.
 */
public class BreakTwo {
    public static void main(String args[]){

        for (int i = 1; i <= 3; i++) {
            System.out.println("Это первый цикл! Я выполняюсь " + i + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Это второй цикл! Я выполняюсь " + a + " раз");
                if (a == 2)
                    break;
            }
        }
    }
}
