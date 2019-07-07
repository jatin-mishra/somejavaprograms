class Notify1 extends Thread{

    public void run(){
        synchronized(this){
            System.out.println("starting  of : "                 Thread.currentThread().getName());
            try{
                this.wait();
            }catch(Exception e){
                e.printStacktrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class Notify2 extends Thread{
Notify1 nt1;
    public Notify2(Notify1 nt1){
        this.nt1 = nt1;
    }

    public void run(){
        synchronized(this.nt1){
            try{
                this.nt1.wait();
            }catch(Exception e){
                e.printStacktrace();
            }
        System.out.println(Thread.currentThread().getName() + "...notified");
        }
    }
}

class Notify3 extends Thread{
Notify1 nt1;
Notify3(Notify1 nt1){
    this.nt1 = nt1;
}

public void run(){
    synchronized(this.nt1){

        System.out.println("starting of : "+ Thread.currentThread().getName());

        this.nt1.notify();


    System.out.println(Thread.currentThread().getName() + "..notified");



    }
}

}

public class JavaNotifyExp   
{  
    public static void main(String[] args) throws InterruptedException  
    {  
        Notify1 notify1 = new Notify1();  
        Notify2 notify2 = new Notify2(notify1);  
        Notify3 notify3 = new Notify3(notify1);  
          
        // creating the threads   
        Thread t1 = new Thread(notify1, "Thread-1");  
        Thread t2 = new Thread(notify2, "Thread-2");  
        Thread t3 = new Thread(notify3, "Thread-3");  
          
        // call run() method  
        t1.start();  
        t2.start();  
        Thread.sleep(100);  
        t3.start();  
    }  
}  