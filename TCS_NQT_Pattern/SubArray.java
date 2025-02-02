import java.util.ArrayList;
import java.util.List;

public class SubArray {
 public static List<Integer>subArray(int nums[],int targetSum){
        int start=0,currSum=0;
        for(int end=0;end<nums.length;end++){
            currSum+=nums[end];
            while(currSum>targetSum && start<=end){
                currSum-=nums[start];
                start++;
            }
            if(currSum==targetSum){
                List<Integer>result=new ArrayList<>();
                for(int j=start;j<=end;j++){
                    result.add(nums[j]);
                }
                return result;
            }
        }
        return new ArrayList<>();
    }
    public static void main(String args[]){
        int nums[]={1, 2, 3, 7, 5};
        int targetSum=12;
        
        List<Integer>result=subArray(nums,targetSum);
        if(!result.isEmpty()){
            System.out.println("subArray with the same name:"+result);
        }
        else{
            System.out.println("no sub Array:");
        }
    }   
}
