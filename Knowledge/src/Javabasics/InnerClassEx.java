package Javabasics;


class AEX{
	int age ;
	public void Config1() {
		System.out.println("In A config");
	}
	class BEX{
		public void Config2() {
			System.out.println("In B Config");
		}
	}
	static class CEX{
		public void Config3() {
			System.out.println("In C Config");
		}
	}
}
public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AEX obj = new AEX();
        obj.age=4;
        obj.Config1();
        
        
//      using the class name and obj of the outer 
//      class we can create object for inner class
        AEX.BEX obj1 = obj.new BEX();
        obj1.Config2();
        
//      IF the inner class is static then
//     we can call without the object of the outer class
        AEX.CEX obj2 = new AEX.CEX();
        obj2.Config3();
       
        
	}

}
