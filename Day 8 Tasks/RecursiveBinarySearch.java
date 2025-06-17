package datastructures;

import java.util.Scanner;

public class RecursiveBinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements (sorted): ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, n - 1, key);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }

    public static int binarySearch(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, left, mid - 1, key);
        } else {
            return binarySearch(arr, mid + 1, right, key);
        }
    }
}
