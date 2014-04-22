package Service;

import model.Book;
import model.Comment;
import model.FakeDataBase;
import model.User;

public interface LibraryService {
	public void addUser(User user);
	public void addBook(Book book);
	public void addComment(User user, Book book, Comment comment);
	public User findUser(String name);
	public Book findBook(String title);
	public FakeDataBase getFdb();
	public void addToOrders(User user, Book book);
	public void addToBookmarks(User user, Book book);
}
