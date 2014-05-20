package Service;


import java.util.Calendar;

import model.Book;
import model.Bookmark;
import model.Comment;
import model.Order;
import model.User;
import model.FakeDataBase;
import model.XmlDataBase;


public class FakeLibraryService implements LibraryService {
	private FakeDataBase fdb;
	public FakeLibraryService(){
		fdb = new FakeDataBase();
	}
	@Override
	public void addComment(User user, Book book, String comment, double rate) {
		// TODO Auto-generated method stub
		Comment mComment = new Comment(rate, comment, user);
		book.getRating().add(mComment);
		System.out.println("adding comment success");
			
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
	public void addToOrders(User user, Book book, Calendar startDate, Calendar endDate) {
		// TODO Auto-generated method stub
		Order thisOrder = new Order(book);
		thisOrder.setStartDate(startDate);
		thisOrder.setEndDate(endDate);
		user.getOrders().add(thisOrder);
	}
	@Override
	public void addToOrders(User user, Book book) {
		// TODO Auto-generated method stub
		Order thisOrder = new Order(book);
		user.getOrders().add(thisOrder);
	}
	@Override
	public void addToBookmarks(User user, Book book) {
		// TODO Auto-generated method stub
		Bookmark bookmark = new Bookmark(book);
		user.getBookmark().add(bookmark);
		System.out.println("Adding bookmark - " + book.toString() + " - succes!");
	}
	
	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		
		for(User user: fdb.getUsers()){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	@Override
	public Book findBookById(int id) {
		// TODO Auto-generated method stub
		for(Book book: fdb.getBooks()){
			if(book.getId() == id){
				return book;
			}
		}
		return null;
	}
	@Override
	public XmlDataBase getXdb() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	
}
