/**
 * Created by mykhail on 7/10/19.
 */
public class ParseOne {
    public static void main(String[] args){
        String a = "11";

        //int b = a; // Error:(8, 17) java: incompatible types: java.lang.String cannot be converted to int

        int b = Integer.parseInt(a);
        System.out.println(b);
    }
}
