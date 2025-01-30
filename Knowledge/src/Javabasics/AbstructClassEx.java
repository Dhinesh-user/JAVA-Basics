package Javabasics;


abstract class Car{
	public abstract void drive();
	public abstract void fly();

	public void PlayMusic() {
		System.out.println("Music playing");
	}
}
// Abstract Class
abstract class Thor extends Car{

	@Override
	public void drive() {
		System.out.println("Drive a Car");
	}
	
}
// Concrete Class
class UpdatedThor extends Thor{  

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying");
	}
	
}
public class AbstructClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Car c = new UpdatedThor();
           c.drive();
           c.PlayMusic();
           c.fly();
           
	}

}
