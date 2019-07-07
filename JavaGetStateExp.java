public class JavaGetStateExp implements Runnable   
{  
   public void run()   
    {  
        // returns the state of the thread  
        Thread.State state = Thread.currentThread().getState();  
        System.out.println("Running thread name: "+ Thread.currentThread().getName());  
        System.out.println("State of thread: " + state);  
    }  
    public static void main(String args[])   
    {  
        JavaGetStateExp g = new JavaGetStateExp();  
        Thread t1= new Thread(g);   
        Thread t2= new Thread(g);   
        // call run() function  
        t1.start();     
        t2.start();  
    }  
}  