public class CheckSorted {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6};

        int i;

        for (i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                break;
            }
        }

        if (i == a.length - 1) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}

