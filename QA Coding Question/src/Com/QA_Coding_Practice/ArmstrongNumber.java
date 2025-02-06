package Com.QA_Coding_Practice;

import java.util.Scanner;

// Write a Java program to check whether a given number is Armstrong?

// An Armstrong number (or narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

// 153 = 1*3 + 5*3 + 3*3  (Armstrong number)
// 9474 = 9*4 + 4*4 + 7*4 + 4*4 (Armstrong number)
// 123 =! 1*3 +2*3 +3*3  (Not an Armstrong number)

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is Armstrong
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

	}

}
