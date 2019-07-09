/**
 * Created by mykhail on 7/8/19.
 */
public class MathTwo {
    public static void main(String[] args){
        double a = Math.random();   //  [0;1)
        double b = Math.random()*3; //  [0;3)
        double c = Math.random()+2; //  [2;3)
        double d = 20 + Math.random()*40;    // [20;60)
        double e = Math.random()*200 - 100;  // [ -100; +100)

        int f = (int) ( Math.random() * 3 ); // [0;2]
        int g = 3 + (int) ( Math.random() * 2 ); // [3;4]
        int h = (int) (Math.random()*(200+1)) - 100; // [ -100; +100]
        int i = (int) (Math.random()*(600+1)) - 200; // [ -200; 400]
        int j = (int) (Math.random()*(1+1)) + 1;  //  [ 1; 2]

        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
        System.out.println (d);
        System.out.println (e);
        System.out.println (f);
        System.out.println (g);
        System.out.println (h);
        System.out.println (i);
        System.out.println (j);
    }
}
