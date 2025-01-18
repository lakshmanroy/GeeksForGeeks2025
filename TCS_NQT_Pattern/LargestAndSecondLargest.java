public class LargestAndSecondLargest {
    public static void getLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("Not found");
        }
        else{
            System.out.println("largest:"+largest);
            System.out.println("secondLargest:"+secondLargest);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};

        getLargest(arr);
    }
}
