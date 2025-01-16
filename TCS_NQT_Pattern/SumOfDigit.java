public class SumOfDigit {
    public static int sumDigit(int n){
        int sum=0;
        n=Math.abs(n);

        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n=1234;

        System.out.println(sumDigit(n));
    }
}
