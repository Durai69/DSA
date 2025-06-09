package addon;

import java.util.Scanner;

public class ArrayUpdateOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements for the array:");
        
        for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}  
        
		System.out.print("Enter the index to update: ");
		int index = scanner.nextInt();
		
		if (index < 0 || index >= size) {
			System.out.println("Invalid index. Please enter a valid index between 0 and " + (size - 1));
		} else {
			System.out.print("Enter the new value: ");
			int newValue = scanner.nextInt();
			array[index] = newValue;
			System.out.println("Updated array: ");
			
			for (int i = 0; i < size; i++) {
				System.out.print(array[i] + " ");
			}
		}
		
		scanner.close();

		
		
		
    }
}
