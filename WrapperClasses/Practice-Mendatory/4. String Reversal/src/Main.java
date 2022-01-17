import java.util.*;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		String string = sc.nextLine();
		String reverse = "";
		for(int i = string.length()-1;i >=0;i--) {
			char c = string.charAt(i);
			reverse+=c;
		}
		System.out.println("Reverse of the string is "+reverse);
	}
}