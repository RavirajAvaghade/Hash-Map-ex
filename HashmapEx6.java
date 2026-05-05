package HashMapEx;

import java.util.HashMap;

public class HashmapEx6 {

	public static void main(String[] args) 
	{
        HashMap<String,String> m1 = new HashMap<String,String>();
        m1.put("A", "Anuj");
        m1.put("R", "Raviraj");
        m1.put("p", "pavan");
        m1.put("k", "kiran");
        
        HashMap<String,String> m2 = new HashMap<String,String>();
        m2.put("R", "Raviraj");
        m2.put("A", "Alice");
        m2.put("B", "Bob");
        m2.put("A", "Adam");
        
        int count = 0;
        for(String key:m1.keySet())
        {
        	   if(m2.containsKey(key) && m2.get(key).equals(m1.get(key)))
        	   {
        		   count++;
        	   }
        }
        System.out.println(" Common pairs count :"+count);
	}

}
