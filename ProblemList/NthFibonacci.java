public class NthFibonacci {
    public static int[] fib(int n) {
        int[] result = new int[n];
        
        if (n > 0) result[0] = 0;
        if (n > 1) result[1] = 1;
        
        int nums1 = 0, nums2 = 1;
        for (int i = 2; i < n; i++) {  
            result[i] = nums1 + nums2;
            nums1 = nums2;
            nums2 = result[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] fibonacciNumbers = fib(n);
        
        System.out.print("Fibonacci numbers: ");
        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
