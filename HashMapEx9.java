package HashMapEx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx9 
{

	public static void main(String[] args) 
	{
      HashMap<String,Integer> hm =  new HashMap<String,Integer>();
      hm.put("x",12 );
      hm.put("y", 3);
      hm.put("z", 18);
      
      int threshold = 10;
      Iterator<Map.Entry<String, Integer>> it = hm.entrySet().iterator();
      while(it.hasNext())
      {
    	     if(it.next().getValue()<threshold)
    	     {
    	    	    it.remove();
    	     }
      }
      System.out.println(hm);
      
	}

}
