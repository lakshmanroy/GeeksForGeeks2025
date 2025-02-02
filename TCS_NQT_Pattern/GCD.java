public class GCD {
    public static int findGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%10;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a=56;
        int b=98;

        System.out.println(findGCD(a, b));
    }
}