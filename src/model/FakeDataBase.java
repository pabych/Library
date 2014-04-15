package model;

import java.util.ArrayList;

public class FakeDataBase {
	
	 public FakeDataBase() {
		 User user1 = new User("Андрей", "Лисовский", "pabych");
		 addUser(user1);
			
		 User user2 = new User("Олег", "Шмыгер", "olega228");
		 addUser(user2);
			
		 User user3 = new User("Ян", "Жамойтин", "yan13rus");
		 addUser(user3);
			
		 User user4 = new User("Темур", "Абдулаев", "temur1337");
		 addUser(user4);
	 }
	
	
	
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
