import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	//System.out.println("Enter the string");
	String str = sc.nextLine();
	String newStr = "";

	StringTokenizer st = new StringTokenizer(str," ;");
    //System.out.println("The words in the string are");
	while(st.hasMoreTokens()) {
		newStr+=st.nextToken();
	}
	StringTokenizer st1 = new StringTokenizer(newStr," =");
	while(st1.hasMoreTokens()) {
		System.out.println(st1.nextToken());
	}
	}
}
