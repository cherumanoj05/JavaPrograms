import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int rows;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns of the show:");
		rows = Integer.parseInt(sc.nextLine());
		
		int seatArray[] = new int[rows*rows];
//		System.out.println(seatArray.length);
		System.out.println("Enter the number of seats to be booked:");
		int seatsToBeBooked = Integer.parseInt(sc.nextLine());
		
		try {
			for (int i = 1;i <= seatsToBeBooked;i++) {
				System.out.println("Enter the seat number "+i);
				int seat = Integer.parseInt(sc.nextLine());//seat number... if seatno
				if(seatArray[seat]==1) {
					throw new SeatNotAvailableException("SeatNotAvailableException: Already Booked");
				}
				else {
					seatArray[seat]= 1;
				}				
			}
		}
		catch(IndexOutOfBoundsException arrExcp) {
			System.out.println(arrExcp);
		}
		catch(SeatNotAvailableException noSeat) {
			
			System.out.println(noSeat.getMessage());
		}
		System.out.println("The seats booked are:");
		for(int i = 0;i<rows;i++) {
			for (int j = (rows *i);j<(rows*(i+1));j++) {
				System.out.print(seatArray[j]+" ");
			}
			System.out.println();
		}
		
	}
}
