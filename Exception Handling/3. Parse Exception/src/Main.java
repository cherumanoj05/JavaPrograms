import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		String pattern = "dd-MM-yyyy-HH:mm:ss";
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formatter = new SimpleDateFormat(pattern);

		System.out.println("Enter the stage event start date and end date");
		
		
		try {
			Date startDate = formatter.parse(sc.nextLine());
			Date endDate = formatter.parse(sc.nextLine());
			
			String startDate1 = formatter.format(startDate);
			String endDate1 = formatter.format(endDate);
			
			System.out.println("Start date:"+startDate1);
			System.out.println("End date:"+endDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
		}
		
	}

}
