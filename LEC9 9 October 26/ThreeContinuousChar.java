
// Write a program to find if the given string contains 3 continuous characters
// if yes, print the index of starting letter else print -1
// input: abbdefab
// output: 3
// at 3 there is def
// import java.util.*;
public class ThreeContinuousChar {
        public static void main(String[] args) {
            String s = "abbdefab";
        int index = -1;

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) + 1 == s.charAt(i + 1) &&
                s.charAt(i + 1) + 1 == s.charAt(i + 2)) {
                index = i;
                break;
            }
        }

        System.out.println(index);
        }
    }


//     class Main {
//     public static void main(String[] args) {
//         String s = "abbdefab";

//         for (int i = 0; i < s.length() - 2; i++) {
//             if (s.charAt(i) + 1 == s.charAt(i + 1) &&
//                 s.charAt(i) + 2 == s.charAt(i + 2)) {
//                 System.out.println(i);
//                 return;
//             }
//         }

//         System.out.println(-1);
//     }
// }


