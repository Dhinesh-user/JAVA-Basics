package Javabasics;



class A{
	void show() {
		System.out.println("In A show");
	}
	void show1() {
		System.out.println("In A showtime");
	}
}
class B extends A{
	void show() {
		super.show();
		System.out.println("In B Show");
	}
	void show2() {
		System.out.println("In B Showtime");
	}
	
}
class C extends A{
	void show() {
		System.out.println("In C show");
	}
	void show3() {
		System.out.println("In C showtime");
	}
}
public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        B obj = new B();
//        obj.show();
//        obj.show1();
//        obj.show2();
		
		A obj = new B();
        obj.show();
        obj.show1();
      
//         A obj = new A();
//         obj.show();
//         obj.show1();
//		A obj = new C();
//		obj.show();
//		obj.show1();
		
		B obj1 = (B) obj;
		obj1.show();
		obj1.show1();
		obj1.show2();
         
	}

}
