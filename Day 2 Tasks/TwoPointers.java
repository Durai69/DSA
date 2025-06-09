package addon;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 7, 5, 3, 8};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap arr[i] and arr[maxIdx]
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
