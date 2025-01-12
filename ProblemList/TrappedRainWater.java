public class TrappedRainWater {
public static int maxWater(int arr[]){
    int n=arr.length;

    int leftmax[]=new int[n];
    leftmax[0]=arr[0];

    for(int i=1;i<n;i++){
      leftmax[i]=Math.max(arr[i],leftmax[i-1]);
    }
    
    int rightmax[]=new int[n];
    rightmax[n-1]=arr[n-1];

    for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(arr[i],rightmax[i+1]);
    }
    int trappedWater=0;
    for(int i=0;i<n;i++){
        int waterLevel=Math.min(leftmax[i],rightmax[i]);
        trappedWater+=waterLevel-arr[i];
    }
    return trappedWater;
}
    public static void main(String[] args) {
        int arr[]={3, 0, 1, 0, 4, 0, 2};

        System.out.println(maxWater(arr));
    }
}