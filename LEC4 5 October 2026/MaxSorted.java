
public class MaxSorted {
    public static void main(String[] args) {

        int[] a = {1, 2, 9, 5, 6, 7, 8, 9, 4, 5};

        int count = 1;
        int max = 1;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] <= a[i + 1]) {
                count++;
            }
            else {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println(max);
    }
}