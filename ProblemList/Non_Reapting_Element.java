
import java.util.*;

public class Non_Reapting_Element {
    public static List<Integer>singleNumber(int arr[]){
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>result=new ArrayList<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);

        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                result.add(key);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 2, 1, 4};

        List<Integer>res=singleNumber(arr);
        if(res.isEmpty()){
            System.out.println("No found");
        }
        else{
            System.out.println("Non repeating :"+res);
        }
    }
}
