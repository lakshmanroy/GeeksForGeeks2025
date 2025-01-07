public class ReverseStringsOptimize {
    public static  String revStr(String s){
        char str[]=s.toCharArray();
        int start=0,end=str.length-1;

        while(start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;

            start++;
            end--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String s="GeeksforGeeks";
        System.out.println(revStr(s));
        
    }
}
