package comm.oop.isa;
import java.util.*;
public class MainMax1{
	public static int sum(int a, int b) {
		return a+b;
	}
	public static double sum(double x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			
			int b=sc.nextInt();
			System.out.println(sum(a,b));
		}else if(sc.hasNextDouble()) {
			
			double x=sc.nextDouble();
			
			double y=sc.nextDouble();
			System.out.println(sum(x,y));
		}
	}
}