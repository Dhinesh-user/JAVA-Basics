package Javabasics;

abstract class AbsEx{
	public abstract void connect(); 
		
	
}
class AE{
	public void show() {
		System.out.println("In A Show");
	}
}
public class AnonymousInnerClassEx {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
              AE obj = new AE() 
              {
            	 public void show() {
            		 System.out.println("In New Class Show");
            	 }
              };
              obj.show();
              
              AbsEx obj1 = new AbsEx() 
              {

				@Override
				public void connect() {
					System.out.println("In a New abstract class");
				}
            	 
              };
              obj1.connect();
           }

}
