
import java.util.HashMap;

public class SymmetricPairs {
    public static void solve(int nums[][]){
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num[]:nums){
            int first=num[0];
            int second=num[1];

            if(!map.containsKey(second)){
                  map.put(first,second);
            }
            else{
                System.out.print("("+first+ ","+second+ ")");
            }
        }
    }
    public static void main(String[] args) {
        int nums[][]={{1,2},{2,1},{3,4},{4,5},{5,4}};

        solve(nums);
    }
}
