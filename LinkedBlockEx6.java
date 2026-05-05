package HashMapEx;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockEx6 
{

	public static void main(String[] args) 
	{
      LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
      queue.add(3);
      queue.add(10);
      queue.add(6);
      queue.add(1);
      queue.add(12);
      
      int x = 6;
      int size = queue.size();
      for(int i=0; i<size; i++)
      {
    	    Integer val = queue.poll();
    	    if(val<=x)
    	    {
    	    	   queue.add(val);
    	    }
    	    else
    	    {
    	    	   queue.add(val);
    	    }
      }
      System.out.println(queue);
	}

}
