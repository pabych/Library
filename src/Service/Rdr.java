package Service;

import java.util.Scanner;

public class Rdr {
	static Scanner in = new Scanner(System.in);
	public static String readStr(){
	    String a = in.next();
	    return a;
	}
	
	public static double readDbl(){
	    double b = in.nextDouble();
	    return b;
	}
	
	public static int readInt(){
	    int c = in.nextInt();
	    return c;
	}
}
