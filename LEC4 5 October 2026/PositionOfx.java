
public class PositionOfx {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        int x = 30;

        int pos = -1;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == x) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Position = " + (pos + 1));
        }
    }
}