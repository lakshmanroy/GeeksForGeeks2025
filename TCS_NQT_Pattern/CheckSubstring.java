public class CheckSubstring {
    public static boolean isCheck(String str1,String str2){
        return str1.contains(str2);
    }
    public static void main(String[] args) {
        String str1="hello";
        String str2="ell";

        if(isCheck(str1, str2)){
            System.out.println("Yes,it is a substring.");
        }
        else{
            System.out.println("No,it is no substring.");
        }
    }
}
