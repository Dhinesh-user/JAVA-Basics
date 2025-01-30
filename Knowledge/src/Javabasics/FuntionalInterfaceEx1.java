package Javabasics;


@FunctionalInterface
interface adddd{
//	void show(int i);
	int add(int i, int j);
}
public class FuntionalInterfaceEx1 {

	public static void main(String[] args) {
//		By Using Lambda Expression
//		 adddd obj = (i,j)-> i+j;
//		 System.out.println( obj.add(4,5));
		
//		Anonymous Inner Class
		adddd obj = new adddd() 
		{
			public int add(int i,int j) {
				return i+j;
			}
		};
		System.out.println("By Using Anonymous Inner Class: "+obj.add(5,4));
	}

}
