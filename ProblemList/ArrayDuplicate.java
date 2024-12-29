import java.util.*;

class ArrayDuplicate {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count occurrences of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Add elements that appear more than once to the result list
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                result.add(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayDuplicate obj = new ArrayDuplicate(); // Create an instance of the class
        int arr[] = {2, 3, 1, 2, 3};
        System.out.println("Duplicates: " + obj.findDuplicates(arr)); // Call the method using the object
    }
}
