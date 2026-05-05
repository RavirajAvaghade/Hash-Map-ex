package HashMapEx;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class TreeEx4 
{

	public static void main(String[] args) 
	{
       TreeMap<Integer,String> Map = new TreeMap<>();
       Map.put(2, "x");
       Map.put(5, "y");
       Map.put(8, "z");
       Map.put(1, "A");
       Map.put(7, "x");
       
       int threshold = 5;
       List<Integer> toremove =  new ArrayList<>();
       for(Integer key: Map.keySet())
       {
    	       if(key<threshold) toremove.add(key);
    	       
    	   }
       for(Integer k: toremove) Map.remove(k);
       
    	       System.out.println(Map);
       
	}

}
