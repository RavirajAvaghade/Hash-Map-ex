package HashMapEx;

import java.util.HashMap;

public class HashEx8 
{

	public static void main(String[] args) 
	{
      HashMap<String,Integer> m1 = new HashMap<>();
      m1.put("A", 5);
      m1.put("B", 15);
      
      HashMap<String,Integer> m2 = new HashMap<>();
      m2.put("B", 10);
      m2.put("C", 20);
      
      for (String key : m2.keySet()) 
      {
          m1.put(key, m1.getOrDefault(key, 0) + m2.get(key));

	  }
      System.out.println(m1);

   }
	
}
