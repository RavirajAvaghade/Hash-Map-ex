package HashMapEx;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingEx4 
{

	public static void main(String[] args) 
	{
       LinkedBlockingQueue<Integer> lq = new LinkedBlockingQueue<Integer>();
       lq.add(2);
       lq.add(3);
       lq.add(5);
       lq.add(8);
       lq.add(10);
       
       int sum = 0;
       int index = 0;
       int size = lq.size();        
       
    		   for(int i=0; i<size; i++)
           { Integer val = lq.poll();
             if(index %2==0)
             {
            	     sum += val;
             }
             index++;
             lq.add(val);
          }
    		   System.out.println(" Sum of alternative elements are : "+sum);
       
	}

}
