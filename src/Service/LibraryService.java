package Service;

import java.util.Calendar;

import model.Book;
import model.FakeDataBase;
import model.User;
import model.XmlDataBase;

public interface LibraryService {
	public void addUser(User user);
	public void addBook(Book book);
	public void addComment(User user, Book book, String comment, double rate);
	public User findUser(String name);
	public Book findBook(String title);
	public User findUserById(int id);
	public Book findBookById(int id);
	public FakeDataBase getFdb();
	public XmlDataBase getXdb();
	public void addToOrders(User user, Book book, Calendar startDate, Calendar endDate);
	public void addToOrders(User user, Book book);
	public void addToBookmarks(User user, Book book);
}

