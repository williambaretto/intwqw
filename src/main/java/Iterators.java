import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Iterators {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("First", 10);
        map.put("Second", 20);
        map.put("Third", 30);
        map.put("Fourth", 40);

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()) {
            String key = iterator.next();
            map.remove("Fifth", key);
        }
        System.out.println(map.size());

        HashMap<String, Integer> h1 = new HashMap<>();
        h1.put("vishal", 10);
        h1.put("sachin", 30);
        h1.put("vaibhav", 20);

     for(Map.Entry<String, Integer> e :h1.entrySet()){
         System.out.println(e.getKey());
     }
        System.out.println(h1.size()); h1.size();


//        Iterator<Integer> iterator = numbers.iterator();
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.next());
//            if(iterator.next() == 6){
//                iterator.remove();
//            }
//        }
      //  System.out.println(numbers);

    }

}
