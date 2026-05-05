package HashMapEx;

import java.util.IdentityHashMap;

public class IdentityMapEx1 
{

	public static void main(String[] args) 
	{
       IdentityHashMap<String,Integer> id = new IdentityHashMap<>();
       
       String k1 = new String("key");
       String k2 = new String("key");
       
       id.put(k1, 1);
       id.put(k2, 2);
       
       System.out.println(" Size : "+id.size());
       System.out.println(id);
	}

}
