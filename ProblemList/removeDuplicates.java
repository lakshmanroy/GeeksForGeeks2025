public class removeDuplicates {
    public static int removeDuplicat(int nums[]) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>nums[i - 1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
        
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 2, 2, 2};

        System.out.println(removeDuplicat(nums));
    }
}