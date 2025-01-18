public class MajorityElement {
public static int majority(int nums[]){
    int count=0;
    int candidate=0;
    
    for(int num:nums){
        if(count==0){
            candidate=num;
        }
        count+=(num==candidate)?1:-1;
    }
    return candidate;
}
    public static void main(String[] args) {
        int nums[]={3, 3, 4, 2, 4, 4, 2, 4, 4};

        System.out.println(majority(nums));
    }
}