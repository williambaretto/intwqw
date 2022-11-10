import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static void main(String[] args) {

        Map<Integer, Long> map = new HashMap<>();

        System.out.println(fibo(510, map));
    }

    public static Long fibo(Integer num, Map<Integer, Long> map) {

        if (num <= 1) {
            return Long.valueOf(num);
        }

        if (map.containsKey(num)) {
            return map.get(num);
        }


        Long sum = Long.valueOf(fibo(num - 1, map) + fibo(num - 2, map));
        map.put(num, sum);
        return sum;
    }
}
