import java.util.Scanner;

public class FindMissingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element :"); 
        String input=sc.nextLine();

       String str[]=input.split(",");
       int nums[]=new int[str.length];

       for(int i=0;i<str.length;i++){
        nums[i]=Integer.parseInt(str[i].trim());
       }
       int n=nums.length+1;
       int actualSum=0;
       int expectedSum=n*(n+1)/2;

       for(int num:nums){
        actualSum+=num;
       }
       System.out.println("The missing element is : "+ (expectedSum-actualSum));
    }
}
