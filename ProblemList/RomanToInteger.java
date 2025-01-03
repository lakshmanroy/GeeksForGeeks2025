
import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int curr=map.get(s.charAt(i));
            if(curr>prev){
                total+=curr-2*prev;
            }
            else{
                total+=curr;
            }
                prev=curr;
        }
        return total;
    }
    public static void main(String[] args) {
        String s="IX";
        System.out.println(romanToInt(s));
    }
}
