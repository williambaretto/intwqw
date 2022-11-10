import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

class t1 {
    public static void main(String args[]) {
        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");


        List<String> namesWithA = names.stream()

                .filter(name -> name.startsWith("A"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
//                .forEach(name-> name.toUpperCase());
////                .collect(Collectors.toList());
        System.out.println(namesWithA);


    }
}
