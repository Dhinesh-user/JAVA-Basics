package Javabasics;


public class Methods {
    static int c = 15;
    int d = 20;
    
	public static void main(String[] args) {
		
		MyUtils obj = new MyUtils();
        obj.speak(); // non static method from diff class need an instance for access
        
        MyUtils.talk(); // Static method from diff class no need an instance for access with the class name we can access
      
        walk();	
        Methods methods = new Methods();
		methods.speech(); // non static method from same class need an instance for access
        
		walk();// Static method from same class no need an instance for access with the class name we can access
	  
		System.out.println(c);
		System.out.println(methods.d);
		
		System.out.println(MyUtils.a);
		System.out.println(obj.b);
	}

	public static void walk() {
	System.out.println("static method inside same class we can call the method directly");
    }
	public void speech() {
	System.out.println("non static inside the same class need to create an instance to access");
	}
}

