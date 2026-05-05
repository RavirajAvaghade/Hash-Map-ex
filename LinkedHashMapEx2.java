package HashMapEx;

import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
public class LinkedHashMapEx2 
{

  public static void main(String[] args) 
	{
       LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
       map.put("K4", "Tiger");
       map.put("K1", "cat");
       map.put("K2", "dog");
       map.put("k3", "elephent");
       
       int lengthThreshold = 4;
       Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
       while (it.hasNext()) 
       {
           if (it.next().getValue().length() < lengthThreshold) 
           {
               it.remove();     
               
           }
           
       }
       System.out.println(map);
       
	}

}
