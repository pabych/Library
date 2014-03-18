package Service;

import java.util.ArrayList;

import model.Book;
import model.FakeDataBase;

public class Search {
	public static ArrayList<Book> searchByTitle(String searchTitle, FakeDataBase fakeDataBase){
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDataBase.getBooks()) {
			if(book.getTitle().contains(searchTitle)) {
				result.add(book);
			}
		}
			
		
		return result;		
	}
	
	public static ArrayList<Book> searchByAuthor(String searchAuthor, FakeDataBase fakeDataBase){
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDataBase.getBooks()) {
			if(book.getAuthor().contains(searchAuthor)) {
				result.add(book);
			}
		}
			
		
		return result;		
	}

	public static ArrayList<Book> searchByRate(double searchRate, FakeDataBase fakeDataBase) {
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : fakeDataBase.getBooks()) {
			if(book.getRate() >= searchRate) {
				result.add(book);
			}
		}
			
		
		return result;
	}
}
