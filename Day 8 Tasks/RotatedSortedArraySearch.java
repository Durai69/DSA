package datastructures;

import java.util.Scanner;

public class RotatedSortedArraySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int index = searchRotatedArray(arr, 0, n - 1, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
        sc.close();
    }

    public static int searchRotatedArray(int[] arr, int left, int right, int key) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[left] <= arr[mid]) {
            if (key >= arr[left] && key < arr[mid]) {
                return searchRotatedArray(arr, left, mid - 1, key);
            } else {
                return searchRotatedArray(arr, mid + 1, right, key);
            }
        }
        if (key > arr[mid] && key <= arr[right]) {
            return searchRotatedArray(arr, mid + 1, right, key);
        } else {
            return searchRotatedArray(arr, left, mid - 1, key);
        }
    }
}
