package comm.oop.abstra;

abstract class Vehicle{
	abstract void details();
	abstract void Start();
}
class Car extends Vehicle{

	@Override
	void details() {
		System.out.println();
		// TODO Auto-generated method stub
		
	}
	@Override
	void Start() {
		System.out.println("JUUUIIIIIIUIIIIIIII");	
	}	
}
class bike extends Vehicle{
	@Override
	void details() {
		System.out.println("Two wheels");
		// TODO Auto-generated method stub	
	}
	@Override
	void Start() {
		System.out.println("DHOOOOODHOOOODHOOOODHOOODODODODODO");
		// TODO Auto-generated method stub
	}
}

public class UseVehicle {
	public static void main(String[] args) {
		Car c=new Car();
		bike b=new bike();
		c.Start();
		b.Start();
		c.details();
		b.details();
			
		saveVehicle(c);
		saveVehicle(b);
		

	}
	private static void saveVehicle(Vehicle v) {
		v.Start();
		if(v instanceof bike) {
			System.out.println(v instanceof bike);
			bike b=(bike) v;
			b.details();
		}
		// TODO Auto-generated method stub
		
	}

}
