package main;


import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;





import Service.FakeLibraryService;
import Service.Search;
import Service.Rdr;
import model.Book;
import model.Comment;
import model.FakeDataBase;
import model.User;
import Service.LibraryService;
import Service.Search;
import Service.ConsoleInterface;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryService ls = new FakeLibraryService();	    
		ConsoleInterface.guest(ls);
	    
	    
	    
//	    Book book = ls.findBook("matan");
//		Comment comment1 = new Comment();
//		comment1.setComment("������� �����!");
//		comment1.setUser(user);
//		comment1.setRate(5.0);
//		ls.addComment(user, book, comment1);
//		
//		LibraryService ls = new FakeLibraryService();
//		
////		
//		FakeDataBase db = new FakeDataBase();
//		
//		createFakeUser(db);
//		createFakeBook(db);
//		
//		ArrayList<Book> resultTitle = Search.searchByTitle("���������", db);
//		ArrayList<Book> resultAuthor = Search.searchByAuthor("�����", db);
//		ArrayList<Book> resultRate = Search.searchByRate(8, db);
//		
//		System.out.println("���������� ������ �� ��������: " + resultTitle.toString());
//		System.out.println("���������� ������ �� ������: " + resultAuthor.toString());
//		System.out.println("���������� ������ �� ��������: " + resultRate.toString());
	}
	
	
//	
//	public static void createFakeUser(FakeDataBase users){
//		System.out.println("Create fake user");
//		
//		User user1 = new User("������", "���������", "pabych");
//		users.addUser(user1);
//		
//		User user2 = new User("����", "������", "olega228");
//		users.addUser(user2);
//		
//		User user3 = new User("��", "��������", "yan13rus");
//		users.addUser(user3);
//		
//		User user4 = new User("�����", "��������", "temur1337");
//		users.addUser(user4);
//	}
//	
//	public static void createFakeBook(FakeDataBase books){
//		System.out.println("Create fake book");
//		Book book1 = new Book("������������ � ���������", "�����������", 8.9);
////		book1.add();
//		books.addBook(book1);
//		
//		Book book2 = new Book("������ � ������", "��� �����", 7.6);
//		books.addBook(book2);
//		
//		Book book3 = new Book("��� �� �����", "��� �����", 8.7);
//		books.addBook(book3);
//		
//		Book book4 = new Book("������� ������� ����", "����� �����", 7.3);
//		books.addBook(book4);
//	}
//	
//	public static void createFakeComment() {
//		System.out.println("Create fake comment");
//		
//	}
}
