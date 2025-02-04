import java.util.HashMap;

public class FirstNonRepeatingString {
    public static char NonRepeating(String s){
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        } 
        return '\0';
    }
    public static void main(String args[]){
        String s="swisi";

        System.out.print(NonRepeating(s));
    }
}
