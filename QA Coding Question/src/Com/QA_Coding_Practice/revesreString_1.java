package Com.QA_Coding_Practice;

// using without user asking string 

public class revesreString_1 {
   public static void main(String[] args) {
	   
	   String str = "Hello";
	   String reverse = "";
	   
	   for(int i = str.length() -1 ; i >= 0; i--) {
		   
		   reverse += str.charAt(i);
		   
	   }
	   
	   System.out.println("Reverse number is = " + reverse);
   }
}
