public class CountWordString {
    public static int countWord(String str){
        if(str==null || str.trim().isEmpty()){
            return 0;
        }
        return str.trim().split(" +").length;
    }
    
    public static void main(String[] args) {
        String str="Hello World! Welcome to TCS";

        System.out.println(countWord(str));
    }
}

