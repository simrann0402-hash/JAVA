
  // 1) read a line and print the words in sorted order of length
// input: this is a line of words
// output: a is of this line words
//bubble sort
import java.util.*;
public class WordsLengthSort {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String words[]=line.split(" ");
        for(int i=0; i<words.length; i++)
        {
            for(int j=i+1; j<words.length; j++)
            {
                if(words[i].length()>words[j].length())
                {
                    String t=words[i];
                    words[i]=words[j];
                    words[j]=t;
                }
            }
        }
        for(String x: words)
        {
            System.out.print(x+" ");
        }
        sc.close();

    }    
}

//Other Method
/* 
int n=words.length;
for(int i=n-1; i>0; i--)
{
    for(int j=0; j<i-1; j++)
    {
        if(words[j].length()>words[j+1].length())
        {
            String t=words[j];
            words[j]=words[j+1];
            words[j+1]=t;
        }
    }
}
System.out.println(Arrays.toString(words));
*/
//3rd method
/*
Comparator<String> lengthComparator= new Comparator<String>() {
public int compare(String s1, String s2)
{
return s1.length(), s2.length();
}
}
Arrays.sort(words, lengthComparator);
System.out.println(Arrays.toString(words));
 */