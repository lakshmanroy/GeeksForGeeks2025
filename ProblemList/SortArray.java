import java.util.*;
public class SortArray {
    public static void sortArr(int arr[]){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        int arr[]={1, 5, 3, 2};
        sortArr(arr);
       System.out.print(Arrays.toString(arr));
    }
}
