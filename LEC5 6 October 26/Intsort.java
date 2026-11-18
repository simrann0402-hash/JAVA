
// Read a line and print the integers in sorted order
// input: 23 45 77 11 30     60
// output: 11 23 30 45 60 77

import java.util.*;

public class Intsort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        String[] words = line.trim().split("\\s+");

        int[] nums = new int[words.length];

        int i = 0;

        for (String word : words) {
            nums[i] = Integer.parseInt(word);
            i++;
        }

        Arrays.sort(nums);
        sc.close();

        System.out.println(Arrays.toString(nums));
    }
}