import java.util.Arrays;

public class MergeSort {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;

        // Move larger elements from arr1 to arr2 if needed
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap the elements
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        merge(arr1, arr2);
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
