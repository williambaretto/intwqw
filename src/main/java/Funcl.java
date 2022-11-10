import java.util.*;

public class Funcl {

    public static void main(String[] args) {
        String s1 = "test";
        Foo foo = str -> str.toUpperCase();
        System.out.println(foo.method(s1));
        dos(foo);
    }

    public static void dos(Foo fo){

        List<String> lst = Arrays.asList("sss","ssss");

        lst.stream().map(e->e.toLowerCase()).filter(e->e.equals("sss")).forEach(e->{
            System.out.println(e);
        });
        
        Map<String, Integer> map = new HashMap<>();
        map.put("saw", 3);
        int saw = map.get("saw") + 1;


        String da = "hello";
         da = fo.method(da);
        System.out.println(da);
    }
}
