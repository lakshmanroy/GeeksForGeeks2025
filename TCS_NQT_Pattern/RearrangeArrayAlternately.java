
import java.util.Arrays;

public class RearrangeArrayAlternately {
    public static void rearrangeAlternate(int arr[]){
        int n=arr.length;

        int maxIdx=n-1;
        int minIdx=0;
        int maxElement=arr[n-1]+1;

        for(int i=0;i<n;i++){
            if(i%2==0){
                arr[i]+=(arr[maxIdx]%maxElement)*maxElement;
                maxIdx--;
            }
            else{
                arr[i]+=(arr[minIdx]%maxElement)*maxElement;
                minIdx++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]/=maxElement;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        rearrangeAlternate(arr);

        System.out.println(Arrays.toString(arr));
    }
}

