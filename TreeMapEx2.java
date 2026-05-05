package HashMapEx;

import java.util.TreeMap;

public class TreeMapEx2 
{

	public static void main(String[] args) 
	{
      TreeMap<Integer,String> Map = new TreeMap<>();
      Map.put(7, "seven");
      Map.put(2, "two");
      Map.put(4, "four");
      Map.put(9, "Nine");
      
      System.out.println(" Lowest Key : "+Map.firstKey());
      System.out.println(" Highest kay : "+Map.lastKey());
	}

}
