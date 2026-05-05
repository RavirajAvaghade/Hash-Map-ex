package HashMapEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockEx8 
{

	public static void main(String[] args) 
	{
      LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
      Collections.addAll(queue, 1,3,5,3,1);
      
      List<Integer> list = new ArrayList<>(queue);
      boolean ispalindrome = true;
      for(int i=0; i<list.size(); i++)
      {
          if (!list.get(i).equals(list.get(list.size() - 1 - i))) 
          {
            
                ispalindrome = false;
                break;
             
           }
      
      }
      System.out.println(" is palindrome : "+ispalindrome);
}

}
