public class DecimalToBinary {
    public static String convert(int n){
        if(n==0){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        while(n>0){
            sb.append(n%2);
            n=n/2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        int n=10;

        System.out.println(convert(n));
    }
}
