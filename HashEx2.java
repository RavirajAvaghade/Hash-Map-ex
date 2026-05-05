package HashMapEx;

import java.util.HashMap;

public class HashEx2 
{

	public static void main(String[] args) 
	{
        String text = " Java hashmap is great and  hashmap is useful";
        String[] a = text.split(" ");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(String s: a)
		{
			if(!hm.containsKey(s))
			{
				hm.put(s, 1);
			}
			else
			{
				hm.put(s, hm.get(s)+1);
			}
		}
		System.out.println(hm);
		
	}

}
