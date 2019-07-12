/**
 * Created by mykhail on 7/9/19.
 */
public class StaticTwo {
    public static void main (String args[]){
        MyClass c1 = new MyClass();

        c1.firstMethod();
        c1.secondMethod();

        MyClass.firstMethod();
        //MyClass.secondMethod();
    }
}
