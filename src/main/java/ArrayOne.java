/**
 * Created by mykhail on 7/8/19.
 */
public class ArrayOne {
    public static void main(String[] args) {
        int [] array2 = {5,17,350};
        int k = array2.length;
        System.out.println(k);

        int[] array1 = new int[3];

        array1[0]=5;
        array1[1]=17;
        array1[2]=350;

        for( int i = 0; i < array1.length; i++){
            System.out.println(array1[i]);
        }
        boolean[] arr = new boolean[1000];

        for( int i = 0; i< arr.length; i++){
            arr[i] = true;
        }

        for( int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------/////-------");

        boolean[] arrT = new boolean[1000];

        for( int i = 0; i< arrT.length; i=i+2){
            arrT[i] = true;
        }

        for( int i = 0; i< arrT.length; i++){
            System.out.println(arrT[i]);
        }
        System.out.println("--------/////-------");
    }
}
