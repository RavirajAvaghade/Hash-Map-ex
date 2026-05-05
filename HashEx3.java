package HashMapEx;

import java.util.HashMap;

public class HashEx3 {

	public static void main(String[] args) 
	{
       HashMap<String,Integer> hm =  new HashMap<String,Integer>();
       hm.put("A", 10);
       hm.put("B", 25);
       hm.put("C", 15);
       
       String maxKey = null;
       int maxVal = Integer.MIN_VALUE;
       
       for(String key: hm.keySet())
       {
    	     int value = hm.get(key);
    	     if(value>maxVal)
    	     {
    	    	   maxVal = value;
    	    	   maxKey = key;
    	     }
       }
       System.out.println(" Max Key : "+maxKey+", Value : " +maxVal);
	}

}
