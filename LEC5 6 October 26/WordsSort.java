//ALPHABETICALLY
// 1) read a line and print the words in sorted order of length
// input: this is a line of words
// output: a is of this line words
import java.util.*;
public class WordsSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String words[]=line.split(" ");
        Arrays.sort(words);
        for(String i:words)
        {
            System.out.print(i+ " ");
        }
        sc.close();

    }    
}
