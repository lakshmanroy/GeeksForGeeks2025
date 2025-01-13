public class SquarRoot {
public static int floorStr(int n){
    if(n==0 || n==1){
        return n;
    }
    int start=1,end=n,result=0;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<=n/mid){
            result=mid;
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return result;
}
    public static void main(String[] args) {
        int n=4;

        System.out.println(floorStr(n));
    }
}