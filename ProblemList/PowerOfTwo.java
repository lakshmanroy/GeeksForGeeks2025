public class PowerOfTwo {
public static boolean powerTwo(int n){
    if(n<=0){
        return false;
    }
    return (n&(n-1))==0;
}
    public static void main(String[] args) {
        int n=8;

        System.out.println(powerTwo(n));
    }
}