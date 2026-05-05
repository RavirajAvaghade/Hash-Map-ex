package HashMapEx;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo 
{

	public static void main(String[] args) 
	{
       LinkedHashMap<Integer,String> Map = new LinkedHashMap<Integer,String>();
       Map.put(1, "one");
       Map.put(22, "Two");
       Map.put(3, "Three");
       
       System.out.println(" After updating two " +Map);
	}

}
