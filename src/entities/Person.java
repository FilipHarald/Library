package entities;

import java.util.LinkedList;

public class Person {
	private String name;
	private LinkedList<CopyOfBook> borrowedCopies;
	
	public Person(String name){
		this.name = name;
		borrowedCopies = new LinkedList<CopyOfBook>();
	}
	
	public boolean borrowCopy(CopyOfBook copy){
		return borrowedCopies.add(copy);
	}
	
	public CopyOfBook returnFirstBook(){
		return borrowedCopies.removeFirst();
	}
	
	public int getNbrOfBorrowedCopies(){
		return borrowedCopies.size();
	}
}
