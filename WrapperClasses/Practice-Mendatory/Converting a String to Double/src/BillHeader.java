import java.text.SimpleDateFormat;
import java.util.*;
public class BillHeader {
	private Date	issueDate;
	private Date	dueDate;
	private double	originalAmount;
	private double	amountOutstanding;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	sdf.format(issueDate);
	
//	BillHeader(Date issueDate,Date dueDate,double originalAmount,double amountOutstanding){
//		this.issueDate = issueDate;
//		this.dueDate = dueDate;
//		this.originalAmount = originalAmount;
//		this.amountOutstanding = amountOutstanding;
//	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public double getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(double originalAmount) {
		this.originalAmount = originalAmount;
	}
	public double getAmountOutstanding() {
		return amountOutstanding;
	}
	public void setAmountOutstanding(double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}
	
	
	public String toString() {
		return "Issue date: "+sdf.format(issueDate) +"\n"
				+ "Due Date: "+ sdf.format(dueDate)+"\n"
				+ "Original amount Rs."+originalAmount+"\n"
				+ "Amount outstanding Rs."+amountOutstanding;
	}
	
	
	
}