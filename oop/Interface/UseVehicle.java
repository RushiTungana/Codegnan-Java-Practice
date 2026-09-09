package comm.oop.Interface;

interface Vehicle{
	void start();
	void stop();
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("Car is start");
		// TODO Auto-generated method stub
	}
	@Override
	public void stop() {
		System.out.println("Car is Stop");
		// TODO Auto-generated method stub	
	}
	void taxi() {
		System.out.println("Car acts as taxi to drop 4 peoples at once.");
	}	
	void drive() {
		System.out.println("Car is start the duty");
	}
}
class BMW extends Car{
	void taxi() {
		System.out.println("BMW is personal taxi only for loved ones for free.");
	}
	void drive() {
		System.out.println("Going long drive");
	}
}
class Bike implements Vehicle{
	@Override
	public void start() {
		System.out.println("Bike is start: bruuuuuu");
		// TODO Auto-generated method stub	
	}
	@Override
	public void stop() {
		System.out.println("Bike is Stop: suuuuu");
		// TODO Auto-generated method stub	
	}
	void taxi() {
		System.out.println("Going outside with gf");
	}	
}
public class UseVehicle {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle=new Car();
		displayVehicle(vehicle);
		vehicle=new BMW();
		displayVehicle(vehicle);
		vehicle = new Bike();
		displayVehicle(vehicle);
	}
	private static void displayVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		if(vehicle instanceof Car) {
			Car car= (Car) vehicle;
			car.start();	
			car.taxi();
			car.drive();
			car.stop();
		}else if(vehicle instanceof BMW) {
			BMW bmw = (BMW) vehicle;
			bmw.start();
			bmw.taxi();
			bmw.drive();
			bmw.stop();
		}else if(vehicle instanceof Bike) {
			Bike bike = (Bike) vehicle;
			bike.start();
			bike.taxi();
			bike.stop();
		}
		
	}

}
