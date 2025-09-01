class Book{
	static int bookIdCounter; int bookId; String title, author;
	
	Book(String title, String author){
		this.title=title;
		this.author=author;
		bookIdCounter++;
		this.bookId=bookIdCounter;
	}
	
	String getTitle(){
		return title;
	}
	
	String getAuthor(){
		return author;
	}
	
	int getBookId(){
		return bookId;
	}
}

class Library{
	String libraryName; static int totalBooks;
	
	static void addBook(Library lb){
		totalBooks++;
	}
	
	static void displayTotalBooks(){
		System.out.println("Total books: "+totalBooks);
	}
}

public class LibraryBookAddition{
	public static void main(String argz[]){
		Book b1 = new Book("Sample text", "Writer 1");
		Book b2 = new Book("Word", "Writer 2");
		
		System.out.println("Book: "+b1.title+", Author: "+b1.author+", Id: "+b1.bookId);
		System.out.println("Book: "+b2.title+", Author: "+b2.author+", Id: "+b2.bookId);
		
		Library lb1 = new Library();
		Library lb2 = new Library();
		
		Library.addBook(lb1);
		Library.addBook(lb2);
		
		Library.displayTotalBooks();
	}
}
