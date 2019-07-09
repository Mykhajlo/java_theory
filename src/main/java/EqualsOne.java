/**
 * Created by mykhail on 7/8/19.
 */
public class EqualsOne {

    public static void main(String args[]) {
        String str1 = "Good morning";
        String str2 = "Good morning";
        String str3 = "Good evening";

        System.out.println("String '" + str1 + "' equals '" + str2 + "' : " + str1.equals(str2));
        System.out.println("String '" + str1 + "' equals '" + str3 + "' : " + str1.equals(str3));

        String strr1 = "10";
        Integer i = 10;

        System.out.println("String '" + strr1 + "' equals '" + i + "' : " + strr1.equals(i));
    }
}
