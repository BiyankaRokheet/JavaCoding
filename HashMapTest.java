import java.util.HashMap;

public class HashMapTest
{
  
    
    public static void main (String[] args) 
    {
        HashMap<Integer, String> hm = new HashMap <> ();
        hm.put(10, "Biyanka");
        hm.put(15, "Srinika");
        hm.put(29, "Stuti");
        hm.put(32, "Srijon");
        hm.put(120, "Bivash");
        System.out.println("HelloWorld");
        System.out.println("The roll number 29 has the name " + hm.get(29));
    }
   
}
