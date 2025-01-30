package Javabasics;



class DKexception extends Exception{
	public DKexception(String str) {
		super(str);
	}
}
public class CustomException {

	
	public static void main(String[] args) {
		
		int i =20;
		int j=0;
		
		try {
			j=18/i;
			System.out.println("try block");
//			trycatch.run();
			if(j==0)
				throw new DKexception("Normal Method");
		}
		catch(ArithmeticException e){
			j=18/1;
			System.out.println(j+" , Cannot divide by zero: "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index out of range "+e);
		}
		catch(Exception e) {
			System.out.println("Something Wrong "+e);
		}
		
        finally {
	   System.out.println("Hi");
       }
		System.out.println("Bye");
		

	}

}
