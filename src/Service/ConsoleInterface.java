package Service;


import model.User;
import Service.Rdr;
import Service.ConsoleStars;
import Service.PageClear;

public class ConsoleInterface {
	
	public static void guest(LibraryService ls){
		for( ; ; ){
			PageClear.clearScreen();
			ConsoleStars.consoleText("Library", 50);
			ConsoleStars.consoleText("*", 50);
			ConsoleStars.consoleText("Welcome Guest", 50);
			
			System.out.print("Enter your nickname please: ");
			String nickname = Rdr.readStr();
			System.out.println(nickname);
			
			User user = ls.findUser(nickname);
			if(user == null){
				System.out.println("fail");
				Login.loginFail(ls);
			}
			else {
				System.out.println("Login success");
				Login.loginSuccess(ls, user);
			}
		}
	}
	
//	
//	public static void loginFail(){
//		consoleText("User does not exist", 50);
//		
//		String a;
//		System.out.println("1. Register");
//		System.out.println("2. Return");
//		System.out.println("3. Exit");
//		
//		a=Rdr.readStr();
//		switch(a){
//		case "1":
//			consoleText("Registration...", 50);
//			registration();
//			break;
//		case "2":
//			consoleText("return", 50);
//			break;
//		case "3":
//			consoleText("Googbye", 50);
//			break;
//		default:break;
//		}
//		
//	}
//	
//	
//	public static void loginSuccess(){
//		consoleText("Library", 50);
//		consoleText("*", 50);
//		consoleText("Welcome not guest", 50);
//	}
//	
//	
//	public static void registration(){
//		System.out.println("Enter your name: ");
//		String name = rdr.readStr();
//		System.out.println("Enter your lastname: ");
//		String lastname = rdr.readStr();
//		System.out.println("Enter your nickname: ");
//		String nickname = rdr.readStr();
//		User user = new User(name, lastname, nickname);
//		ls.addUser(user);
//	    
//	}
//	
//	
//	
//	private static void consoleText(String text, int count){
//		for(int i=0;i<count-text.length()/2;i++)
//			System.out.print("*");
//		System.out.print(text);
//		for(int i=0;i<count+1-text.length()/2;i++)
//			System.out.print("*");
//		System.out.println("");
//	}
}
