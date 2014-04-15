package Service;

import model.User;

public class Login {

	public static void loginFail(LibraryService ls){
		PageClear.clearScreen();
		ConsoleStars.consoleText("User does not exist", 50);
		
		String a;
		System.out.println("1. Register");
		System.out.println("2. Return");
		System.out.println("3. Exit");
		
		a = Rdr.readStr();
		switch(a){
		case "1":
			ConsoleStars.consoleText("Registration...", 50);
			Registration reg = new Registration();
			reg.registration(ls);
			break;
		case "2":
			ConsoleStars.consoleText("return", 50);
			break;
		case "3":
			ConsoleStars.consoleText("Googbye", 50);
			System.exit(0);
		default:break;
		}
		
	}
	
	public static void loginSuccess(LibraryService ls, User user){
		PageClear.clearScreen();
		ConsoleStars.consoleText("Library", 50);
		ConsoleStars.consoleText("*", 50);
		ConsoleStars.consoleText("Welcome, " + user.getName(), 50);
		
		String a;
		System.out.println("1. Register");
		System.out.println("2. Logout");
		System.out.println("3. Exit");
		
		a=Rdr.readStr();
		switch(a){
		case "1":
			ConsoleStars.consoleText("Registration...", 50);
			Registration reg = new Registration();
			reg.registration(ls);
			break;
		case "2":
			ConsoleStars.consoleText("Logout", 50);
			break;
		case "3":
			ConsoleStars.consoleText("Googbye", 50);
			System.exit(0);
		default:break;
		}
		
		
	}
	
}
