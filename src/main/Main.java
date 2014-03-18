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
		
		ArrayList<Book> resultBook = Search.SearchByTitle("����������� � ���������", db);
		
	}
	
	public static void createFakeUser(FakeDataBase users){
		System.out.println("Create fake user");
		
		User user1 = new User("������", "���������");
		users.addUser(user1);
		
		User user2 = new User("����", "������");
		users.addUser(user2);
		
		User user3 = new User("��", "��������");
		users.addUser(user3);
		
		User user4 = new User("�����", "��������");
		users.addUser(user4);
	}
	
	public static void createFakeBook(FakeDataBase books){
		System.out.println("Create fake book");
		Book book1 = new Book("����������� � ���������", "�����������");
		books.addBook(book1);
		
		Book book2 = new Book("������ � ������", "��� �����");
		books.addBook(book2);
		
		Book book3 = new Book("��� �� �����", "��� �����");
		books.addBook(book3);
		
		Book book4 = new Book("������� ������� ����", "����� �����");
		books.addBook(book2);
	}
	

}
