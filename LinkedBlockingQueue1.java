package HashMapEx;

import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue1
{

	public static void main(String[] args) 
	{
       LinkedBlockingQueue<Integer>queue = new LinkedBlockingQueue<Integer>();
       Collections.addAll(queue, 1,2,3,4,5);
       
       int size=queue.size();
       for(int i=0; i<size; i++)
       {
    	      Integer front = queue.poll();
    	      
    	      for(int j=0; j<size-1-i; j++)
    	      {
    	    	      queue.add(front);
    	      }
    	    		  
       }
       System.out.println(queue);
       
	}

}
