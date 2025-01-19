public class SearchElement {
    public static int search(int nums[],int target){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid-1;
            }
            else{
                end=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={4, 5, 6, 7, 0, 1, 2};
        int target=0;

        System.out.println(search(nums, target));

        for(int num:nums){
            System.out.println(num+ " ");
        }

    }
}
