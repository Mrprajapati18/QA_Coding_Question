package Com.QA_Coding_Practice;

//Write a Java program to swap two numbers without using third variable
public class SwapTwoNumber {
  public static void main(String[] args) {
	  int X = 10;
	  int Y = 5;
	  X = X + Y;
	  Y = X - Y;
	  X = X - Y;
	  System.out.println("After Swapping  X is " + X +" And " + " Y Is " + Y );
   }

}
