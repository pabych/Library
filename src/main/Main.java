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
		
		ArrayList<Book> resultTitle = Search.searchByTitle("���������", db);
		ArrayList<Book> resultAuthor = Search.searchByAuthor("�����", db);
		ArrayList<Book> resultRate = Search.searchByRate(8, db);
		
		System.out.println("���������� ������ �� ��������: " + resultTitle.toString());
		System.out.println("���������� ������ �� ������: " + resultAuthor.toString());
		System.out.println("���������� ������ �� ��������: " + resultRate.toString());
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
		Book book1 = new Book("����������� � ���������", "�����������", 8.9);
		books.addBook(book1);
		
		Book book2 = new Book("������ � ������", "��� �����", 7.6);
		books.addBook(book2);
		
		Book book3 = new Book("��� �� �����", "��� �����", 8.7);
		books.addBook(book3);
		
		Book book4 = new Book("������� ������� ����", "����� �����", 7.3);
		books.addBook(book4);
	}
	

}
