// // package LEC4 5 October 2026;

public class ShiftZeroes {
    public static void main(String[] args) {

        int[] a = {1, 0, 2, 0, 3, 0, 4, 5};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }
        }

        while (count < a.length) {
            a[count++] = 0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}