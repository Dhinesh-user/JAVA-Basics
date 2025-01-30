package Javabasics;
 
import java.lang.*;

@FunctionalInterface
interface abc{
//	void show(int i);
	void show1(int i, int j);
}
//class ex implements abc{
//	public void show()
//	{
//		System.out.println("In Class show");
//	}
//}
public class FuntionalInterfaceEx {

	public static void main(String[] args) {
//		abc  obj = new abc() {
//			public void show() {
//				System.out.println("In Anonymous inner class"
//						+ "");
//			}
//		};
//		obj.show();
		
//	   Lampda Expression with Functional Interface
		
		
//		abc obj = (i)-> System.out.println("In Lambda Expression:" + i);
//		obj.show(5);
//		abc obj1 = i -> System.out.println("In Lambda Expression:" + i);
//		obj.show(5);
//		abc obj2 = (int i)-> System.out.println("In Lambda Expression:" + i);
//		obj.show(5);
		
		abc obj2 = (i,j)-> System.out.println("In Lambda Expression:" + i+","+j);
		obj2.show1(5,6);
		 
		
		
		
}
		
		

	

}
