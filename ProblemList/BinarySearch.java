public class BinarySearch {
    public static int search(int arr[],int k){
        int start=0,end=arr.length-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                result=mid;
                end=mid-1;
            }
            else if(arr[mid]<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={1, 2, 3, 4, 5};
        int k=4;

        System.out.println(search(arr, k));
    }
}