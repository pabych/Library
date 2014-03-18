package Service;

import java.util.ArrayList;

import model.Book;
import model.FakeDataBase;

public class Search {
	public static ArrayList<Book> SearchByTitle(String searchTitle, FakeDataBase fakeDataBase){
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDataBase.getBooks()) {
			if(book.getTitle() .equals(searchTitle)) {
				result.add(book);
			}
		}
			
		
		return result;		
	}
}
