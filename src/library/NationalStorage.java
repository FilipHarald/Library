package library;

import java.util.LinkedList;

import entities.CopyOfBook;

public class NationalStorage {
	private LinkedList<CopyOfBook> availableCopies;
	
	public NationalStorage(LinkedList<CopyOfBook> availableBooks){
		this.availableCopies = availableBooks;
	}
	
	public int getNbrOfAvailableCopies(){
		return availableCopies.size();
	}
	
	public boolean hasACopyOfBook(String nameOfBook){
		for(CopyOfBook copy : availableCopies){
			if(copy.getOriginalName().equals(nameOfBook)){
				return true;
			}
		}
		return false;
	}
	
	public CopyOfBook deliverCopy(String nameOfBook){
		CopyOfBook copyToDeliver = null;
		for(CopyOfBook c : availableCopies){
			if(c.getOriginalName().equals(nameOfBook)){
				copyToDeliver = c;
				break;
			}
		}
		try {
			//Det tar ett tag att leverera boken till biblioteket
			System.out.println("Boken håller nu på att levereras till biblioteket.");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return copyToDeliver;
	}
}
