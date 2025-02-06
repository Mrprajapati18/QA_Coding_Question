package Com.QA_Coding_Practice;

import java.util.Scanner;
 // Write a program to find the prime number
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number of Values");
		int n = Sc.nextInt();
		
		if(n%1 == 0 || n%2 == 0) {
			System.out.println(n + " is Prime Number");
		}
		else {
			System.out.println(n + " is Not a prime Number");
		}
		Sc.close();
  }
}
