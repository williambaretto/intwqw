import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
public class CompletableFutureExample1
{
    public static void main(String[] args)
    {
//        try
//        {
//            List<Integer> list = Arrays.asList(5,9,14);
//            list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num)))
//                .map(t->t.join()).forEach(s->System.out.println(s));
//        }
//        Map<String, String> map = new HashMap<>();
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
    }
    private static int getNumber(int a)
    {
        return a*a;
    }
}  