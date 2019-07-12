/**
 * Created by mykhail on 7/9/19.
 */
public class StaticOne {
    public static void main (String args[]){
      //  Car myCar = new Car();

        Car.myStatic += 20;
        System.out.println(Car.myStatic);
       // System.out.println(myCar.notStatic);

        Car c1 = new Car();
        System.out.println("Статическая переменная c1 = "+c1.myStatic);
        c1.notStatic +=20;
        System.out.println("Не статическая переменная c1 = "+c1.notStatic);

        Car c2 = new Car();
        System.out.println("Статическая переменная c2 = "+c2.myStatic);
        System.out.println("Не статическая переменная c2 = "+c2.notStatic);
    }

}
