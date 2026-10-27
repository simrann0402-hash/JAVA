// package LEC11 13 October 26;
import java.util.*;

public class RepeatedElement {
    public static void main(String[] args) {
        // 1 2 3 4 5 3 1 6 3 7 8 1 2 3
        // print the first integer that occurs third time
        // print all non repeating elements in sorted order
        // print repeated elements in the order they occur in the input
        int[] nums = { 1, 2, 3, 4, 5, 3, 1, 6, 3, 7, 8, 1, 2, 3 };
        HashMap<Integer, Integer> n = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = n.getOrDefault(nums[i], 0) + 1;
            n.put(nums[i], count);
            if (count == 3) {
                System.out.println(nums[i]);
                break;
            }
        }
      
        HashMap<Integer, Integer> a = new HashMap<>();
        TreeSet<Integer> sorted = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            int count = a.getOrDefault(nums[i], 0) + 1;
            a.put(nums[i], count);
        }
        for (int key : a.keySet()) {
            if (a.get(key) == 1) {
                sorted.add(key);
            }
        }
        System.out.println(sorted);
    }
}
