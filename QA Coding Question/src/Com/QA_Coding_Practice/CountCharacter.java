package Com.QA_Coding_Practice;

import java.util.Scanner;

//  Write a Java Program to count the number of characters in a given String?

public class CountCharacter {
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("Enter the number of String");
		
		String input = Scan.nextLine();
		
		int count = input.length();
		
		System.out.println("Character of the number is " + count);
		
		Scan.close();
	}

}
