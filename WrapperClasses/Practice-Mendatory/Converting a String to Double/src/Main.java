import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws IOException{
    	InputStreamReader r = new InputStreamReader(System.in);
    	BufferedReader bf = new BufferedReader(r);
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	
    	try {
    		System.out.println("Enter the issue date as dd/MM/yyyy");
        	String issueS = bf.readLine();
        	Date issue = sdf.parse(issueS);
        	
        	System.out.println("Enter the due date as dd/MM/yyyy");
        	Date due = sdf.parse(bf.readLine());
//        	System.out.println(issue+"    "+due);
        	System.out.println("Enter the original amount");
        	double original = Double.parseDouble(bf.readLine());
        	System.out.println("Enter amount paid so far");
        	double paidAmt = Double.parseDouble(bf.readLine());
        	double amtOut = original-paidAmt;
        	
        	
        	BillHeader bh = new BillHeader();
        	bh.setIssueDate(issue);
        	bh.setDueDate(due);
        	bh.setOriginalAmount(original);
        	bh.setAmountOutstanding(amtOut);
        	System.out.println(bh.toString());
    	}catch(ParseException e) {
    		System.out.println(e);
    	}
    	
    	
    	
    }
}
