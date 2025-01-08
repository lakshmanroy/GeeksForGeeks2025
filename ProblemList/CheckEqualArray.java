import java.util.HashMap;

public class CheckEqualArray {
    public static boolean isEqual(int a[],int b[]){
        if(a.length!=b.length){
            return false;
        }
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(!map.containsKey(num)){
                return false;
            }
            map.put(num,map.get(num)-1);
            if(map.get(num)==0){
                map.remove(num);
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args) {
        int a[]={1, 2, 5, 4, 0};
        int b[]={2, 4, 5, 0, 1};

        System.out.println(isEqual(a, b));
    }
}
