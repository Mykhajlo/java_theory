/**
 * Created by mykhail on 7/17/19.
 */
public class SyncOne {
    public void myMethod()
    {
        Object key = new Object();

        synchronized (key) {
            System.out.println("Hi I'm synchronized block!");
        }
    }


    synchronized void myMethodOne() {
        System.out.println("Hi I'm synchronized method!");
    }
}
