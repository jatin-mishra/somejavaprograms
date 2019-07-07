package testthreads;

public class notify3 extends Thread {
	
	notify1 nt1;
	
	public notify3(notify1 nt1) {
		this.nt1 = nt1;
	}
	
	public void run() {
		synchronized(this.nt1) {
			System.out.println("starting of : "+ Thread.currentThread().getName());
			
			this.nt1.notify();
			
			System.out.println(Thread.currentThread().getName() + "...notified2");
		}
	}

}
