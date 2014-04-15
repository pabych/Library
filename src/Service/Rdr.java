package Service;

import java.util.Scanner;

public class Rdr {
	static Scanner in = new Scanner(System.in);
	public static String readStr(){
	    String a = in.next();
	    return a;
	}
	
	public static double readDbl(){
	    double a = in.nextDouble();
	    return a;
	}
	
	public static double readInt(){
	    int a = in.nextInt();
	    return a;
	}
}
