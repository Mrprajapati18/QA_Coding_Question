package Com.QA_Coding_Practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number  = Scan.nextInt();
		
		int reverse  = 0;
		
		while(number != 0) {
			int digit = number % 10;  // Get the last digit
			reverse = reverse * 10 + digit; // Append digit to reverse digit 
			number  = number / 10;  // remove the last number
		}
		System.out.println("Reverse number is " + reverse);
		Scan.close();
   }

}
