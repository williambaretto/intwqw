import java.util.HashMap;
import java.util.Map;

public class ThreadMain {

    public static void main(String[] args) {
        System.out.println("Inside Main " + Thread.currentThread().getName());

        Map<String, String> map = new HashMap<>();
        map.get("2");

        ThreadClass t1 = new ThreadClass();
        t1.run();
    }
}
