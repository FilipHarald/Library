package entities;

public class Book {
	private String name;
	private String author;
	private String content;
	private String ID;
	private static int BookIDCounter;
	private int CopyIDCounter;
	
	public Book(String name, String author, String content){
		this.name = name;
		this.author = author;
		this.content = content;
		ID = Book.generateBookId();
	}
	
	public String generateCopyId() {
		CopyIDCounter++;
		return "" + CopyIDCounter;
	}
	
	public String getName() {
		return name;
	}
	
	private static String generateBookId(){
		Book.BookIDCounter++;
		return "" + Book.BookIDCounter;
	}

}
