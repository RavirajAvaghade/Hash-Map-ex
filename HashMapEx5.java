package HashMapEx;

import java.util.HashMap;

public class HashMapEx5 
{

	public static void main(String[] args) 
	{
      HashMap<String,String> m1 = new HashMap<String,String>();
      m1.put("A","Apple");
      m1.put("B", "Ball");
      m1.put("C", "Cat");
      
      HashMap<String,String> m2 = new HashMap<String,String>();
      m2.put("A", "Apple");
      m2.put("B", "Ball");
      m2.put("D", "Dog");
      
      int count = 0;
      for(String key: m1.keySet())
      {
    	    if(m2.containsKey(key) && m2.get(key).equals(m1.get(key)))
    	    {
    	    	    count++;
    	    	    
    	    }
      }
      System.out.println(" Common pairs count : "+count);
      
      
	}

}
