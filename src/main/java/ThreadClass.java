public class ThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Inside ThreadClass " + Thread.currentThread().getName());
    }
}
