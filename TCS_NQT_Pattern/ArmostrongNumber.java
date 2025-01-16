public class ArmostrongNumber {
    public static boolean isArmostrong(int n){
        int original=n;
        int sum=0;
        while (n>0) {
            int lastDigit=n%10;
            sum+= (lastDigit*lastDigit*lastDigit);
            n=n/10;
        }
        return original==sum;
    }
    public static void main(String[] args) {
        int n=153;

       if(isArmostrong(n)){
        System.out.println(n+ " is Armostrong number");
       }
       else{
        System.out.println(n+ " is not Armostrong number");
       }

    }
}
