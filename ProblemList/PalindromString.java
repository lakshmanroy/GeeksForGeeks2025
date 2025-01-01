public class PalindromString {
    public static boolean isPalinrom(String s){
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abba";

        System.out.println(isPalinrom(s));
    }
}
