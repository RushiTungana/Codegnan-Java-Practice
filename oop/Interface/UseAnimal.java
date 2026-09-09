package comm.oop.Interface;
interface AnimalBehavior{
	void eat();
	void sleep();
}
class Lion implements AnimalBehavior{
	public void eat() {
		System.out.println("Lion eat after hunting");
	}
	@Override
	public void sleep() {
		System.out.println("Lion Sleep like : Gurrr Gurrrr");
		// TODO Auto-generated method stub	
	}
	void hunt(){
		System.out.println("Lion hunts the Deer");
	}
}
class Deer implements AnimalBehavior{

	@Override
	public void eat() {
		System.out.println("Deer eat grass");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		System.out.println("Deer always flee from danger and sleep: kurrrr kurrr");
		// TODO Auto-generated method stub
		
	}
	void flee() {
		System.out.println("Deer runing ");
	}
	
}
public class UseAnimal {

	public static void main(String[] args) {
		AnimalBehavior animalBehavior = new Lion() ;
		animalBehavior = new Lion();
		displayAnimalBehavior(animalBehavior);
		animalBehavior = new Deer();
		displayAnimalBehavior(animalBehavior);
		
	}

	private static void displayAnimalBehavior(AnimalBehavior animalBehavior) {
		if(animalBehavior instanceof Lion) {
			Lion l= (Lion) animalBehavior;
			l.hunt();
			l.eat();
			l.sleep();
			
			
		}else if(animalBehavior instanceof Deer ) {
			Deer d=(Deer) animalBehavior;
			d.eat();
			d.sleep();
			d.flee();
		}
		
		
	}

}
