import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StringLambdaDemo {

    public static void main(String[] args) {

        // Remove all strings with length less than 5

        List<String> list2 = new ArrayList<>(
            List.of("abcdef", "abcd", "abcdefg", "abc", "a", "abcdefghij", "a")
        );

        // Method 1: Anonymous Class
        list2.removeIf(new Predicate<String>() {
            public boolean test(String str) {
                return str.length() < 5;
            }
        });

        System.out.println(list2);


        // Consumer using Anonymous Class
        list2.forEach(new Consumer<String>() {
            public void accept(String str) {
                System.out.println(str);
            }
        });


        // Runnable using Anonymous Class
        Runnable runnable = new Runnable() {
            public void run() {
                for (int i = 1; i <= 30; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        };

        runnable.run();


        // Runnable using Lambda Expression
        Runnable runnable2 = () -> {
            for (int i = 1; i <= 30; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        };

        runnable2.run();
    }
}