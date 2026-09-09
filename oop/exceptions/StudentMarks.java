package comm.oop.exceptions;
import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = {85,34,78,98,47};
        try {
        	System.out.println("Enter the number: ");
        	int n = sc.nextInt();
        	System.out.println("Marks: "+marks[n-1]);
        	
        }catch ( InputMismatchException e) {
        	System.out.println(" InputMismatchException");
        }catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
