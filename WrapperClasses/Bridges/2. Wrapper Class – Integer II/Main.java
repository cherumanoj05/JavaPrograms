import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	String bString, oString, hString;
	System.out.println("Enter the binary number");	
	bString = sc.nextLine();
	int binary  = Integer.parseInt(bString,2);
	System.out.println("Enter the octal number");
	oString = sc.nextLine();
	int octal = Integer.parseInt(oString,8);
	System.out.println("Enter the hexadecimal number");
	hString = sc.nextLine();
	int hexa = Integer.parseInt(hString,16);
	
	System.out.println("The integer value of the binary number "+bString+" is "+binary);
	System.out.println("The integer value of the octal number "+oString+" is "+octal);
	System.out.println("The integer value of the hexadecimal number "+hString+" is "+hexa);


	}
}
