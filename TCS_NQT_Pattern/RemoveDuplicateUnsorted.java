import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateUnsorted {
    public static int[] removeDuplicate(int nums[]){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();

        for(int num:nums){
            set.add(num);
        }
        int unqueArr[]=new int[set.size()];
        int i=0;
        for(int num:set){
           unqueArr[i++]=num;
        }
        return unqueArr;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 9, 3, 1, 3, 9};

        int result[]=removeDuplicate(nums);
        System.out.println(Arrays.toString(result));
    }
}
