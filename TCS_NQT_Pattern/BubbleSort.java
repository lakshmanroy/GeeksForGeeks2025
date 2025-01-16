public class BubbleSort {
    public static void bubbleSort(int nums[]){
        for(int tern=0;tern<nums.length-1;tern++){
            for(int j=0;j<nums.length-1-tern;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[]={5, 3, 8, 6, 2};

        bubbleSort(nums);
        printArr(nums);
    }
}
