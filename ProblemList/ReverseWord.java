public class ReverseWord {
    public static String reverse(String s){
        String word[]=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String args[]){
        String s="you are legend";
        System.out.println(reverse(s));
    }
}