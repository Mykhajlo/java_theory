import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by mykhail on 7/17/19.
 */
public class EnumOne {
    public static void main(String[] args) {
        System.out.println(myEnum.WINTER);
        System.out.println(myEnum.SUMMER);
        System.out.println(myEnum.SPRING);
        System.out.println(myEnum.FALL);
        for (myEnum s : myEnum.values()) {
            System.out.println(s);
        }
        myEnum arg = myEnum.FALL;

        switch (arg)
        {
            case WINTER:
                System.out.println("It's winter! Christmas time!"); break;
            case SUMMER:
                System.out.println("It's summer! Let's go to the beach!"); break;
            case SPRING:
                System.out.println("It's spring! Easter is coming!"); break;
            case FALL:
                System.out.println("It's fall! Helloween is coming!"); break;
        }


        // second part
        System.out.println(Color.RED.name()); //output: RED
        System.out.println(Color.RED.ordinal()); //output: 0



        boolean isEqualToItself = Color.RED.equals(Color.RED);
        boolean isEqualToDifferentColor = Color.RED.equals(Color.GREEN);

        System.out.println(isEqualToItself); //output: true
        System.out.println(isEqualToDifferentColor);//output: false


        int hashOfRed = Color.RED.hashCode();
        int hashOfGreen = Color.GREEN.hashCode();

        System.out.println(hashOfRed); //output would be different every time: 366712642
        System.out.println(hashOfGreen); //output would be different every time: 1829164700

        String red = Color.RED.toString();
        System.out.println(red); //output: RED

        Color[] colors = Color.values();
        System.out.println(Arrays.toString(colors)); //output: [RED, GREEN, BLUE]

        System.out.println(Color.valueOf("RED").ordinal()); //output: 0

        //Color.valueOf("BLACK"); // => java.lang.IllegalArgumentException: No enum constant Color.BLACK

        System.out.println(Enum.valueOf(Color.class, "BLUE").ordinal()); //output: 2


        System.out.println(Color.GREEN.compareTo(Color.RED)); //output: 1
        System.out.println(Color.GREEN.compareTo(Color.GREEN)); //output: 0
        System.out.println(Color.GREEN.compareTo(Color.BLUE)); //output: -1
        System.out.println(Color.RED.compareTo(Color.BLUE)); //output: -2


        ArrayList<Color> colorss = new ArrayList<>(List.of(Color.GREEN, Color.RED, Color.BLUE));
        System.out.println(colorss); //output: [GREEN, RED, BLUE]


        Collections.sort(colorss);
        System.out.println("Test-> "+ colorss); //output: [RED, GREEN, BLUE]

    }

}
