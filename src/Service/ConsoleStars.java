package Service;

public class ConsoleStars {
	public static void consoleText(String text, int count){
		for(int i=0;i<count-text.length()/2;i++)
			System.out.print("*");
		System.out.print(text);
		for(int i=0;i<count+1-text.length()/2;i++)
			System.out.print("*");
		System.out.println("");
	}
	
	
}
