import java.util.*;
public class MapSearchDemo {
    public static void main(String[] args) {
        // read n
        // read n keys and product name
        // read k: key
        // print the product with key <=k
        // Example
        /*
        10
        34 Pendrive
        23 Laptop
        82 Tablet
        33 Mobile

        ........
        23 

        Print all items with key <=23 in sorted order of key
         */
        Scanner sc=new Scanner(System.in);
        TreeMap<Integer, String> map=new TreeMap<>();
        int n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            int k=sc.nextInt();
            String product=sc.next().trim();
            map.put(k,product);
        }
        int key=sc.nextInt();
        for(int k:map.keySet())
        {
            if(k>key)
            {
                break;
            }
            System.out.println(map.get(k));
        }
       System.out.println(map.subMap(0, 12));
       sc.close();
    }   
}
        // Map<Integer, String> sub1 
        // map.tailmap(40) // means all items >=40
        // map.headMap(key) //all items <= key
        // map.ceilingKey(40) //40 or above
        // map.higherKey(40) //key>40
        // map.ceilingEntry(40)  //one entry whose marks are 40 or 39 or 38 or 37
        // map.higherEntry(40) //the students who just passed the exam

  