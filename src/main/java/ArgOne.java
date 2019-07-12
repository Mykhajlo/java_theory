/**
 * Created by mykhail on 7/11/19.
 */

/*    VarArgs   */
public class ArgOne {
    public static void main(String[] args) {
        ArgOne obj = new ArgOne();

       // System.out.println(obj.addAll(1,2));
      //  System.out.println(obj.addAll(1,24,3));
        //System.out.println(obj.addAll(1,1,1,1,1,1,1,1,1,1));
        System.out.println(obj.addAll());
    }
/*
    public int addAll(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }
    public int addAll(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber + thirdNumber;
    }*/
    public int addAll(int ... numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + " : get " + sum);
        }
        return sum;
    }
}
