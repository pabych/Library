package Service;

import java.util.Calendar;

import model.Book;
import model.Bookmark;
import model.Comment;
import model.Order;
import model.User;
import model.FakeDataBase;
import model.XmlDataBase;

public class XmlLibraryService implements LibraryService {
	private XmlDataBase xdb;
	public XmlLibraryService(){
		xdb = new XmlDataBase();
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
		xdb.addUser(user);
	}
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		xdb.addBook(book);
	}
	@Override
	public User findUser(String nickname) {
		// TODO Auto-generated method stub
		for(User user: xdb.getUsers()){
			if(user.getNickname().equals(nickname)){
				return user;
			}
		}
		return null;
	}
	@Override
	public Book findBook(String title) {
		// TODO Auto-generated method stub
		for(Book book: xdb.getBooks()){
			if(book.getTitle().equals(title)){
				return book;
			}
		}
		return null;
	}
	public XmlDataBase getXdb() {
		return xdb;
	}
	public void setXdb(XmlDataBase xdb) {
		this.xdb = xdb;
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
		
		for(User user: xdb.getUsers()){
			if(user.getId() == id){
				return user;
			}
		}
		return null;
	}
	@Override
	public Book findBookById(int id) {
		// TODO Auto-generated method stub
		for(Book book: xdb.getBooks()){
			if(book.getId() == id){
				return book;
			}
		}
		return null;
	}
	@Override
	public FakeDataBase getFdb() {
		// TODO Auto-generated method stub
		return null;
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
	

}
