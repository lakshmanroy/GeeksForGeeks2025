import java.util.*;
public class FindMiddle{
    public static int findMiddle(int nums[]){
        Arrays.sort(nums);
        int n=nums.length;
        
        if(n%2==1){
            return nums[n/2];
        }
        else{
            return (nums[n/2-1]+nums[n/2])/2;
        }
    }
    public static void main(String args[]){
        int nums[]={2,4,1,3,5};
        
        System.out.println(findMiddle(nums));
    }
}