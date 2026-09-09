package comm.oop.exceptions;
import java.util.*;
public class CharacterFinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "Manikantha";
		try {
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			System.out.println("Letter: "+name.charAt(n-1));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
