public class JavaEnumerateExp extends Thread 
{
    JavaEnumerateExp(String threadname, ThreadGroup tg)
    {
        super(tg, threadname);
        start();
    }
    public void run()
    {
        for (int i = 0; i < 5; i++) 
        {
            try
            {
                Thread.sleep(10);
            }	
            catch (InterruptedException ex) {
                System.out.println("Exception encounterted");}
        }
        System.out.println(Thread.currentThread().getName() +" completed executing");
    }
    public static void main(String arg[]) throws InterruptedException,SecurityException
    {
        // creating the ThreadGroup
        ThreadGroup g1 = new ThreadGroup("Parent thread");
        // creating a child ThreadGroup for parent ThreadGroup
        ThreadGroup g2 = new ThreadGroup(g1, "child thread");
 
        // creating a thread 
        JavaEnumerateExp t1 = new JavaEnumerateExp("Thread-1", g1);
        System.out.println("Starting of Thread-1");
        // creating another thread 
        JavaEnumerateExp t2 = new JavaEnumerateExp("Thread-2", g1);
        System.out.println("Starting of Thread-2");
 
        // returns the number of threads put into the array
        Thread[] group = new Thread[g1.activeCount()];
        int count = g1.enumerate(group);
        
        // prints active threads
        for (int i = 0; i < count; i++) 
        {
            System.out.println(group[i].getName() + " found");
        }
    }
}
