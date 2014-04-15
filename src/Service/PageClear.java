package Service;

public class PageClear {
	private static final int PAGE_SIZE = 100;

	public static void clearScreen() {
	    for (int i = 0; i < PAGE_SIZE; i++) {
	        System.out.println();
	    }
	}
}
