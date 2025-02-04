public class SecondSmallestAndSecondLargest {
    public static int[] getLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;

        for(int num:nums){
            if(smallest>num){
                secondSmallest=smallest;
                smallest=num;
            }
            else if(secondSmallest>num){
                secondSmallest=num;
                
            }
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest){
                secondLargest=num;
            }
        }
        return new int[]{secondSmallest,secondLargest};
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5};

        int result[]=getLargest(nums);

        System.out.println("SeconddSmallest is : "+ result[0]);
        System.out.println("secondLargest is :"+result[1]);
    }
}
