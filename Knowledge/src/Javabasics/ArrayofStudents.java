package Javabasics;

public class ArrayofStudents {

	String name ="";
	int age =0;
	double marks =0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayofStudents s1 = new ArrayofStudents();
      s1.name="DK";
      s1.age=23;
      s1.marks = 430;
      ArrayofStudents s2 = new ArrayofStudents();
      s2.name="MK";
      s2.age=22;
      s2.marks = 420;
      ArrayofStudents s3 = new ArrayofStudents();
      s3.name="FK";
      s3.age=21;
      s3.marks = 440;
      ArrayofStudents as[] = new ArrayofStudents[3];
      as[0] = s1;
      as[1] = s2;
      as[2] = s3;
      for(int i=0;i<as.length;i++) {
    	  
          System.out.print(as[i].age+" "+as[i].name);
    	  System.out.println();
      }
      
	}

}
