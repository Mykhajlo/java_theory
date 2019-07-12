/**
 * Created by mykhail on 7/10/19.
 */
public class MyClassTwo {
    public static void main(String[] args) {
        MyClassOne obj = new MyClassOne();
        System.out.println(obj.getS());

        obj.setS("It's modified!");
        System.out.println(obj.getS());
    }
}
