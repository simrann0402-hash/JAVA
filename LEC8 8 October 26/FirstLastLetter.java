//First Letter of first word and last word
//Input: Amit Kumar Dhiman
//Output: AD
//ankit
//AT
//for single word first letter and last letter
import java.util.*;
public class FirstLastLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String letter[]=name.split(" ");
        char first=letter[0].charAt(0);
        char last;
        if(letter.length==1)
        {
            last=letter[0].charAt(letter[0].length()-1);
        }
        else
        {
            last=letter[letter.length-1].charAt(0);
        }
        System.out.println((""+first+last).toUpperCase());
        sc.close();
    }
}
