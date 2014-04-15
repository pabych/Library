package Service;

import model.Book;
import model.Comment;
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
	
	
		
	
}
