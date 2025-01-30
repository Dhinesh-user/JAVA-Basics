package TestNGpack;

import org.testng.annotations.Test;

public class GroupEx {
  @Test(groups = "odd")
	public void test1(){
	 System.out.println("Testcase 1");
 }
  @Test(groups ="even")
  public void test2(){
		 System.out.println("Testcase 2");
	 }
  @Test(groups = "odd")
  public void test3(){
		 System.out.println("Testcase 3");
	 }
  @Test(groups ="even")
  public void test4(){
		 System.out.println("Testcase 4");
	 }
  @Test(groups = "odd")
  public void test5(){
		 System.out.println("Testcase 5");
	 }
}
