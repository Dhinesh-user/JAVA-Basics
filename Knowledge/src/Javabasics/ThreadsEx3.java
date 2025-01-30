package Javabasics;

class counter{
	static int count;
//Instead of using join method we can use keyword called synchronized for the 
// method to avoid the multiple threads accessing the same method at the same time
//	public static synchronized int increment()
//	public synchronized int increment()
	public static int increment() {
		return count++;
	}
}
public class ThreadsEx3 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = ()->
		{
			for(int i =0;i<10;i++) {
				counter.increment();
			}
		};
		Runnable r2 = ()->
		{
			for(int i =0;i<10;i++) {
				counter.increment();
			}
		};
		
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		 t3.start();
		 t4.start();
//		
//		 Either we can use join method to ask the main thread to wait 
//		 untill other threads die

		 t3.join();
		 t4.join();
		 System.out.println(counter.count);
		
		

	}

}
