import java.util.ArrayList;

/**
 * Created by mykhail on 7/16/19.
 */
public class ArrayListOne {
    public static void main (String[] args){
        ArrayList<String> deliveryCities = new ArrayList<>();

        deliveryCities.add("Chicago");
        deliveryCities.add("New York");
        deliveryCities.add("Toronto");
        deliveryCities.add("Lviv");
        deliveryCities.add("Kiyv");
        deliveryCities.add("Oxford");
        deliveryCities.add("Vienna");

        deliveryCities.get(2); //Toronto
        System.out.println("This is element-> " + deliveryCities.get(2));
        System.out.println("This is index-> " + deliveryCities.indexOf("New York"));
        System.out.println(deliveryCities.contains("Amsterdam"));
        deliveryCities.set(1, "Berlin");
        System.out.println(deliveryCities.get(1)); //Berlin

        deliveryCities.remove(1); // удалит New York

        deliveryCities.remove("Vienna"); // удалит Vienna

        System.out.println("This is index of deleted element -> " + deliveryCities.indexOf("Vienna"));

        int i;

        i = 25;
        System.out.println(i);
        DogFour d = new DogFour("Шарик", "овчарка", 2);
    }
}
