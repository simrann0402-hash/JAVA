import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

// Functional Interface
interface Calc {
    int add(int a, int b);
}

// Method 1: Implementing interface using a class
class MyCalc implements Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

public class LambdaDemo {

    public static void main(String[] args) {

        // Method 1: Using a separate class
        Calc calc1 = new MyCalc();
        int s = calc1.add(4, 5);
        System.out.println(s);


        // Method 2: Using Anonymous Class
        Calc calc2 = new Calc() {
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println(calc2.add(6, 6));


        // Method 3: Lambda with parameter types
        Calc calc3 = (int a, int b) -> {
            return a + b;
        };

        System.out.println(calc3.add(10, 20));


        // Method 4: Lambda without parameter types
        Calc calc4 = (a, b) -> {
            return a + b;
        };

        System.out.println(calc4.add(5, 5));


        // Method 5: Lambda with one-line expression
        Calc calc5 = (a, b) -> a + b;

        System.out.println(calc5.add(7, 8));


        // Predicate Example
        List<Integer> constColl = List.of(34, 56, 34, 67, 7, 45, 36, 79, 9854, 343);

        List<Integer> list = new ArrayList<>(constColl);


        // Method 1: Anonymous Class
        Predicate<Integer> pred = new Predicate<Integer>() {

            public boolean test(Integer x) {
                if (x % 2 == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        list.removeIf(pred);
        System.out.println("Using Anonymous Class: " + list);


        // Method 2: Lambda Expression
        List<Integer> list2 = new ArrayList<>(constColl);

        Predicate<Integer> pred2 = (x) -> {
            if (x % 2 == 1) {
                return true;
            } else {
                return false;
            }
        };

        list2.removeIf(pred2);
        System.out.println("Using Lambda: " + list2);


        // Method 3: Short Lambda Expression
        List<Integer> list3 = new ArrayList<>(constColl);

        list3.removeIf(x -> x % 2 == 1);

        System.out.println("Using Short Lambda: " + list3);
    }
}


//Print a list using list.ForEach( lambda)
//Create an object of runnable interface and call the method run()
//create an object of Thread ob= new Thread(lambda) and call ob.start()
//create an object of Interface java.util.function.Supplier<Integer> that generates in range 0 to 6
//and call the method 5 times