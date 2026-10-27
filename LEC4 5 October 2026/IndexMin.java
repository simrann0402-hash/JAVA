// package LEC4 5 October 2026;
  import java.util.*;
public class IndexMin {
    public static void main(String[] args) {
        //Find kth minimum of the array
        // k=1: min, k=2: 2nd min, k=3, 3rd
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:arr)
        {
            if(!ans.contains(x))
            {
                ans.add(x);
            }
        }
        Collections.sort(ans);
        int k=sc.nextInt();
        int min=ans.get(k-1);
        System.out.println(min);
        sc.close();

    }
}