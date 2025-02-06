package Com.QA_Coding_Practice;

// Write a Java program to find odd and even numbers?

import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args) {
		Scanner Sc  = new Scanner(System.in);
		System.out.println("Enter the number");
		int Num = Sc.nextInt();
		
		if(Num%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		Sc.close();
  }

}
