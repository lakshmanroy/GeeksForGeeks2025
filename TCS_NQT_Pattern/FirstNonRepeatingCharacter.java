
import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
    public static char nonRepeating(String s){
        LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '_';
    }
    public static void main(String[] args) {
        String s="swiss";

        System.out.println(nonRepeating(s));
    }
}
