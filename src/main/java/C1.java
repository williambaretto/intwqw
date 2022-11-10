import java.util.concurrent.Callable;

public class C1 implements  A1, B1, Callable {

    @Override
    public void getAll() {
        A1.super.getAll();
        B1.super.getAll();
    }

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.getAll();
    }

    @Override
    public Object call() throws Exception {
        return null;
    }
}
