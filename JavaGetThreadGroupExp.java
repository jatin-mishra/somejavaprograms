class JavaGetThreadGroupExp implements Runnable {  
    public void run()   
    {  
        System.out.println("javatpoint");  
    }  
    
    public static void main(String[] args)   
    {  
        // create thread groups  
        ThreadGroup group = new ThreadGroup("ThreadGroup");  
        ThreadGroup anotherGroup = new ThreadGroup(group, "AnotherGroup");  
          
        // create threads and placed into thread group  
        Thread t1 = new Thread(group, new JavaGetThreadGroupExp(), "Thread-1");  
        Thread t2 = new Thread(anotherGroup, new JavaGetThreadGroupExp(), "Thread-2");  
  
        // Start the threads  
        t1.start();  
        t2.start();  
          
        // returns the Thread Group to which this thread belongs  
        System.out.println(t1.getName() +" is a member of " + t1.getThreadGroup().getName());  
        System.out.println(t2.getName()+ " is a member of "+ t2.getThreadGroup().getName());  
    }  
}  