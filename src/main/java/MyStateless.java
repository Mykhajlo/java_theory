/**
 * Created by mykhail on 7/17/19.
 */
public class MyStateless {
    private String breed;
    private String eyeColor;

    public MyStateless(String breed, String eyeColor)
    {
        this.breed = breed;
        this.eyeColor = eyeColor;
        System.out.println("New cat created! It is " + this.breed + " and has " + this.eyeColor + " eyes!");
    }

    public MyStateless setBreed(String breed)
    {
        MyStateless c = new MyStateless(breed, this.eyeColor);
        return c;
    }

    public MyStateless setEyeColor(String eyeColor)
    {
        MyStateless c = new MyStateless(this.breed, eyeColor);
        return c;
    }
}
