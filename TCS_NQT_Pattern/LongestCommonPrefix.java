public class LongestCommonPrefix {
    public static String longestCommon(String arr[]){
        if(arr==null || arr.length==0){
            return "";
        }
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
             prefix=prefix.substring(0,prefix.length()-1);
             if(prefix.isEmpty()){
                return "";
             }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String arr[]={"flower", "flow", "flight"};

        System.out.println(longestCommon(arr));
    }
}
