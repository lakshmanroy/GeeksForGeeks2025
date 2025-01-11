public class SelectionSort {
    public static void sort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        int minPos=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos=j;
            }
        }
        int temp=arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
       }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4, 1, 3, 9, 7};

        sort(arr);
        print(arr);
    }
}
