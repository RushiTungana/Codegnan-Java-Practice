package comm.oop.isa;
import java.util.*;
public class MaxMain {
	public static int max(int a, int b) {
		return a>b? a:b;
	}
	public static Double max(double a, double b) {
		return a>b? a:b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b=sc.nextInt();
			System.out.println(max(a,b));
		}else if (sc.hasNextDouble()){
			double a=sc.nextDouble();
			double b=sc.nextDouble();
			System.out.println(max(a,b));
			
		}

	}

}
