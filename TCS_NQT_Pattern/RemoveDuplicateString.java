import java.util.LinkedHashSet;

public class RemoveDuplicateString {
    public static String removeDuplicate(String s){
        LinkedHashSet<Character>result=new LinkedHashSet<>();

        for(char c:s.toCharArray()){
            result.add(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:result){
            sb.append(c);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="programming";

        System.out.println(removeDuplicate(s));
    }
}
