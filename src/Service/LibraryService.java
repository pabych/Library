package Service;

import model.Book;
import model.Comment;
import model.User;

public interface LibraryService {
	public void addUser(User user);
	public void addBook(Book book);
	public void addComment(User user, Book book, Comment comment);
	public User findUser(String name);
	public Book findBook(String title);
}
