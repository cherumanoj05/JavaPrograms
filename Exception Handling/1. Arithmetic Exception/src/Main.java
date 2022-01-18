import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the item for n days");
        int a = sc.nextInt();
        System.out.println("Enter the value of n");
        int b = sc.nextInt();
        
        try {
            int c = a/b;
            System.out.println("Cost per day of the item is "+c);
        
        } catch(ArithmeticException aExcp){
            System.out.println("java.lang.ArithmeticException: "+aExcp.getMessage());
        }

	}

}
