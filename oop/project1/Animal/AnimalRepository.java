package comm.oop.project1.Animal;

public class AnimalRepository {
	public void saveAnimal(LionEntity l1) {
		System.out.println("Animal Home");
		System.out.println("Name of lion: "+l1.getName());
		l1.animalDetails();
		System.out.println("Animal Saved");
		System.out.println("===========");
		
		
	}

}
