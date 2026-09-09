package comm.oop.isa;
import java.util.*;
class Laptop{
	String brand;
	int price;
	Laptop(String brand){
		this.brand=brand;
		this.price=1000;
	}
	Laptop(String name, int price){
		this.brand=name;
		this.price=price;
	}
	void display() {
		System.out.println("Brand: "+brand+", price: "+price);
	}
}
public class LaptopMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brand: ");
		String brand=sc.nextLine();
		if(sc.hasNextInt()) {
			int price=sc.nextInt();
			Laptop l=new Laptop(brand, price);
			l.display();
			
		}else {
			Laptop l=new Laptop(brand);
			l.display();
		}
		
	}
}