import java.util.*;

interface MyList {
    public void add(int x);

    public void add(int index, int x);

    public int size();

    public void remove(int index);

    public int get(int index);

    public int indexOf(int x);

    public int lastIndexOf(int x);
}

class MyListImpl implements MyList {

    private int[] a = new int[10];
    private int size = 0;

    // Add element at the end
    @Override
    public void add(int x) {

        if (size == a.length) {
            a = Arrays.copyOf(a, size * 2);
        }

        a[size] = x;
        size++;
    }

    // Add element at a particular index
    @Override
    public void add(int index, int x) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == a.length) {
            a = Arrays.copyOf(a, size * 2);
        }

        for (int i = size - 1; i >= index; i--) {
            a[i + 1] = a[i];
        }

        a[index] = x;
        size++;
    }

    // Return size
    @Override
    public int size() {
        return size;
    }

    // Remove element at index
    @Override
    public void remove(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }

        size--;
    }

    // Get element at index
    @Override
    public int get(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return a[index];
    }

    // Find first occurrence
    @Override
    public int indexOf(int x) {

        for (int i = 0; i < size; i++) {
            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }

    // Find last occurrence
    @Override
    public int lastIndexOf(int x) {

        for (int i = size - 1; i >= 0; i--) {
            if (a[i] == x) {
                return i;
            }
        }

        return -1;
    }
}

public class MyListDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyList list = new MyListImpl();

        list.add(45);
        list.add(23);
        list.add(75);

        for (int i = 1; i <= 110; i++) {
            list.add(i);
        }

        System.out.println("Array elements:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nSize: " + list.size());

        System.out.println("Enter index of element you want to print:");

        int index = sc.nextInt();

        try {
            System.out.println("Element: " + list.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index");
        }

        System.out.println("Enter element to search:");

        int x = sc.nextInt();

        System.out.println("First occurrence: " + list.indexOf(x));
        System.out.println("Last occurrence: " + list.lastIndexOf(x));

        sc.close();
    }
}
