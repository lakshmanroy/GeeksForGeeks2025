public class ReverseWord {
    public static String reverseWord(String s){
        String word[]=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s="TCS is awesome";

        System.out.println(reverseWord(s));
    }
}
