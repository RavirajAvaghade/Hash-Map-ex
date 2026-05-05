package HashMapEx;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapEx9 
{

	public static void main(String[] args) 
	{
      TreeMap<Employee,Integer> Map = new TreeMap<>();
      Map.put(new Employee(101,24,"Adam"), 90);
      Map.put(new Employee(100,25,"Bob"), 80);
      Map.put(new Employee(102,27,"Alice"),10);
	  for(Entry<Employee, Integer> e: Map.entrySet())
	  {
		   System.out.println(e.getKey() +" ="+ e.getValue());
	  }
	  System.out.println(Map);
	
	}

}
class Employee implements Comparable<Employee>
{

	int id;
	int age;
	String name;
	public Employee(int id,int age,String name)
	{
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public int compareTo(Employee o) 
	{
		return this.id-o.id;
	}
	public String toString() 
	{
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}