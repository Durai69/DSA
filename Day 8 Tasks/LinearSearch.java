package datastructures;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[]args) {
	int arr[]= {9,1,99,55,44,11};
	System.out.println((arr));
	Scanner sc =new Scanner(System.in);
	System.out.println("enter a value to find:");
	int find = sc.nextInt();
	for(int i=0;i<arr.length; i++) {
		if (arr[i]==find) {
			System.out.println("value found"+arr[i]+ "at index" +i);
			return;
		}
	}
	System.out.println("value not found");
}
}
