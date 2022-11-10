
// Java Program demonstrating Introduction to Java Executor
// Framework

// Importing concurrent classes from java.util package
import java.util.concurrent.*;

// Class 1
// Helper Class implementing runnable interface Callable
class Task implements Callable<String> {
    // Member variable of this class
    private String message;

    // Constructor of this class
    public Task(String message)
    {
        // This keyword refers to current instance itself
        this.message = message;
    }

    // Method of this Class
    public String call() throws Exception
    {
        Thread.sleep(2000);
        return Thread.currentThread().getName() + " Hiiii " + message + "!";
    }
}
class Task2 implements Callable<String> {
    // Member variable of this class
    private String message;

    // Constructor of this class
    public Task2(String message)
    {
        // This keyword refers to current instance itself
        this.message = message;
    }

    // Method of this Class
    public String call() throws Exception
    {
       // Thread.sleep(2000);
        return Thread.currentThread().getName() + "  Hiiii " + message + "!";
    }
}
// Class 2
// Main Class
// ExecutorExample
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an object of above class
        // in the main() method
        Task task = new Task("GeeksForGeeks - 1");
        Task2 task2 = new Task2("GeeksForGeeks - 2");
        Task2 task3 = new Task2("GeeksForGeeks - 3");

        // Creating object of ExecutorService class and
        // Future object Class
        ExecutorService executorService
                = Executors.newFixedThreadPool(5);
        Future<String> result
                = executorService.submit(task);
        Future<String> result2
                = executorService.submit(task2);
        Future<String> result3
                = executorService.submit(task3);

        // Try block to check for exceptions
        try {
            System.out.println(Thread.currentThread().getName() +  result.get());
            System.out.println(Thread.currentThread().getName() + result2.get());
            System.out.println(Thread.currentThread().getName() + result3.get());
        }
        // Catch block to handle the exception
        catch (InterruptedException
                | ExecutionException e) {

            // Display message only
            System.out.println(
                    "Error occurred while executing the submitted task");

            // Print the line number where exception occurred
            e.printStackTrace();
        }
        System.out.println("ssssssssss");


        // Cleaning resource and shutting down JVM by
        // saving JVM state using shutdown() method
        executorService.shutdown();
    }
}