public class MissingNumber {
    public static int missing(int nums[]){
        int n=nums.length+1;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;

    }
    public static void main(String[] args) {
        int nums[]={1, 2, 4, 6, 3, 7, 8};

        System.out.println(missing(nums));
    }
}
