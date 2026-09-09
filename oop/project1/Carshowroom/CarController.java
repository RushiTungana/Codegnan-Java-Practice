package comm.oop.project1.Carshowroom;

public class CarController {
	static CarRepository carRepo;

	public static void main(String[] args) {
		CarEntity c1=new CarEntity();
		c1.setName("Bmw");
		c1.setModel("M300");
		c1.setMileage(15);
		
		CarEntity c2=new CarEntity();
		c2.setName("Benz");
		c2.setModel("300D");
		c2.setMileage(18);
		
		
		carRepo= new CarRepository();
		carRepo.save(c1);
		carRepo.save(c2);
		
		
		

	}

}
