package testthreads;

public class notify1 extends Thread{
	
	public void run() {
		synchronized(this) {
			System.out.println("Starting of : " + Thread.currentThread().getName());
			
			try {
				this.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "...notified0");
		}
	}

}
