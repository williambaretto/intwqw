import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");



        list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());

        List<List<String>> list2 = new ArrayList<>();
        list2.add(Arrays.asList("a1","b1"));
        list2.add(Arrays.asList("a2","b2"));
        list2.add(Arrays.asList("a3","b3"));
        list2.add(Arrays.asList("a4","b4"));


       List<String> l1 = list2.stream().flatMap(e->e.stream()).collect(Collectors.toList());

        System.out.println(l1);




    }
}
