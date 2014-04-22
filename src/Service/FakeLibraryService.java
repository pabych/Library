package Service;

import java.util.Calendar;

import model.Book;
import model.Bookmark;
import model.Comment;
import model.Order;
import model.User;
import model.FakeDataBase;


public class FakeLibraryService implements LibraryService {
	private FakeDataBase fdb;
	public FakeLibraryService(){
		fdb = new FakeDataBase();
	}
	@Override
	public void addComment(User user, Book book, Comment comment) {
		// TODO Auto-generated method stub
		for (Book book1: fdb.getBooks()){
			if(book1 == book){
				book1.addComment(comment);
				break;
			}
		}
			
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		fdb.addUser(user);
	}
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		fdb.addBook(book);
	}
	@Override
	public User findUser(String nickname) {
		// TODO Auto-generated method stub
		for(User user: fdb.getUsers()){
			if(user.getNickname().equals(nickname)){
				return user;
			}
		}
		return null;
	}
	@Override
	public Book findBook(String title) {
		// TODO Auto-generated method stub
		for(Book book: fdb.getBooks()){
			if(book.getTitle().equals(title)){
				return book;
			}
		}
		return null;
	}
	public FakeDataBase getFdb() {
		return fdb;
	}
	public void setFdb(FakeDataBase fdb) {
		this.fdb = fdb;
	}
	@Override
	public void addToOrders(User user, Book book) {
		// TODO Auto-generated method stub
		Calendar date = Calendar.getInstance();
		Calendar dateTo = Calendar.getInstance();
		dateTo.add(Calendar.DAY_OF_YEAR, 30); 
		
		Order thisOrder = new Order(date, dateTo, book);
		user.getOrders().add(thisOrder); 
		
		
		System.out.println("Adding to Orders - " + book.toString() + " - succes!");
		
	}
	@Override
	public void addToBookmarks(User user, Book book) {
		// TODO Auto-generated method stub
		String mark = Rdr.readStr();
		Bookmark bookmark = new Bookmark(book, mark);
		user.getBookmark().add(bookmark);
		System.out.println("Adding bookmark - " + book.toString() + " - succes!");
	}
	
	
		
	
}
