package addon;
import java.util.Scanner;

public class UserDefinedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = array[i];
        }

        
        for (int i = 0; i < size - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < size; j++) {
                if (sortedArray[j] > sortedArray[maxIdx]) {
                    maxIdx = j;
                }
            }
            
            int temp = sortedArray[i];
            sortedArray[i] = sortedArray[maxIdx];
            sortedArray[maxIdx] = temp;
        }

        System.out.print("Sorted array in descending order: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
