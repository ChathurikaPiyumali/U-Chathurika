package HashMap2022;

import java.util.HashMap;

public class Library {
	public static void main(String [] args) {
		
		
		//<data type 1 , data type 2>
		HashMap<Integer,Book<?,?>> bookList = new HashMap<>();
		
		Book<String,String> book1 = new Book<>( "Harry Potter","ISBN12345" );
		bookList.put(1, book1);
		
		Book<String,Integer> book2 = new Book<>( "Rings of Power",12345 );
		bookList.put(1, book2);
		
		
		//for loop run the elemnt wise
		for(int id : bookList.keySet()) {
			Book<?,?> value = bookList.get(id);
			
			System.out.println("Book ID is : " + id + "and the ISBN is :" +value.getBookISBN());
			
		}
		
		
		
		
		
		
		
	}
}
