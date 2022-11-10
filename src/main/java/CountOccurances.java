import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurances {
    public static void main(String[] args) {


        String str = "this ss ff www sdd ss";
        List<String> lstr = Arrays.asList(str.split(" "));
        System.out.println(lstr);

        lstr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v)-> System.out.println(k + " " +  v));

        String n1 = lstr.stream().collect(Collectors.joining());
        System.out.println(n1);


      List<Integer> list = Arrays.asList(2,34,4,3,4);


      //        Set<Integer>  set = new HashSet<>();
//        list.stream().filter(e->!set.add(e)).forEach(e-> System.out.println(e));

//        Function<String, String> fn =  (s)->{
//            return s.toUpperCase();
//        };
//                new Function<String, String>() {
//            @Override
//            public String apply(String s) {
//                return "s " + s;
//            }
//        }; //Function.identity();
       // System.out.println(fn.apply("str"));
        //System.out.println(fn.apply("sss"));

    }
}
