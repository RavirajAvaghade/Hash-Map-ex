package HashMapEx;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapEx1 
{

	public static void main(String[] args) 
	{
      LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
      map.put("Alice",3 );
      map.put("bob", 1);
      map.put("Adam", 2);
      
     List<Integer> names = new ArrayList<>(map.values());
     System.out.println(names);
      
	}

}
