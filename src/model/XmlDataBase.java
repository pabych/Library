package model;

import java.util.ArrayList;

public class XmlDataBase {
	public XmlDataBase() {
		 		 
	}
	
	
	
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Comment> comments = new ArrayList<Comment>();
	private ArrayList<Bookmark> bookmarks = new ArrayList<Bookmark>();
//	private ArrayList<Order> Orders= new ArrayList<Order>();
	
	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void addBook(Book book){
		this.books.add(book);
	}
	
	public void addUser(User user){
		this.users.add(user);
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	public void addComment(Comment comment){
		this.comments.add(comment);
	}
	
	
	public void addBookmark(Bookmark bookmark){
		this.bookmarks.add(bookmark);
	}

}
