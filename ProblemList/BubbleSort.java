public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int tern=0;tern<arr.length-1;tern++){
            for(int j=0;j<arr.length-1-tern;j++){
                if (arr[j]>arr[j+1]) {
                   int temp=arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1]= temp;
                }
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};

       bubbleSort(arr);
       print(arr);
    }
}