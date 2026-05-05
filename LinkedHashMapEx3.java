package HashMapEx;
import java.util.LinkedHashMap;
public class LinkedHashMapEx3 
{

	public static void main(String[] args) 
	{
       LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
       map.put(1, " Hello World");
       map.put(2, " java program");
       map.put(3, "linked hash map");
       
       int totalword = 0;
       for(String value:map.values())
       {
    	      totalword+= value.split(" ").length;
    	      
       }
        System.out.println(" Total Words : "+totalword);
	}

}
