package HashMapEx;

import java.util.EventObject;
import java.util.IdentityHashMap;

public class IdentityEx2 
{
    public static int CountUnique(Object[]arr)
    {
    	 IdentityHashMap<Object,Boolean> map = new IdentityHashMap<>();
        for(Object o: arr)
        {
        	   map.put(o, true);
        }
        return map.size();
	}
    public static void main(String[] args) 
	{
        Object[] arr = {new String("a"),new String("a") };
        System.out.println(" unique refs = "+CountUnique(arr));
	}
}

