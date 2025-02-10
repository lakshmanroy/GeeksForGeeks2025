import java.util.*;
public class FindRepeatingAllElement {
    public static void findRepeating(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>result=new HashSet<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)>1){
                result.add(num);
            }
        }
        System.out.print("Repeating Element is:"+result);
    }
    public static void main(String[] args) {
        int nums[]={1,1,2,3,4,4,5,2};

        findRepeating(nums);
    }
}