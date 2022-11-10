import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Comparing {
    public static void main(String[] args) {

        int[] ary = {2,4,188,5};
        Arrays.sort(ary);
       // Arrays.stream(ary).forEach(e-> System.out.println(e));
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee(2, "sam"));
        emps.add(new Employee(1, "ram"));
        emps.add(new Employee(4, "eam"));
        emps.add(new Employee(9, "vam"));
        Employee[] emps2 = new Employee[4];
        emps2[0] = new Employee(2, "sam");
        emps2[1] = new Employee(9, "wam");
        emps2[2] = new Employee(7, "zam");
        emps2[3] = new Employee(6, "1am");

        Collections.sort(emps, new SortbyName());

        //Arrays.sort(emps2);
        emps.stream().forEach(e-> System.out.println(e.getId() +" "+ e.getName()));
       // Arrays.stream(emps2).forEach(e-> System.out.println(e.getId() + e.getName()));
        Collections.sort(emps, new SortbyName());

        Arrays.sort(emps2, new SortbyName());
      //  emps.stream().forEach(e-> System.out.println(e.getId() + e.getName()));
        List<Employee> sortedList = emps.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());

      //  List<Employee> sortedList2 = emps.stream().sorted(e-> new SortbyName()).collect(Collectors.toList());

     //   sortedList.stream().forEach(e-> System.out.println(e.getName()));


    }

    static class  SortbyName implements Comparator<Employee>{


        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }


    }
    public static class  sortbyId implements Comparator<Employee> {

        @Override
        public int compare(Employee a, Employee b) {
            return a.getId() - b.getId();
        }

    }
}
