package testthreads;

public class JavaNotifyExp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		notify1 nt1 = new notify1();
		notify2 nt2 = new notify2(nt1);
		notify3 nt3 = new notify3(nt1);
		
		nt1.start();
		nt2.start();
		
		Thread.sleep(100);
		nt3.start();
		
		
		
		

	}

}
