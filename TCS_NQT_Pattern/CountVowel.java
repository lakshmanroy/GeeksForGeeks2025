public class CountVowel {
    public static int vowel(String str){
        str=str.toLowerCase();
        int count=0;

        for(char c:str.toCharArray()){
            if(c=='a' || c=='e' || c=='o' || c=='i' || c=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="hellow world";

        System.out.println(vowel(str));
    }
}
