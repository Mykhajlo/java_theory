/**
 * Created by mykhail on 7/16/19.
 */
public class DogFour {


    private String name;
    private String poroda;
    private int age;

    //instance initializer block

    //class initializer block
    {
       /* name = "Шарик";
        poroda = "овчарка";
        age = 2;*/

        System.out.println("Это нестатический блок!");

    }

    public DogFour(String x, String y, int z){
        name = x;
        poroda = y;
        age = z;
    }
}
