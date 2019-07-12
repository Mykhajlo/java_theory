/**
 * Created by mykhail on 7/10/19.
 */
public class ObjMass {
    static CatTwo[] abc = new CatTwo [3];

    public static void main (String[] args){
        abc[0] = new CatTwo("Kitty");
        abc[1] = new CatTwo("Molly");
        abc[2] = new CatTwo("Lily");

        for (int i = 0; i<3; i++){
            System.out.println(abc[i].name);
        }
    }
}
