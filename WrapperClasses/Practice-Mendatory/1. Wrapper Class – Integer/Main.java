import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		byte b = (byte) num;
		short s = (short) num;
		double d = (double) num;
		float f = (float) num;
		long l = (long) num;
		//float d = (float) num;
		
		System.out.println("The binary equivalent of "+num+" is "+Integer.toBinaryString(num));
		System.out.println("The hexadecimal equivalent of "+num+" is "+ Integer.toHexString(num));
		System.out.println("The octal equivalent of "+ num +" is "+ Integer.toOctalString(num));
		System.out.println("Byte value of "+num+" is "+ b);
		
		System.out.println("Short value of "+num+" is "+s);
		System.out.println("Long value of "+num+" is "+l);
		System.out.println("Float value of "+num+" is "+f);
		System.out.println("Double value of "+num+" is "+d);		
	}
}
