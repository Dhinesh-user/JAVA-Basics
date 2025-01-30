package Javabasics;


class Ex1 extends Thread {
	public void run() {
		int i=0;
		for(;i<10;i++) {
			
		System.out.println("Hi");
		try {
			Thread.sleep(3);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}
class Ex2 extends Thread{
	public void run() {
		int i=0;
		for(;i<10;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(3);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}
public class ThreadsEx {

	public static void main(String[] args) {
		Ex1 obj1 = new Ex1();
		Ex2 obj2 = new Ex2();
		obj1.start();
		
		obj2.start();
//		obj1.getPriority();
//		obj1.setPriority(Thread.MAX_PRIORITY);

	}

}
