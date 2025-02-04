import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NonRepeatingElement {
     public static List<Integer>findNonRepeating(int nums[]){
       HashMap<Integer,Integer>map=new HashMap<>();
       
       for(int num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
       }
       List<Integer>result=new ArrayList<>();
       for(int num:nums){
           if(map.get(num)==1){
               result.add(num);
           }
       }
       return result;
   }
    public static void main(String[] args) {
      int nums[]={1,2,-1,1,3,1};
        
        List<Integer>nonRepeating=findNonRepeating(nums);
        System.out.print(nonRepeating); 
    }
}
