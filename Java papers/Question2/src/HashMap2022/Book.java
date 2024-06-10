package HashMap2022;

public class Book<T,U> {
	private T bookTitle;
	private U bookISBN;
	
	//constructor
	
	public Book(T bookTitle, U bookISBN) {
		super();
		this.bookTitle = bookTitle;
		this.bookISBN = bookISBN;
	}

	public U getBookISBN() {
		return bookISBN;
	}
	
	
	
	
	
	
}
