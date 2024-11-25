import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Q43_EvenOdd_Thread {
    private static Object object = new Object();
    private static IntPredicate even = e->e%2==0;
    private static IntPredicate odd = e->e%2!=0;

    public static void printEvenOdd(IntPredicate con){
        IntStream
        .range(1, 11)
        .filter(con)
        .forEach(Q43_EvenOdd_Thread::execute);
    }
    public static void execute(int no){
        synchronized(object){
            try{
                System.out.println(Thread.currentThread().getName()+":"+no);
                object.notify();
                object.wait();
            }
            catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        try{
        CompletableFuture.runAsync(()->Q43_EvenOdd_Thread.printEvenOdd(even));
        CompletableFuture.runAsync(()->Q43_EvenOdd_Thread.printEvenOdd(odd));
        Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}