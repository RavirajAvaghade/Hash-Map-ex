package HashMapEx;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.*;

public class LinkedBlockEx3 
{

	public static void main(String[] args) 
	{
       LinkedBlockingQueue<String> lq = new LinkedBlockingQueue<String>();
       Collections.addAll(lq,"java","python","java","python","C", " oracle ");
       
       Set<String> seen = new HashSet<>();
       int size = lq.size();
       
       for(int i=0; i<size; i++)
       {
    	       String s = lq.poll();
    	       if(!seen.contains(seen))
    	       {
    	    	   if (!seen.contains(s)) {
    	    		    seen.add(s);
    	    		    lq.add(s);
    	    		}

    	       }
       }
       System.out.println(lq);
	}

}
