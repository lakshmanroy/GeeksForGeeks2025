public class SumOfArray {
    public static int arraySum(int arr[]){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4};

        System.out.println(arraySum(arr));
    }
}
