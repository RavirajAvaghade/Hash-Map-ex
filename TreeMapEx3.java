package HashMapEx;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx3 
{

	public static void main(String[] args) 
	{
        TreeMap<Integer,String> Map = new TreeMap<>();
        Map.put(1, "A");
        Map.put(3, "B");
        Map.put(5, "C");
        Map.put(7, "D");
        Map.put(9, "E");
        
        int minkey = 3; int maxkey = 8;
        for(Entry<Integer, String> e: Map.subMap(minkey, maxkey+1).entrySet())
        {
        	    System.out.println(e.getKey()+"=>"+e.getValue());
        }
        System.out.println(Map);
	}

}
