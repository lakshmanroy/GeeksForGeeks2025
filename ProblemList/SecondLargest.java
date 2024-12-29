import java.util.Arrays;
public class SecondLargest {
    public static int getLargest(int arr[]){
        int n=arr.length;
        if(n<2){
            return -1;
        }
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};
        System.out.println(getLargest(arr));
    }
}
