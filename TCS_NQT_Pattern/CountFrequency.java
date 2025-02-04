import java.util.HashMap;

public class CountFrequency {
    public static void countfreq(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            System.out.println(num+ " "+map.get(num));
        }
    }

    public static void main(String[] args) {
        int nums[]={10,5,10,15,10,5};

        countfreq(nums);
    }
}