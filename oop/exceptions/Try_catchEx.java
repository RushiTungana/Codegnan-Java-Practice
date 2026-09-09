package comm.oop.exceptions;

import java.util.*;

public class Try_catchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("======Execution starts here=======");
		System.out.println("Enter the number of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the number of b: ");
		int b =sc.nextInt();
		try {
			double result=a/b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
//		System.out.println("Operation ends here");
		
//		String s = null;
//		if(s!=null) {
//			System.out.println(s.charAt(1));
//		}else {
//			System.out.println("s is having null value");
//		}
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		if(value==3) {
//			throw new ArithmeticException();
//		}
//		sc.close();
//		
//		System.out.println("======End======"); 

	}

}
