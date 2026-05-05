package HashMapEx;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx8 
{

	public static void main(String[] args) 
	{
       TreeMap<Student,Integer> Map = new TreeMap<>();
       Map.put(new Student(101,"Alice"), 80);
       Map.put(new Student(102,"Bob"),90);
       Map.put(new Student(104, "Adam"),70);
       
       for(Map.Entry<Student,Integer> e: Map.entrySet())
       {
    	       System.out.println(e.getKey()+ " = "+ e.getValue());
       }
       System.out.println(Map);
	}

}
class Student implements Comparable<Student>
{
	
	int id;
	String Name;
	public Student(int id,String Name)
	{
		this.id = id;
		this.Name = Name;
	}
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + "]";
	}
	public int compareTo(Student o) 
	{
		return this.id-o.id;
	}
	
}