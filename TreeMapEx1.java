package HashMapEx;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx1 
{

	public static void main(String[] args) 
	{
       TreeMap<Integer,String> Map = new TreeMap<>();
       Map.put(50, "java");
       Map.put(20, "Python");
       Map.put(40, "C");
       Map.put(10, "C++");
       Map.put(30, "Rust");
       
       for(Entry<Integer, String> e : Map.entrySet())
       {
    	      System.out.println(e.getValue()+ " => "+e.getValue());
       }
       System.out.println(Map);

	}

}
