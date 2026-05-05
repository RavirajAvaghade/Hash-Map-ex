package HashMapEx;

import java.util.HashMap;
public class HashEx4 
{

	public static void main(String[] args) 
	{
       HashMap<String,Integer> input = new HashMap<>();
       input.put("One", 1);
       input.put("two", 2);
       input.put("three", 3);
       
       HashMap<Integer,String> reversed = new HashMap<>();
       
       for(String key: input.keySet())
       {
    	      reversed.put(input.get(key), key);
       }
       System.out.println(reversed);
	}
	

}
