package HashMapEx;

public class ThreadEx1 
{

	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
      t.start();
      for(int i=0; i<=10; i++)
      {
    	     System.out.println("Bye");
    	     try
    	     {
    	    	   Thread.sleep(3000);
    	     }
    	     catch(InterruptedException e)
    	     {
    	    	   e.printStackTrace();
    	     }
      }
}

}
// using implements in Runnable 
/*class Mytask implements Runnable
{

	public void run() 
	{
		for(int i=0; i<=10; i++)
	      {
	    	     System.out.println("hello");
	    	     try
	    	     {
	    	    	   Thread.sleep(3000);
	    	     }
	    	     catch(InterruptedException e)
	    	     {
	    	    	   e.printStackTrace();
	    	     }
	      }
	}
	
}*/

// by using extends to the thread thread is using to multitasking work at a time we will override run method 
class MyThread extends Thread
{

	public void run() 
	{
		for(int i=0; i<=10; i++)
	      {
	    	     System.out.println("hello");
	    	     try
	    	     {
	    	    	   Thread.sleep(3000);
	    	     }
	    	     catch(InterruptedException e)
	    	     {
	    	    	   e.printStackTrace();
	    	     }
	      }
	}
	
}