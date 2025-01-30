package Javabasics;
enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

// Driver class that contains an object of "day" and
// main().
class Test {
    Day day;

    // Constructor
    public Test(Day day) {
        this.day = day;
    }
    public void dayIsLike() {
        switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
        case SATURDAY:
        case SUNDAY:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

}
enum Color {
    RED,
    GREEN,
    BLUE;

   
      
}
public class EnumEx {

	public static void main(String[] args) {
		 String str = "SATURDAY"
		 		+ "";
	        Test t1 = new Test(Day.valueOf(str));
	        t1.dayIsLike();
	        
	        Color c1 = Color.RED;
	        System.out.println(c1);
	    }

}
