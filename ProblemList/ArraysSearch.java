public class ArraysSearch {
    public static int search(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4};
        int x=3;

        System.out.println(search(arr, x));
    }
}
