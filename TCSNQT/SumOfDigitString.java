import java.util.Scanner;

public class SumOfDigitString {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       String input=sc.nextLine();

       int sum=0;
       for(char ch:input.toCharArray()){
        if(Character.isDigit(ch)){
            sum+=Character.getNumericValue(ch);
        }
       }
       System.out.println(sum);
    }
}
