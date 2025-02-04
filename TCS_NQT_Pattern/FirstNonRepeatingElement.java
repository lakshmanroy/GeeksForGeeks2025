import java.util.HashMap;

public class FirstNonRepeatingElement {
    public static int nonRepeating(int nums[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }
        return 0;
    }
   public static void main(String[] args) {
    int nums[]={3,5,5,3,1};

    System.out.println(nonRepeating(nums));
   } 
}
