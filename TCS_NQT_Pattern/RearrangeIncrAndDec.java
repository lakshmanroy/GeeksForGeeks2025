import java.util.Arrays;

public class RearrangeIncrAndDec {
 public static void rearrange(int nums[]){
       int n=nums.length;
       int arr[]=new int[n];
       Arrays.sort(nums);
       
       for(int i=0;i<n/2;i++){
        arr[i]=nums[i]; 
       }
       for(int i=n/2,j=n-1;i<n;i++,j--){
           arr[i]=nums[j];
       }
       for(int num:arr){
           System.out.print(num+ " ");
       }
   }
    public static void main(String[] args) {
        int nums[]={8,7,1,6,5,9};
        
        rearrange(nums);
    }
}