package library;

import java.util.LinkedList;

import entities.*;

public class Library {
	private LinkedList<CopyOfBook> availableCopies;
	private String name;
	private NationalStorage nS;
	
	public Library(String name, LinkedList<CopyOfBook> availableBooks, NationalStorage nS){
		this.name = name;
		this.availableCopies = availableBooks;
		this.nS = nS;
	}
	
	public int getNbrOfAvailableCopies(){
		return availableCopies.size();
	}
	
	public void borrowBook(Person p, Book b){
		CopyOfBook copy = getCopyOfBook(b);
		p.borrowCopy(copy);
	}
	
	public void returnFirstBook(Person p){
		availableCopies.add(p.returnFirstBook());
	}

	private CopyOfBook getCopyOfBook(Book b) {
		CopyOfBook copy = null;
		for(CopyOfBook c : availableCopies){
			if(c.getOriginalName().equals(b.getName())){
				int index = availableCopies.indexOf(c);
				copy = availableCopies.get(index);
				availableCopies.remove(index);
				return copy;
			}
		}
		if(copy == null){
			if(nS.hasACopyOfBook(b.getName())==true){
				copy = nS.deliverCopy(b.getName());
			}
		}
		return copy;
	}
}
