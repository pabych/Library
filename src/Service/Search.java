package Service;

import java.util.ArrayList;

import model.Comment;
import model.Book;

public class Search {
	public static ArrayList<Book> searchByTitle(String searchTitle, LibraryService ls){
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : ls.getFdb().getBooks()) {
			if(book.getTitle().contains(searchTitle)) {
				result.add(book);
			}
		}
			
		
		return result;		
	}
	
	public static ArrayList<Book> searchByAuthor(String searchAuthor, LibraryService ls){
		
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : ls.getFdb().getBooks()) {
			if(book.getAuthor().contains(searchAuthor)) {
				result.add(book);
			}
		}
			
		
		return result;		
	}

	public static ArrayList<Book> searchByRate(double searchRate, LibraryService ls) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : ls.getFdb().getBooks()) {
			double avarage = 0;
			for (Comment comment: book.getRating() ){
				avarage +=comment.getRate();
			}
			avarage = avarage/book.getRating().size(); 
			if(avarage >= searchRate){
				result.add(book);
			}
		}

		return result;
	}
}
