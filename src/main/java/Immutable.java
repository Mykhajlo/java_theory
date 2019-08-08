/**
 * Created by mykhail on 7/17/19.
 */
public class Immutable {
    public static void main(String [] args)
    {
        MyStateless first = new MyStateless("Bengal", "green");

        MyStateless second = first.setBreed("Sphynx");
    }
}
