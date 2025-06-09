package addon;
import java.util.Scanner;

public class ArrayMinMax {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter " + size + " elements for the array:");
		
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}  
		
		int min = array[0];
		int max = array[0];
		
		for (int i = 1; i < size; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("Minimum value in the array: " + min);
		System.out.println("Maximum value in the array: " + max);
		
		scanner.close();
		
		
		
	}
	

}
