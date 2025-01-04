public class ArmstrongNumber {
    public static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        return sum==original;
    }
    public static void main(String[] args) {
        int n=153;

        System.out.println(isArmstrong(n));
    }
}
