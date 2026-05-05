package HashMapEx;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockEx2 
{

	public static void main(String[] args) 
	{
       LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
       queue.add(10);
       queue.add(5);
       queue.add(20);
       queue.add(7);
       
       int size = queue.size();
       
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       
       for(int i=0; i<size; i++)
       {
    	     Integer value = queue.poll();
    	     if(value>max)  max = value;
    	     if(value<min)  min = value;
    	     queue.add(value);
       }
       System.out.println(" Max : "+max);
       System.out.println(" Min : "+min);
       
	}

}
