import java.util.Arrays;

/**
 * Created by mykhail on 7/16/19.
 */
public class SortOne {
    public static void main(String[] args) {
        //int [] mas = {11, 3, 14, 16, 7};
        int [] mas = {1, 3, 10, 16, 77};

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){ //if(mas[i] < mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    System.out.println(i);
                }
            }
        }
        System.out.println(Arrays.toString(mas));


    }
}
