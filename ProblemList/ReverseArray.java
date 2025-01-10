public class ReverseArray {
public static void reverse(int arr[]){
    int start=0,end=arr.length-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        start++;
        end--;
    }
}
    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 5};

        reverse(arr);
        for(int num:arr){
            System.out.print(num+ " ");
        }
    }
}