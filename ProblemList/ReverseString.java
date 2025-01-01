public class ReverseString {
    public static String reverseString(String s){
        char str[]=s.toCharArray();
        int left=0,right=str.length-1;

        while(left<right){
            char temp=str[left];
            str[left]=str[right];
            str[right]=temp;

            left++;
            right--;
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String s="Geeks";
        System.out.println(reverseString(s));

    }
}
