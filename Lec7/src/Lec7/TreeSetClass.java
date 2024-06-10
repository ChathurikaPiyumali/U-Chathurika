//TreeSet - stored in sorted ascending order , not duplicate values

package Lec7;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<String>  treeset = new TreeSet<>();
		treeset.add("Amal");
		treeset.add("Kamal");
		treeset.add("Aamal");
		treeset.add("Nimal");
		treeset.add("Kamal");
		
		//display
		for(String value : treeset)
		{
			System.out.println(value);
		}
		
		SortedSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(20);
		set.add(40);
		
		for(Integer no : set)
		{
			System.out.println(no);
		} //sorted to ascending order
		

	}

}
