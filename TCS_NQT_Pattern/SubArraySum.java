public class SubArraySum {
    public static void findSubArray(int arr[],int target){
        int start=0,currSum=0;
        for(int end=0;end<arr.length;end++){
            currSum+=arr[end];

            while(currSum>target && start<=end){
                currSum-=arr[start];
                start++;
            }
            if(currSum==target){
                System.out.print(start+" "+end);
                return;
            }
        }
        System.out.print("No subArray");
    }
    public static void main(String args[]){
        int[] arr = {1, 4, 20, 3, 10, 5};
        int target=33;

        findSubArray(arr, target);

    }
}
