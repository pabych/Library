package Service;

import java.util.ArrayList;


import model.Book;
import model.Comment;
import model.User;



public class ConsoleInterface {
	
	public static User user;
	public static User guest(LibraryService ls){
		
//		boolean login;
		for( ; ; ){
			ConsoleStars.consoleText("Library", 50);
			ConsoleStars.consoleText("Welcome Guest", 50);
			
			System.out.print("Enter your nickname please: ");
			String nickname = Rdr.readStr();
			System.out.println(nickname);
			
			user = ls.findUser(nickname);
			
			if(user != null){
				System.out.println("Login success");
				loginSuccess(ls);
			}
			else {
				System.out.println("Login fail");
				loginFail(ls);
			}		
		}
	}
	
	public static void loginFail(LibraryService ls){
		
		ConsoleStars.consoleText("User does not exist", 50);
		
		String a;
		System.out.println("1. Register");
		System.out.println("2. Return");
		System.out.println("3. Exit");
		
		a = Rdr.readStr();
		switch(a){
		case "1":
			registration(ls);
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
	
	public static void loginSuccess(LibraryService ls){
		ConsoleStars.consoleText("Library", 50);
		ConsoleStars.consoleText("*", 50);
		ConsoleStars.consoleText("Welcome, " + user.getName(), 50);
		
		String a;
		System.out.println("1. Find book");
		System.out.println("2. Profile");
		System.out.println("3. Logout");
		
		a=Rdr.readStr();
		switch(a){
		case "1":
			ConsoleStars.consoleText("Find book", 50);
			findBook(ls);
			break;
		case "2":
			ConsoleStars.consoleText("Profile", 50);
			profile(ls);
			break;
		case "3":
			ConsoleStars.consoleText("Logout", 50);
			user = null;
			break;
				
		default:break;
		}
		
		
	}
	
	public static void registration(LibraryService ls){
		
		System.out.println("Enter your name: ");
		String name = Rdr.readStr();
		System.out.println("Enter your lastname: ");
		String lastname = Rdr.readStr();
		System.out.println("Enter your nickname: ");
		String nickname = Rdr.readStr();
		User user = new User(name, lastname, nickname);
		ls.addUser(user);
	    
	}
	
public static void findBook(LibraryService ls){
			ConsoleStars.consoleText("Library", 50);
			ConsoleStars.consoleText("*", 50);
			
			String a;
			System.out.println("1. Search by Author");
			System.out.println("2. Search by Title");
			System.out.println("3. Search by Rating");
			System.out.println("4. Return");
			
			a=Rdr.readStr();
			switch(a){
			case "1":
				System.out.print("Enter auhtor name: ");
				String bookAuthor = Rdr.readStr();
				ArrayList<Book> resultAuthor = Search.searchByAuthor(bookAuthor, ls);
				System.out.println(resultAuthor.toString());
				for( int i=0;i<resultAuthor.size();i++ ){
					
					Book asd;
					asd = resultAuthor.get(i);
					System.out.println(i+1 + ". " + asd.toString());
				}
				System.out.println("0. return");
				int j = Rdr.readInt();
				if(j==0) break;
				else selectBook(resultAuthor.get(j-1));
			    
				break;
			case "2":
				System.out.print("Enter book title: ");
				String bookTitle= Rdr.readStr();
				ArrayList<Book> resultTitle = Search.searchByTitle(bookTitle, ls);
				System.out.println(resultTitle.toString());
				
				for( int i=0;i<resultTitle.size();i++ ){
					
					Book asd;
					asd = resultTitle.get(i);
					System.out.println(i+1 + ". " + asd.toString());
				}
				System.out.println("0. return");
				j = Rdr.readInt();
				if(j==0) break;
				else {
					selectBook(resultTitle.get(j-1));
				}
				break;
			case "3":
				System.out.print("Enter rate you want: ");
				double bookRate = Rdr.readDbl();
				ArrayList<Book> resultRate = Search.searchByRate(bookRate, ls);
				System.out.println(resultRate.toString());
				
				for( int i=0;i<resultRate.size();i++ ){
					
					Book asd;
					asd = resultRate.get(i);
					System.out.println(i+1 + ". " + asd.toString());
				}
				System.out.println("0. return");
				j = Rdr.readInt();
				if(j==0) break;
				else selectBook(resultRate.get(j-1));
				break;
			case "4":
				ConsoleStars.consoleText("Return", 50);
				break;
					
			default:break;
			}
		
	}

	public static void selectBook(Book book){
		ConsoleStars.consoleText(book.toString(), 50);
		ConsoleStars.consoleText("*", 50);
		
		FakeLibraryService ls = new FakeLibraryService();
		String a;
		System.out.println("1. Order");
		System.out.println("2. Add to bookmarks");
		System.out.println("3. Comment");
		System.out.println("4. Return");
		
		a=Rdr.readStr();
		switch(a){
		case "1":
			ls.addToOrders(user, book);						
			break;
		case "2":
			ls.addToBookmarks(user, book);
			break;
		case "3":
			System.out.println("Enter comment: ");
			String commentText = Rdr.readStr();
			System.out.print("Enter rate: ");
			int rate = Rdr.readInt();
			
			Comment comment = new Comment(rate, commentText, user);
			ls.addComment(user, book, comment);
			break;
		case "4":
			ConsoleStars.consoleText("Return", 50);
			break;
				
		default:break;
		}
	}
	
	
	public static void profile(LibraryService ls){
		ConsoleStars.consoleText("Library", 50);
		ConsoleStars.consoleText("*", 50);
		
		String a;
		System.out.println("1. My bookmarks");
		System.out.println("2. My books");
		System.out.println("3. Return");
		
		a=Rdr.readStr();
		switch(a){
		case "1":
			System.out.println(user.getBookmark().toString());
			
			break;
		case "2":
			System.out.println(user.getOrders().toString());
			break;
		case "3":
			ConsoleStars.consoleText("Return", 50);
			break;
				
		default:break;
		}
	}
}


