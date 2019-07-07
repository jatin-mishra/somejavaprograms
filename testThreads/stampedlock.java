package testthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

public class stampedlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		StampedLock lock = new StampedLock();
		
		executor.submit(()->{
			
			long stamp = lock.tryOptimisticRead();
			try {
				System.out.println("optimistic lock valid "+ lock.validate(stamp));
			    Thread.sleep(1);
			    System.out.println("optimistic lock valid "+ lock.validate(stamp));
			    Thread.sleep(2);
			    System.out.println("optimistic lock valid "+ lock.validate(stamp));
			  
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				lock.unlock(stamp);
			}
			
			
		});
		
//		executor.submit(()->{
//			
//			long stamp = lock.writeLock();
//			try {
//				System.out.println("write lock required ");
//				Thread.sleep(2);
//			}catch(Exception e) {
//				e.printStackTrace();
//			}finally {
//				System.out.println("going to do this");
//				lock.unlock(stamp);
//				System.out.println("write done");
//			}
//		});
//		

	}

}
