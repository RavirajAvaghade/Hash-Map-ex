package HashMapEx;

import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockEx7 
{

	public static void main(String[] args) 
	{
      LinkedBlockingQueue<Integer> original = new LinkedBlockingQueue<Integer>();
      Collections.addAll(original, 1,2,3,4,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
      
      LinkedBlockingQueue<Integer> even = new LinkedBlockingQueue<>();
      LinkedBlockingQueue<Integer> odd = new LinkedBlockingQueue<>();
      
      int size = original.size();
      for(int i=0; i<size; i++)
      {
    	     Integer val = original.poll();
    	     if(val%2==0)
    	     {
    	    	   even.add(val);
    	     }
    	     else
    	     {
    	    	    odd.add(val);
    	     }
      }
      System.out.println(" Even : "+even);
      System.out.println(" odd : "+odd);
	}

}
