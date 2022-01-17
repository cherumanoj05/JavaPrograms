import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
	int dayInc = Integer.parseInt(sc.nextLine());
	int day = Integer.rotateRight(dayInc, 2);
	int monthInc = Integer.parseInt(sc.nextLine());
	int month = Integer.rotateRight(monthInc, 2);
	int yearInc = Integer.parseInt(sc.nextLine());
	int year = Integer.rotateRight(yearInc, 2);
	
	System.out.println(year+"/"+month+"/"+day);


	}
}
