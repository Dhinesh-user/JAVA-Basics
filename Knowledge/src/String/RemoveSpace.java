package String;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s = " Geeks For Geeks ";
   char[] ch = s.toCharArray();
   String ne = "";

//   for(int i = 0;i<s.length();i++) {
//	   if(ch[i]==(' '))
//		   continue;
//	   else
//		   ne = ne +ch[i];
//		   
//   }
//   System.out.println(ne);
	
   s= s.replace(" ", "");
   System.out.println(s);

	}
}
