import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("sam", "dam", "pol");
        List<String> l2 = Arrays.asList("szx", "baw", "sam");

        List<Employee> l3 = Arrays.asList(
                new Employee(12,"sam"),
                new Employee(11,"vam"),
                new Employee(16,"aam")
        );
        List<Employee> l4 = Arrays.asList(
                new Employee(14,"cam"),
                new Employee(18,"lam"),
                new Employee(8,"bam")
        );

        Stream<List<String>> listStreams = Stream.of(l1, l2);//Stream.concat(Stream.of(l1),Stream.of(l2)); //Stream.of(l1), Stream.of(l2));

//        System.out.println(listStreams.);

        List<String> collect = listStreams.flatMap(e -> e.stream()).sorted().collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        Stream<List<Employee>> employeeStream = Stream.of(l3, l4);

        List<Employee> collect1 = employeeStream.flatMap(e -> e.stream()).sorted(
                Comparator.comparingInt(Employee::getId)).sorted(
                        Comparator.comparing(e->e.getName())).limit(3).collect(Collectors.toList());
        collect1.forEach(e-> System.out.println(e.getId() + " " +e.getName()));


    }
}
