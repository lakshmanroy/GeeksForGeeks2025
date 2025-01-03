public class NumberOf1Bit {
    public static int setCount(int n){
        int count=0;
        while(n>0){
            count+=(n&1);
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=6;

        System.out.println(setCount(n));
    }
}
