package comm.oop.exceptions;
import java.util.*;
public class NumberConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number: ");
			String num=sc.nextLine();
			int number = Integer.parseInt(num);
			int square = number *number;
			System.out.println("Number : "+number);
			System.out.println("Square: "+square);
			
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		// TODO Auto-generated method stub

	}

}
