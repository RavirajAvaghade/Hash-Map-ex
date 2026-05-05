package HashMapEx;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx6 
{

	public static void main(String[] args) 
	{
      TreeMap<String,Integer> Map = new TreeMap<>(Collections.reverseOrder());
      Map.put("Alpha", 100);
      Map.put("David", 500);
      Map.put("Charli", 300);
      Map.put("Bravo", 200);
      
      for(Map.Entry<String,Integer> e:Map.entrySet())
      
    	   System.out.println(e.getKey()+ "=" +e.getValue());
      
	}

}
