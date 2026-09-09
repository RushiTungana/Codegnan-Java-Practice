package comm.oop.Interface;
interface Fly{
	void fly();
	
}
interface Swim{
	void swim();
}
interface Run{
	void run();
}
class Eagle implements Fly{

	@Override
	public void fly() {
		System.out.println("Eagel flies above the sky");
		
	}
	
}
class Duck implements Fly, Swim, Run{

	@Override
	public void run() {
		System.out.println("Duck is runing");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		System.out.println("Duck is swim");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Duck is fly");
		// TODO Auto-generated method stub
		
	}	
}
class Hen implements Fly,Run{

	@Override
	public void run() {
		System.out.println("Hun is Runing");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Hun is run");
		// TODO Auto-generated method stub	
	}
	
}
class Jada implements Fly, Run, Swim{

	@Override
	public void swim() {
		System.out.println("jada is Swiming fast");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		System.out.println("Jada is running ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("Jada is flying");
		// TODO Auto-generated method stub
		
	}
	
}

public class UseBirds {

	public static void main(String[] args) {
		chooseYourBird("Hen");
		System.out.println("========");
		chooseYourBird("Duck");
		System.out.println("========");
		chooseYourBird("Eagle");
		System.out.println("========");
		chooseYourBird("Jada");
		System.out.println("========");

	}

	private static void chooseYourBird(String birdName) {
		if(birdName.equalsIgnoreCase("Hen")) {
			Hen h=new Hen();
			h.run();
			h.fly();
		}else if(birdName.equalsIgnoreCase("Duck")) {
			Duck d=new Duck();
			d.fly();
			d.swim();
			d.run();
		}else if(birdName.equalsIgnoreCase("Eagle")) {
			Eagle e = new Eagle();
			e.fly();
		}else if(birdName.equalsIgnoreCase("Jada")) {
			Jada j = new Jada();
			j.run();
			j.swim();
			j.fly();
		}else {
			System.out.println("Invalid name");
		}
		
		
	}

}
