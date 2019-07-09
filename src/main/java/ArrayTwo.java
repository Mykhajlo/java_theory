/**
 * Created by mykhail on 7/8/19.
 */
public class ArrayTwo {

    public static void main(String[] args) {

        int[] array = {51,136, 387};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------/////-------");

        for (int i:array) {
            System.out.println(i);
        }
        System.out.println("--------/////-------");

        String str = "ABC";
        char[] result = str.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);

        System.out.println("--------/////-------");

        char[] chars = {'V', 'e', 'r', 't', 'e', 'x', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};
        String s1 = "String";
        System.out.println("String s1 before copyValueOf: 	" + s1);

        s1 = s1.copyValueOf(chars);
        System.out.println("String s1 after copyValueOf: 	" + s1);

        System.out.println("--------/////-------");

        String s2 = s1.copyValueOf( chars);
        String s3 = s1.copyValueOf( chars, 2, 7 );
        System.out.println("String without offset: 				" + s2);
        System.out.println("String with offset 2 and length 7: 	  " + s3);

        System.out.println("--------/////-------");

        String hello = "Hello";

        int index1 = hello.indexOf('H');
        int index2 = hello.indexOf('o');
        int index3 = hello.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы "+index1 );
        System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы "+index2 );
        System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы "+index3 );

        System.out.println("--------/////-------");

        int index11 = hello.indexOf('H', 2);
        int index22 = hello.indexOf('o', 2);
        int index33 = hello.indexOf('W', 2);
        System.out.println("Мы ищем букву 'H' в строке "+hello+" начиная с индекса номер 2. Индекс "+index11 );
        System.out.println("Мы ищем букву 'o' в строке "+hello+" начиная с индекса 2. Индекс "+index22 );
        System.out.println("Мы ищем букву 'W' в строке "+hello+" начиная с индекса 2. Индекс "+index33 );


        System.out.println("--------/////-------");
        String gm = "Good morning";

        int index111 = gm.indexOf("morni");
        int index222 = gm.indexOf("Vertex");
        int index333 = gm.indexOf("Good morning", -2);
        int index4 = gm.indexOf("Good morning", 2);
        int index5 = gm.indexOf("Good morning", 999);
        System.out.println("Мы ищем 'morni' в строке "+gm+". Индекс "+index111 );
        System.out.println("Мы ищем 'Vertex' в строке "+gm+". Индекс "+index222 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса -2. Результат: "+index333 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 2. Результат: "+index4 );
        System.out.println("Мы ищем 'Good morning' в строке "+gm+" начиная с индекса 888. Результат: "+index5 );

        System.out.println("--------/////-------");

        String oldString = "ABC";
        String newString =  oldString.replace('A', 'B');

        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);

        System.out.println("--------/////-------");

        String oldString1 = "Java";
        String newString1 =  oldString1.replace('a', 'i');

        System.out.println("Old string: " + oldString1);
        System.out.println("New string: " + newString1);
    }
}
