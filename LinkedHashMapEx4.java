package HashMapEx;

import java.util.LinkedHashMap;

public class LinkedHashMapEx4 
{

	public static void main(String[] args) 
	{
      LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
      map.put(1, " Raviraj");
      map.put(2,"Avaghade");
      
      int totalWords = 0;
      for(String values:map.values())
      {
    	     totalWords += values.split(" ").length;
      }
      System.out.println(" Total Words : "+totalWords);
	
	}

}
