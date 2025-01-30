package Javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Teachers {
	int age;
	String name;
	int RollNo;
	public Teachers(int age,String name,int RollNo) {
		this.age = age;
		this.name = name;
		this.RollNo = RollNo;
	}
	
}
class NameComparator implements Comparator<Teachers>{

	@Override
	public int compare(Teachers o1, Teachers o2) {
		return o1.name.compareTo(o1.name);
	}
	
}
class AgeComparator implements Comparator<Teachers> {

	@Override
	public int compare(Teachers o1, Teachers o2) {
		if(o1.age==o2.age)
		    return 0;
		if(o1.age>o2.age)
	        return 1;
		else 
			return -1;
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Teachers> arr = new ArrayList<Teachers>();
		arr.add(new Teachers(23,"Viky",107));
		arr.add(new Teachers(21,"Dhinesh",101));
		arr.add(new Teachers(25,"Abi",104));
		
		System.out.println("Sorting by Name:");
		Collections.sort(arr, new NameComparator());
		for(Teachers t:arr) {
			System.out.println(t.RollNo+","+t.name+","+t.age);
		}
		System.out.println("Sorting by Age:");
		Collections.sort(arr, new AgeComparator());
		
		for(Teachers t:arr) {
			System.out.println(t.RollNo+","+t.name+","+t.age);
		}
		
		
	
	}

}
