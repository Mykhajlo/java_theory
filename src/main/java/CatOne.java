/**
 * Created by mykhail on 7/10/19.
 */
public class CatOne extends Animal{
    public static void main(String[] args) {
        CatOne myCat = new CatOne();

        myCat.voice();
    }
    @Override
    void voice() {
        System.out.println("Meow");
    }
}
