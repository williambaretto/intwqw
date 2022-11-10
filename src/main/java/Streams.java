import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        List<List<String>> strs = new ArrayList<>();
        strs.add(Arrays.asList("A","B","C","D"));
        strs.add(Arrays.asList("O","C","A","X"));
        strs.add(Arrays.asList("T","B","W","D"));

        List<String> newstr = new ArrayList<>();
        newstr = strs.stream().flatMap(e->e.stream()).collect(Collectors.toList());

        System.out.println(newstr);
      //  newstr.stream().sorted().collect(Collectors.toList());

    }

//    private static Stream<?> getStreams(List<String> e, Stream<String> stream) {
//
//    }


}
