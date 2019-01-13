
public class LibraryManagement {
	public static void main(String[] args) {
		Book book1 = new Book("Let us c", "Yasvant Kanetkar", 10);
		book1.getDetail();
		
		Book book2 = new Book("Java", "Kathy sierra", 5);
		book2.getDetail();
		
		Student s1 = new Student("Ankit",2);
		s1.show();
		
		Library l1 = new Library(1,0,1,5,"yes");
		l1.show();
	}
}
