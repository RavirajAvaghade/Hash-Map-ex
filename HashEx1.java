package HashMapEx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashEx1 
{

	public static void main(String[] args) 
	{
       HashMap<String,Integer> hm = new HashMap<String,Integer>();
       hm.put("Abhi", 700);
       hm.put("Raj",800);
       hm.put("Aman", 600);
       hm.put("Raju", 500);
       hm.put("Karan",100);
       
       List<Integer> list = new ArrayList<>(hm.values());
       System.out.println(list);
       
	}

}
