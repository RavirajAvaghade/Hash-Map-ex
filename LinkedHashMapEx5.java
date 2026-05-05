package HashMapEx;
import java.util.LinkedHashMap;
public class LinkedHashMapEx5 
{

	public static void main(String[] args) 
	{
       LinkedHashMap<Integer,String> map = new LinkedHashMap();
       map.put(122,"one");
       map.put(123,"Two");
       map.put(124, " Three");
       
       int totalWordcount = 0;
       
       for(String val: map.values())
       {
    	      totalWordcount+=val.split(" ").length;
    	      
       }
       System.out.println(" Total Word Count : "+totalWordcount);
       
	}

}
