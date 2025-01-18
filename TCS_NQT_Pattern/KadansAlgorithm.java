public class KadansAlgorithm {
    public static int maximum(int nums[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            cs=cs+nums[i];
            ms=Math.max(ms, cs);
            if(cs<0){
                cs=0;
            }
        }
        return ms;
    }
    public static void main(String[] args) {
        int nums[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maximum(nums));
    }
}
