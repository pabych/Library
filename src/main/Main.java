package main;

import model.User;
import Service.FakeLibraryService;
import Service.LibraryService;
import Service.ConsoleInterface;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryService ls = new FakeLibraryService();
		
		ConsoleInterface.guest(ls);
	}
}
