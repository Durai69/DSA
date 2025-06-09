package addon;

import java.util.Scanner;

public class RecursiveFactorial {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number to calculate its factorial: ");
	 int number = sc.nextInt();
	 int factorial = factorial(number);
	 System.out.println("Factorial of " + number + " is: " + factorial);
	 sc.close();
	
	 }
	 
	  public static int factorial(int n) {
		 if (n == 0 || n == 1) {
			 return 1;
		 }
		 return n * factorial(n - 1);
	 

	 }

}
