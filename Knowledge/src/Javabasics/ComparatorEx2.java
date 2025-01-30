package Javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Compare String Length using comparator interface
class Names {
	 private String name;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public Names(String name) {
		 this.name = name;
	 }
}
class String_length_comparator implements Comparator<Names>{

	@Override
	public int compare(Names o1, Names o2) {
		
		if(o1.getName().length()> o2.getName().length())
		return 1;
		else
	    return -1;
	}
	
}
public class ComparatorEx2 {

	public static void main(String[] args) {
		List<Names> strs = new ArrayList<Names>();
		strs.add(new Names("Santho"));
		strs.add(new Names("Virat"));
		strs.add(new Names("Mahi"));
		strs.add(new Names("Dk"));
		
		System.out.println("Sorting by String Length");
		Collections.sort(strs, new String_length_comparator());
		for(Names s:strs)
			System.out.println(s.getName());
		
		
	}

}
