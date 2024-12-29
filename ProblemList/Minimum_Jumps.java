public class Minimum_Jumps {
    public static int minJump(int nums[]){
        int n=nums.length;

        if(n<=1){
            return 0;
        }
        if(nums[0]==0){
            return -1;
        }
        int jumps=0,currEnd=0,possibleMax=0;
        for(int i=0;i<nums.length;i++){
            possibleMax=Math.max(possibleMax,i+nums[i]);
            if(i==currEnd){
                jumps++;
                currEnd=possibleMax;
            }
            if(currEnd>=n-1){
                return jumps;
            }
            if(i>=possibleMax){
                return -1;
            }
        }
        return -1;

    }
public static void main(String[] args) {
    int nums[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

    System.out.println(minJump(nums));
}
}
