public class Book {
	private String bookName;
	private String writer;
	public int quantity;

	Book(String bookName, String writer, int quantity) {
		this.bookName = bookName;
		this.writer = writer;
		this.quantity = quantity;
	}
	Book(){
		
	}

	void getDetail() {
		System.out.println("Book name = " + this.bookName);
		System.out.println("Author of this book is: " + this.writer);
		System.out.println("Quantity = " + this.quantity);
		System.out.println("------------------------");
	}

}
