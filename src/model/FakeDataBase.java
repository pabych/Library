package model;

import java.util.ArrayList;

public class FakeDataBase {
	private ArrayList<User> users = new ArrayList<User>();;
	private ArrayList<Book> books = new ArrayList<Book>();
	
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
	
	
}
