package Com.QA_Coding_Practice;

import java.util.Scanner;

public class CompareTwoString {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String S1 = Sc.next();
		System.out.println("Enter the Second String");
		String S2 = Sc.next();
		
		if(S1.compareTo(S2) == 0) {
			System.out.println("String is equal");
		}
		else {
			System.out.println("String is not Equal");
		}
		Sc.close();
  }
}


