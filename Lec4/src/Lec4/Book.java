package Lec4;

public class Book  implements Printable {
	
	private int bookid;
	private String bookName;
	
	public Book (int bId, String bName) {
		bookid = bId;
		bookName = bName;
	}
	
	public void print() {
		System.out.println("book id :" + bookid +"  \n book Name : " +bookName);
	}
}
