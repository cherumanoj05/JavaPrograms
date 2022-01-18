import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[100];
		System.out.println("Enter the number of seats to be booked:");
		int N = Integer.parseInt(sc.nextLine());
		
		int seatArr[]= new int[N];
		try {
			for (int i = 1;i<=N;i++) {
				System.out.println("Enter the seat number "+i);
				int seatNo = sc.nextInt();
				arr[seatNo-1]= seatNo;
				seatArr[i-1] = seatNo;
				
			}
			System.out.println("The seats booked are:");
			for (int i:seatArr) {
				System.out.println(i);
			}
			
		} catch(ArrayIndexOutOfBoundsException arrExcp) {
			System.out.println(arrExcp);
		}
		
		
	}
}
