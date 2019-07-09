/**
 * Created by mykhail on 7/9/19.
 */
public class ArrayThree {

    public static void main(String[] args) {
        int[] array1 = {51,136, 387};

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
