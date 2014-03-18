package main;


import java.util.ArrayList;
import java.util.Arrays;

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
		
		ArrayList<Book> resultTitle = Search.searchByTitle("наказание", db);
		ArrayList<Book> resultAuthor = Search.searchByAuthor("Браун", db);
		ArrayList<Book> resultRate = Search.searchByRate(8, db);
		
		System.out.println("результаты поиска по названию: " + resultTitle.toString());
		System.out.println("результаты поиска по автору: " + resultAuthor.toString());
		System.out.println("результаты поиска по рейтингу: " + resultRate.toString());
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
		Book book1 = new Book("Приключение и наказание", "Достоевский", 8.9);
		books.addBook(book1);
		
		Book book2 = new Book("Ангелы и демоны", "Дэн Браун", 7.6);
		books.addBook(book2);
		
		Book book3 = new Book("Код да Винчи", "Дэн Браун", 8.7);
		books.addBook(book3);
		
		Book book4 = new Book("Портрен Дориана Грей", "Оскар Уаилд", 7.3);
		books.addBook(book4);
	}
	

}
