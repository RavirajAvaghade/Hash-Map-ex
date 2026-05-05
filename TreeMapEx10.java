package HashMapEx;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx10 
{

	public static void main(String[] args) 
	{
       TreeMap<Mobile,Integer> Map = new TreeMap<>();
       Map.put(new Mobile("SAMSUNG","S25",512,5000,125000), 10);
       Map.put(new Mobile("I Phone","17pro Max",512,4000,102000), 5);
       Map.put(new Mobile("xomi","redminote 7",128,7000,20000), 10);
       for(Entry<Mobile, Integer> e:Map.entrySet())
       {
    	       System.out.println(e.getKey() +"="+e.getValue());
       }
       System.out.println(Map);

       
	}

}
class Mobile implements Comparable<Mobile>
{
	String company;
	String name;
	int Ram;
	double battarycapacity;
	int price;
	public Mobile(String company,String name,int Ram,double battarycapacity,int price)
	{
		this.company = company;
		this.name = name;
		this.Ram = Ram;
		this.battarycapacity = battarycapacity;
		this.price = price;
	}
	public int compareTo(Mobile o) 
	{
		return this.price-o.price;
	}
	public String toString() 
	{
		return "Mobile [company=" + company + ", name=" + name + ", Ram=" + Ram + ", battarycapacity=" + battarycapacity
				+ ", price=" + price + "]";
	}
}