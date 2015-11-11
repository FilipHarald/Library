package entities;

public class CopyOfBook {
	private String ID;
	private Book original;
	
	public CopyOfBook(Book bookToMakeCopyOf){
		original = bookToMakeCopyOf;
		ID = original.generateCopyId();
	}
	
	public String getOriginalName() {
		return original.getName();
	}
	
	public String getId(){
		return ID;
	}

}
