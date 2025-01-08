public class LongestCommonSuffix {
    static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n - 1];
    }
    public static void main(String[] args) {
        String s="abab";

        System.out.println(longestPrefixSuffix(s));
    }
}
