import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.nextLine();
	
	String strArr[] = str.split(" ");
	System.out.println("The words in the string are");
	for (String s:strArr) {
		System.out.println(s);
	}
	}
}
