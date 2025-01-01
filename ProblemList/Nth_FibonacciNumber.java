public class Nth_FibonacciNumber {
    public static int NthFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int nums1=0,nums2=1;
        int current=0;
        for(int i=2;i<=n;i++){
            current=nums2+nums1;
            nums1=nums2;
            nums2=current;
        }
    return current;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(NthFibonacci(n));
    }
}
