package Thread;

import java.util.concurrent.Callable;

public class MyCallableFuture implements Callable<String> {
 
    private long waitTime;
     
    public MyCallableFuture(int timeInMillis){
        this.waitTime=timeInMillis;
    }
    
    // These are the different between Callable and Runnable. Callable's call() can return an object and throws Exceptions
    @Override
    public String call() throws Exception {
        Thread.sleep(waitTime);
        //return the thread name executing this callable task
        return Thread.currentThread().getName();
    }
 
}
