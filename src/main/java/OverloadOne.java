/**
 * Created by mykhail on 7/9/19.
 */
public class OverloadOne {

    public static void main (String args[]){
        int a = 100;
        double b = 1.1;
        String c = "vertex";

        System.out.println(add(a,a));
        System.out.println(add(b,b));
        System.out.println(add(c,c));
    }

    public static int add (int a, int b){
        return a+= b;
    }

    public static double add (double a, double b){
        return a+= b;
    }

    public static String add (String a, String b){
        return a.concat(b);
    }
}
