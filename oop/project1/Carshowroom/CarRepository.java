package comm.oop.project1.Carshowroom;

public class CarRepository {

	public void save(CarEntity c1) {
		System.out.println("The Show Room Of Cars");
		System.out.println(c1.getModel());
		c1.carDetails();
		System.out.println("Completed");
		System.out.println("===========");
		
	}

}
