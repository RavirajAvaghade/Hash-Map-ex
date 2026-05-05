package HashMapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx7 
{

	public static void main(String[] args) 
	{
      TreeMap<String,Integer> Map1 = new TreeMap<>();
      Map1.put("A", 5);
      Map1.put("B", 10);
      
      TreeMap<String,Integer> Map2 = new TreeMap<>();
      Map2.put("C", 15);
      Map2.put("D", 20);
      
      for(Map.Entry<String, Integer> e:Map2.entrySet())
      {
          Map1.put(e.getKey(), Map1.getOrDefault(e.getKey(), 0) + e.getValue());
    	   
      }
      System.out.println(Map1);
	
	}

}
