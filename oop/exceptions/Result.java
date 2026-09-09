package comm.oop.exceptions;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter the marks of English: ");
		int english = sc.nextInt();
		System.out.println("Enter the marks of Maths: ");
		int maths=sc.nextInt();
		System.out.println("Enter the marks of Science: ");
		int science = sc.nextInt();
		System.out.println("Enter the marks of telugu: ");
		int telugu = sc.nextInt();
		System.out.println("Enter the marks of Hindi: ");
		int hindi = sc.nextInt();
		int total = english+maths+science+telugu+hindi;
		double average = total/5.0;
		double percentage = (total/500.0)*100;
		System.out.println("Total Marks: "+total);
		System.out.println("Average: "+average);
		System.out.println("Percentage is: "+percentage+"%");
		}catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		
		
		// TODO Auto-generated method stub

	}

}
