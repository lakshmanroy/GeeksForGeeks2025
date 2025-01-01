public class Anagram {
    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int frequency[]=new int[26];
        for(int i=0;i<s1.length();i++){
            frequency[s1.charAt(i)-'a']++;
            frequency[s2.charAt(i)-'a']--;
        }
        for(int count:frequency){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="geeks";
        String s2="kseeg";

        System.out.println(isAnagram(s1, s2));
    }
}
