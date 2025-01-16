
public class ReverseNumber {
    public static int reverse(int n){
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;

            if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
                return 0;
            }
        }
        return (int)rev;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(reverse(n));
    }
}
