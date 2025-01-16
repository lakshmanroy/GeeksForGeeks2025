import java.util.HashSet;

public class FindDuplicate {
    public static void findDuplicate(int nums[]){
        HashSet<Integer>map=new HashSet<>();
        boolean result=false;

        System.out.println("Duplicate Number:");

        for(int num:nums){
            if(map.contains(num)){
                System.out.print(num+ " ");
                result=true;
            }
            else{
                map.add(num);
            }
        }
        if(!result){
            System.out.println("None");
        }
    }
    public static void main(String[] args) {
        int nums[]={2, 3, 1, 2, 4, 3};

        findDuplicate(nums);
    }
}