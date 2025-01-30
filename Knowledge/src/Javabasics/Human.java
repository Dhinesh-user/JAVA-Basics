package Javabasics;

public class Human implements intrfc,Dancing{
  String name;
   int age;

public void print() {
	
	System.out.println("I am "+name);
	System.out.println("My age is "+age);
	
}
public static void walking() {
	System.out.println("Walking");
}

public Human(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}

@Override
public void singing() {
	System.out.println("Singing");
}
@Override
public void dance() {
	System.out.println("Dancing");
}

}
