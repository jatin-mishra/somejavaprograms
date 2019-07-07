package testthreads;

public class notify2 extends Thread {

	notify1 nt1;
	
	public notify2(notify1 nt1) {
		this.nt1 = nt1;
	}
	
	public void run() {
		synchronized(this) {
			System.out.println("starting of : " + Thread.currentThread().getName());
			try {
				this.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() + "....notified1");
			
		}
	}
	
}
