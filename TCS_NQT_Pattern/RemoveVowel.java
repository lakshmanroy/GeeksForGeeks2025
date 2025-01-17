public class RemoveVowel {
    public static String removeVowel(String str){
        return str.replaceAll("[aeiouAEIOU]","");
    }
    public static void main(String[] args) {
        String str="education";
        
        System.out.println(removeVowel(str));
    }
}
