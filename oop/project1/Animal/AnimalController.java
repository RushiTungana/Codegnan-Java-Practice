package comm.oop.project1.Animal;

public class AnimalController {
	
	static AnimalRepository animalRepo;

	public static void main(String[] args) {
		LionEntity l1=new LionEntity();//collect and transfor
		l1.setName("Shiva");
		l1.setGender("Male");
		l1.setKills(19);
		
		LionEntity l2=new LionEntity();
		l2.setName("hemanth");
		l2.setGender("Male");
		l2.setKills(10);
		
		LionEntity l3=new LionEntity();
		l3.setName("Sai");
		l3.setGender("Male");
		l3.setKills(65);
	
		
		
		animalRepo = new AnimalRepository();
		animalRepo.saveAnimal(l1);
		animalRepo.saveAnimal(l2);
		animalRepo.saveAnimal(l3);
		
		
		
		

	}

}
