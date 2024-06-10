//HashSetClass - not have any duplicate values and order

package Lec7;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		
		HashSet<String> myhashset = new HashSet<>();
		
		myhashset.add("Amal");
		myhashset.add("Kamal");
		myhashset.add("Nimal");
		myhashset.add("Amal");
		myhashset.add("kamal");
		
		
		//display
		System.out.println(myhashset); // output not visible the duplicate values case is not consider
		
		//display
		
		for(String val : myhashset)
		{
			System.out.println(val);
		}
		

	}

}
