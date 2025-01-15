public class LongestCommonString {
public static String longestPalindrome(String s){
    if (s == null || s.length() < 2) {
        return s;
    }

    int start = 0, maxLength = 0;
    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);
        int len2 = expandAroundCenter(s, i, i + 1);
        int len = Math.max(len1, len2);

        if (len > maxLength) {
            maxLength = len;
            start = i - (len - 1) / 2;
        }
    }
    return s.substring(start, start + maxLength);
}

// Helper method to expand around center and calculate palindrome length
private static int expandAroundCenter(String s, int left, int right) {
    while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
        left--;
        right++;
    }
    return right - left - 1;
}
    public static void main(String[] args) {
        String s="aaaabbaa";
        System.out.println(longestPalindrome(s));
    }
}