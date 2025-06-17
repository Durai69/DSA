package datastructures;

import java.util.Scanner;

public class SearchWithTypeDetection {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data type (int, double, string): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter number of elements: ");
        int n = Integer.parseInt(sc.nextLine());

        switch (type) {
            case "int":
                int[] intArr = new int[n];
                System.out.println("Enter integer elements:");
                for (int i = 0; i < n; i++) {
                    intArr[i] = Integer.parseInt(sc.nextLine());
                }
                System.out.print("Enter element to search: ");
                int intKey = Integer.parseInt(sc.nextLine());
                int intIndex = linearSearch(intArr, intKey);
                printResult(intIndex);
                break;

            case "double":
                double[] doubleArr = new double[n];
                System.out.println("Enter double elements:");
                for (int i = 0; i < n; i++) {
                    doubleArr[i] = Double.parseDouble(sc.nextLine());
                }
                System.out.print("Enter element to search: ");
                double doubleKey = Double.parseDouble(sc.nextLine());
                int doubleIndex = linearSearch(doubleArr, doubleKey);
                printResult(doubleIndex);
                break;

            case "string":
                String[] strArr = new String[n];
                System.out.println("Enter string elements:");
                for (int i = 0; i < n; i++) {
                    strArr[i] = sc.nextLine();
                }
                System.out.print("Enter element to search: ");
                String strKey = sc.nextLine();
                int strIndex = linearSearch(strArr, strKey);
                printResult(strIndex);
                break;

            default:
                System.out.println("Unsupported type");
        }

        sc.close();
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int linearSearch(double[] arr, double key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key))
                return i;
        }
        return -1;
    }

    public static void printResult(int index) {
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}

