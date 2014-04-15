package Service;

import Service.Rdr;
import model.User;


public class Registration {

	public void registration(LibraryService ls){
		PageClear.clearScreen();		
		
		System.out.println("Enter your name: ");
		String name = Rdr.readStr();
		System.out.println("Enter your lastname: ");
		String lastname = Rdr.readStr();
		System.out.println("Enter your nickname: ");
		String nickname = Rdr.readStr();
		User user = new User(name, lastname, nickname);
		ls.addUser(user);
	    
	}
	
}
