package simulation;

import java.util.LinkedList;

import entities.*;
import library.*;

public class Test3 {

	public static void main(String[] args) {
	//Skapar 3 böcker
			Book b1 = new Book(
					"Harry Potter and the Sorcerer's Stone", 
					"J. K. Rowling", 
					"Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say that they were perfectly normal, thank you very much. They were the last people you'd expect to be involved in anything strange or mysterious, because they just didn't hold with such nonsense.");
			Book b2 = new Book(
					"Harry Potter and the Chamber of Secrets",
					"J. K. Rowling", 
					"At 4 Privet Drive, the Dursley family is arguing. Vernon Dursley bellows at his nephew Harry Potter because Harry's pet owl, Hedwig, is noisy. Dudley Dursley, Vernon's spoiled and obese son, clamors for more bacon. When Dudley demands the frying pan, Harry mutters, 'You've forgotten the magic word,' and the family erupts into chaos.");
			Book b3 = new Book(
					"Hamlet",
					"Wiliam Shakespeare",
					"ACT I SCENE I. Elsinore. A platform before the castle. FRANCISCO at his post. Enter to him BERNARDO BERNARDO Who's there? FRANCISCO Nay, answer me: stand, and unfold yourself. BERNARDO Long live the king! FRANCISCO Bernardo?");
			
	//Skapar 2 kopior av varje bok och lägger till dem i var sin lista
			LinkedList<CopyOfBook> list1 = new LinkedList<CopyOfBook>();
			LinkedList<CopyOfBook> list2 = new LinkedList<CopyOfBook>();
			LinkedList<CopyOfBook> list3 = new LinkedList<CopyOfBook>();
			for(int i = 0; i < 2; i++){
				list1.add(new CopyOfBook(b1));
				list1.add(new CopyOfBook(b2));
				list1.add(new CopyOfBook(b3));
				
				list2.add(new CopyOfBook(b1));
				list2.add(new CopyOfBook(b2));
				list2.add(new CopyOfBook(b3));

				list3.add(new CopyOfBook(b1));
				list3.add(new CopyOfBook(b2));
				list3.add(new CopyOfBook(b3));
			}
			
		
	//Skapar det nationella lagret för böcker
			NationalStorage n = new NationalStorage(list1);
			
	//Skapar två bibliotek		
			Library l1 = new Library("Lund", list2, n);
			Library l2 = new Library("Malmo", list3, n);
			
	//Skapar 4 personer
			Person p1 = new Person("Pelle");
			Person p2 = new Person("Olof");
			Person p3 = new Person("Kajsa");
			Person p4 = new Person("Knut");

		
//------------------------------------START-----------------------------------------------
//simulera att alla fyra lånar från Lund	
//------------------------------------SLUT-----------------------------------------------
		}

}
