package testthreads;

//import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class trylocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
			
			
		ExecutorService executor = Executors.newFixedThreadPool(3);
		ReentrantLock lock = new ReentrantLock();
		
		executor.submit(()-> {
			lock.lock();
			try {
				Thread.sleep(1);
//				System.out.println(name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		});
		
		executor.submit(() -> {
//			System.out.println("you name is : " );
		    System.out.println("Locked: " + lock.isLocked());
		    System.out.println("Held by me: " + lock.isHeldByCurrentThread());
		    boolean locked = lock.tryLock();
		    System.out.println("Lock acquired: " + locked);
		});
		
		}
	}




