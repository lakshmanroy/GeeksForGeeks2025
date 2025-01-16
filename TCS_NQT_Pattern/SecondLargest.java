

public class SecondLargest {
    public static int getLargest(int nums[]){
        int largest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;

        for(int num:nums){
            if(num>largest){
                SecondLargest=largest;
                largest=num;
            }
            else if(num>SecondLargest && num!=largest){
                SecondLargest=num;
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        int nums[]={3, 5, 7, 2, 8};

        System.out.println(getLargest(nums));
    }
}
