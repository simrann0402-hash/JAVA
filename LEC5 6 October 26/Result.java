
import java.util.*;

public class Result {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line=sc.nextLine();
        String words[]=line.split(" ");
        int n=words.length;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String t = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(words));
        sc.close();
        
    }
}
