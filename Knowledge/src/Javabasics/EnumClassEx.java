package Javabasics;

enum laptop{
	Dell(2000), Macbook(3000), Hp;

	private int price;

	private laptop(int price) {
		this.setPrice(price);
		System.out.println("With Price");
		
	}

	private laptop() {
		price = 1000;
		System.out.println("Without Price");
		
		
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
public class EnumClassEx {

	
	public static void main(String[] args) {
		 
		laptop lap = laptop.Hp;
		System.out.println(laptop.Dell);
		
		for(laptop s : laptop.values())
			System.out.println(s+":"+ s.getPrice() );

	}

}
