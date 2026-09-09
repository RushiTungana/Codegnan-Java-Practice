package comm.oop.project1.Carshowroom;

public class CarEntity {
	private String name;
	private String model;
	private int mileage;
	private static int wheel=4;
	
	public CarEntity() {
		
	}

	public CarEntity(String name, String model, int mileage) {
		super();
		this.name = name;
		this.model = model;
		this.mileage = mileage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public static int getWheel() {
		return wheel;
	}

	public static void setWheel(int wheel) {
		CarEntity.wheel = wheel;
	}
	public void carDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Model: "+this.model);
		System.out.println("Mileage: "+this.mileage);
		System.out.println("Wheels: "+this.wheel);
	}
	
}
