import java.util.HashSet;

public class RemoveDuplicateString {
    public static String removeDuplicate(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "zvvo";

        System.out.println(removeDuplicate(s)); // Output: "zvo"
    }
}
