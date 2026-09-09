package comm.oop.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		try {
		System.out.println(1/0);
		String str = null;
		System.out.println(str.charAt(1));
		int[] a = new int[2];
		System.out.println(a[2]);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			for(Object o: e.getStackTrace()) {
				System.out.println(o);
			}
			
		}
		
		

	}

}
