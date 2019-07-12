/**
 * Created by mykhail on 7/12/19.
 */
public class TestAbstract {    public static void main(String[] args) {
    CatOneOne myCat = new CatOneOne();
    DogOneOne myDog = new DogOneOne();
    Cow myCow = new Cow();

    myCat.voice();
    myDog.voice();
    myCow.voice();
}
}
