package Javabasics;


//class Ex3 implements Runnable {
//	public void run() {
//		int i=0;
//		for(;i<10;i++) {
//			
//		System.out.println("Hi");
//		try {
//			Thread.sleep(2);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		}
//	}
//}
//class Ex4 implements Runnable{
//	public void run() {
//		int i=0;
//		for(;i<10;i++) {
//		System.out.println("Hello");
//		try {
//			Thread.sleep(2);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		}
//	}
//}
public class ThreadsEx1 {

	public static void main(String[] args) {
		Runnable obj1 = ()-> {
				int i=0;
				for(;i<10;i++) {
					
				System.out.println("Hi");
				try {
					Thread.sleep(2);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				}
			};
			
		Runnable obj2 = ()-> {
			int i=0;
			for(;i<10;i++) {
				
			System.out.println("Hello");
			try {
				Thread.sleep(2);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
//		obj1.getPriority();
//		obj1.setPriority(Thread.MAX_PRIORITY);

	}

}
