package main;


import java.util.ArrayList;

import Service.Search;
import model.Book;
import model.FakeDataBase;
import model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FakeDataBase db = new FakeDataBase();
		
		createFakeUser(db);
		createFakeBook(db);
		
		ArrayList<Book> resultBook = Search.SearchByTitle("Приключение и наказание", db);
		
	}
	
	public static void createFakeUser(FakeDataBase users){
		System.out.println("Create fake user");
		
		User user1 = new User("Андрей", "Лисовский");
		users.addUser(user1);
		
		User user2 = new User("Олег", "Шмыгер");
		users.addUser(user2);
		
		User user3 = new User("Ян", "Жамойтин");
		users.addUser(user3);
		
		User user4 = new User("Темур", "Абдулаев");
		users.addUser(user4);
	}
	
	public static void createFakeBook(FakeDataBase books){
		System.out.println("Create fake book");
		Book book1 = new Book("Приключение и наказание", "Достоевский");
		books.addBook(book1);
		
		Book book2 = new Book("Ангелы и демоны", "Дэн Браун");
		books.addBook(book2);
		
		Book book3 = new Book("Код да Винчи", "Дэн Браун");
		books.addBook(book3);
		
		Book book4 = new Book("Портрен Дориана Грей", "Оскар Уаилд");
		books.addBook(book2);
	}
	

}
