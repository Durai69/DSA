package addon;

import java.util.Scanner;

public class RecursiveSumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
        sc.close();
    }

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return n % 10 + sumOfDigits(n / 10);
    }
}
