// read 2 strings of small alphabets only,
// find how many characters to be deleted to make them anagram
// aabbcd
// abbde
// Output:3
import java.util.*;
public class MakeAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String d=sc.nextLine();
        char[] a=s.toCharArray();
        char[] b=d.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        sc.close();
    }
}
