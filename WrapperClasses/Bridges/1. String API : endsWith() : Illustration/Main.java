import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.nextLine();
	System.out.println("Enter the end string");
	String endStr = sc.nextLine();
	
	if (str.endsWith(endStr)) {
		System.out.println("\""+str+"\" ends with \""+endStr+"\"");
	} else {
		System.out.println("\""+str+"\" does not end with \""+endStr+"\"");
	}
    
    
	}
}
