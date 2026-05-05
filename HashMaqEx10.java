package HashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMaqEx10 
{

	public static void main(String[] args) 
	{
       HashMap<String,Integer> map = new HashMap<>();
       map.put("P", 42);
       map.put("q", 18);
       map.put("r", 16);
       
       List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
       {
	       list.sort(Map.Entry.comparingByValue());
	       
	        for (Map.Entry<String, Integer> e : list) 
	        {
	            System.out.println(e.getKey() + " = " + e.getValue());

	        }

	}

   }
}