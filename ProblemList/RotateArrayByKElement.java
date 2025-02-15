public class RotateArrayByKElement {
    public static void rotate(int nums[],int k,String direction){
        int n=nums.length;
        k=k%n;
        
        if(direction.equals("right")){
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
        }
        else if(direction.equals("left")){
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            reverse(nums,0,n-1);
        }
        for(int num:nums){
            System.out.print(num+ " ");
        }
    }
    public static void reverse(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6,7};
        int k=2;
        String direction="right";
        
        rotate(nums,k,direction);
    }
}