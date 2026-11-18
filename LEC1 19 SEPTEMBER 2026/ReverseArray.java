/*
Write a program to reverse the parts of array
1 2 3 4 5 6 7 8 9 10 11
2 1 5 4 3 9 8 7 6 11 10

reverse first two elements, then next 3, then next 4, next 5,....and then the remaining elements.

reverse(a,0,1) j=0, k=1 with array size=2, with j<a.length-1 & k<a.length-1
reverse(a,2,4)  j=2, k=4 with array size=3, so j=k+1, and k=j+size-1, size++
reverse(a,5,8)   j=5, k=8 with array size=4, 
reverse(a,9,13)
*/

public class ReverseArray {

    static void reverse(int[] a, int j, int k) {
        while (j < k) {
            int temp = a[j];
            a[j] = a[k];
            a[k] = temp;

            j++;
            k--;
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int j = 0;
        int size = 2;
        int k = j + size - 1;

        while (j < a.length) {

            if (k >= a.length) {
                k = a.length - 1;
            }

            reverse(a, j, k);

            j = k + 1;
            size++;
            k = j + size - 1;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

