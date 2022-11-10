import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunnable {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(newRunnable("thread 1"));
        executorService.execute(newRunnable("thread 2"));
        executorService.execute(newRunnable("thread 3"));
        executorService.shutdown();
    }

    private static Runnable newRunnable(String msg){
        return  new Runnable () {

            @Override
            public void run() {
                String completemsg = Thread.currentThread().getName() + " " + msg;
                System.out.println(completemsg);

            }
        };
    }
}
