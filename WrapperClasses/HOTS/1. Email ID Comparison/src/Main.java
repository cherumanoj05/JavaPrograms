import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter First Customer Details :\n"+ "Enter Customer Name :");
    	String name1 = sc.nextLine();
    	System.out.println("Enter Customer Email :");
    	String email1 = sc.nextLine();	
    	Customer cst1 = new Customer(name1,email1);
    	
    	System.out.println("Enter Second Customer Details :\n"+ "Enter Customer Name :");
    	String name2 = sc.nextLine();
    	System.out.println("Enter Customer Email :");
    	String email2 = sc.nextLine();	
    	Customer cst2 = new Customer(name2,email2);
    	sc.close();
    	
    	if (cst1.getEmail().equals(cst2.getEmail())) {
    		System.out.println("The Email ids of "+cst1.getName()+" and "+cst2.getName()+" are equal");
    	} else {
    		System.out.println("The Email ids of "+cst1.getName()+" and "+cst2.getName()+" are not equal");
    	}
    	
    	System.out.println("Comparing without considering the cases :");
    	if (cst1.getEmail().equalsIgnoreCase(cst2.getEmail())) {
    		System.out.println("The Email ids of "+cst1.getName()+" and "+cst2.getName()+" are Equal");
    	} else {
    		System.out.println("The Email ids of "+cst1.getName()+" and "+cst2.getName()+" are not equal");
    	}
	}
}