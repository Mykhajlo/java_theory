import java.util.Comparator;

/**
 * Created by mykhail on 7/17/19.
 */
public class PriceComparator implements Comparator<House> {
    public int compare(House h1, House h2) {
        if (h1.price == h2.price) {
            return 0;
        }
        if (h1.price > h2.price) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
