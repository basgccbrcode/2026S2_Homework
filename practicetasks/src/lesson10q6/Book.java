package lesson10q6;

public class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	
}
	

	public void display() {
		System.out.print("%-30s by: %24s\n", this.title, this.author);
	}
	
	
	public static void main(String[] args) {
		Book b1 = new Book("Harry Potter", "Rowling");
		Book b2 = new Book("The Hobbit", "Tolkien");
		Book b3 = new Book("War and Peace", "Leo Tolstoy");

		
		Book[] books = { book1,
				 book2,
				 book3};

for (Book b: books) {
	b.display();
}
	}

}
