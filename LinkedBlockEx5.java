package HashMapEx;

import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockEx5 
{

	public static void main(String[] args) 
	{
      LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
      Collections.addAll(queue,1,2,3,4,5);
      
      int k = 2;
      k = k % queue.size();
      for(int i=0; i<queue.size()-k; i++)
      {
    	      queue.add(queue.poll());
      }
      System.out.println(queue);
	}

}
