package comm.oop.exceptions;
import java.util.*;

public class MultiCatch1 {

	public static void main(String[] args) {
		try {
			System.out.println(1/1);
			String str = "abcd";
			System.out.println(str.charAt(1));
			int[] a =new int[2];
			System.out.println(a[2]);
		} catch(ArithmeticException e) {
			System.out.println(e.getClass().getName()+": "+e.getMessage());
			for(Object o : e.getStackTrace()) {
				System.out.println(o);
			}
		}catch(NullPointerException e) {
			System.out.println(e.getClass().getName()+": "+e.getMessage());
			for(Object o : e.getStackTrace()) {
				System.out.println(o); 
		}

	}catch(Exception e) {
		System.out.println("Exception is handled");
		
	}
		System.out.println("========");  
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number: ");
			int n=sc.nextInt();
			System.out.println("Num: "+n);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Name: "+name);
		}catch (Exception e) {
			System.out.println(e.getClass().getName()+": "+e.getMessage());
		}finally {
			System.out.println("The exception is handled gracefully");
			sc.close();
		}

}
}
