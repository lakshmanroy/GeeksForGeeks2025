
import java.util.HashMap;

import java.util.HashMap;

public class IsomorphicString {
    public static boolean isSormorphic(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check mapping from s1 to s2
            if (map1.containsKey(ch1)) {
                if (map1.get(ch1) != ch2) {
                    return false;
                }
            } else {
                map1.put(ch1, ch2);
            }

            // Check mapping from s2 to s1
            if (map2.containsKey(ch2)) {
                if (map2.get(ch2) != ch1) {
                    return false;
                }
            } else {
                map2.put(ch2, ch1);
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s1="aab";
        String s2="xxy";

        System.out.println(isSormorphic(s1, s2));
    }
}