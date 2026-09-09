package comm.oop.exceptions;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of a: ");
			int a = sc.nextInt();
			System.out.println("Enter the number of b: ");
			int b = sc.nextInt();
			System.out.println(a/b);
		}catch( ArithmeticException e) {
			System.out.println(" ArithmeticException");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
	}
}
