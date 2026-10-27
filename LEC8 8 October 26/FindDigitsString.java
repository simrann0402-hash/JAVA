
//Input: aba34 67bc df33d40 am2b4b5
// Output: 185
//Explanation: 34+67+33+40+2+4+5=185
//
// import java.util.*;

public class FindDigitsString {
    public static void main(String[] args) {
       String str = "aba34 67bc df33d40 am2b4b5";
        String[] arr = str.split(" ");
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            int num = 0;
            for(int j=0;j<word.length();j++){
                char ch = word.charAt(j);
                if(Character.isDigit(ch)){
                    num = (num*10) + (ch-'0');
                }else if(num!=0){
                    sum += num;
                    num = 0;
                }
            }
            sum += num;
        }
        System.out.println(sum);
    }
}

//Other Method
/*
String str=aba34 67bc df33d40 am2b4b5;
String output=str.replaceAll("[^0-9"]," " );
String ans="";
for(int i=0; i<str.length(); i++ )
{
char ch=str.charAt(i);
if(ch>='0' && ch<='9')
{
ans=ans +ch;
}
else
{
    ans=ans+ " ";
}
    System.out.println(("["+ans+"]"));
    System.out.println(("["+output[+"]"));
}
Scanner sc=new Scanner(ans)
int s=0;
while(sc.hasNextInt())
{
int x=sc.nextInt();
s=s+x;
}
System.out.println(s);
 */

//2nd Method
/* 
int sum=0;
for(int i=0; i<str.length(); i++)
{
    char ch=str.charAt(i);
    if(Character.isDigit(ch))
    {
        String numStr=""+ch;
        while(i+1<str.length() && Character.isDigit(str.charAt(i+1)))
        {
            numStr+=str.charAt(i+1);
            i++;
        }
        sum=sum+ Integer.parseInt(numStr);
    }
}
*/

