package Javabasics;

public class AccessModifiers {
	private int a = 5;
	protected int b = 10;
	public int c= 15;
	int d = 20;
	public static void main(String[] args) {
		
		AccessModifiers ac = new AccessModifiers();
		System.out.println(ac.a);
		System.out.println(ac.b);
		System.out.println(ac.c);
        System.out.println(ac.d);
	}

}
