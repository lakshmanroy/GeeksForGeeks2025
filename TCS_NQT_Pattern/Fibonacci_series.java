
import java.util.Scanner;


public class Fibonacci_series {
    public static void fib(int n){
     int nums1=0,nums2=1;
     for(int i=0;i<n;i++){
        System.out.println(nums1+ " ");
        int temp=nums1+nums2;
        nums1=nums2;
        nums2=temp;
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your number:");
        int n=sc.nextInt();
        fib(n);

    }
}
