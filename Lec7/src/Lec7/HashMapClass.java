//HashMap -  this is not a part of the collection interface so we can not the use the add method . so use put

package Lec7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hmap = new HashMap<>();
		hmap.put("Amal",75);  // use put
		hmap.put("Kmal",80); 
		hmap.put("Nimal",55); 
		
		
		// display 
		
		// can not use for each loop
		//can convert to the HashMap to the EntrySet
		
		Set<Map.Entry<String, Integer>> myset = hmap.entrySet();
		
		// using EntrySet can manipulate to the loop
		
		for(Map.Entry<String, Integer> val :myset){
			
			//give keys only
			System.out.println("Key = " + val.getKey());
			
			//give values only
			System.out.println("Values = " + val.getValue());
			
			//give both  keys and values
			System.out.println("Key = " + val.getKey() + "Values = " + val.getValue());
			
			// give associate value
			System.out.println(hmap.get("Kamal"));
			
			//
			/*
			Integer res = hmap.get("kamal");
				res= res+10;
				hmap.put("Kamal" , res);
				
			*/	
				
			//newly add values
			/*	
			hmap.put("Amal", 1000);
				
			for(Map.Entry<String, Integer> val :myset)
			{
				System.out.println("Key = " + val.getKey() + "Values = " + val.getValue());
				
			}
			*/
		
				
			
			
			
		}
		
		
	}

}
