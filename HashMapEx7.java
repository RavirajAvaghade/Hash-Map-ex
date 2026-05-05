package HashMapEx;

import java.util.HashMap;

public class HashMapEx7 
{

	public static void main(String[] args) 
	{
       HashMap<Integer,Integer> m1 = new HashMap<Integer,Integer>();
       m1.put(1, 1);
       m1.put(2, 12);
       m1.put(3, 25);
       m1.put(4, 30);
       
       HashMap<Integer,Integer> m2 = new HashMap<Integer,Integer>();
       m2.put(1,1);
       m2.put(1, 2);
       m2.put(4, 30);
       m2.put(3, 25);
       
       int count = 0;
       
       for (Integer key : m1.keySet()) 
       {
          if(m2.containsKey(key) && m2.get(key).equals(m1.get(key)))
          {
        	     count++;
          }
    	       
       }
       System.out.println(" Common pairs count : "+count);
       
	}

}
