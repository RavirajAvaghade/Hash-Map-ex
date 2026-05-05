package HashMapEx;

import java.util.TreeMap;

public class TreeMapEx5 
{

	public static void main(String[] args) 
	{
      TreeMap<String,String> Map = new TreeMap<>();
      Map.put("US", "washingtone");
      Map.put("IN","Dehli");
      Map.put("JP", "Tokyo");
      
      String searchvalue = "US";
      if(Map.containsKey(searchvalue))
      {
       System.out.println(" found");
      }
   else
    	  System.out.println("not found");
    	  }
	
}
