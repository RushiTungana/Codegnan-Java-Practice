package comm.oop.isa;
class Animal{
	String name;
	String habitat;
	
}
class Lion extends Animal{
	int kills;
}
class Tiger extends Animal{
	int legs;
}
public class AllAnimals {

	public static void main(String[] args) {
		
		Lion l1=new Lion();
		l1.name="Lion";
		l1.habitat="Forest";
		l1.kills=30;
		System.out.println("Name: "+ l1.name);
		System.out.println("Habitat: "+l1.habitat);
		System.out.println("Kills: "+l1.kills);
		System.out.println("=========");
		Tiger t1=new Tiger();
		t1.name="Tiger";
		t1.habitat="jungle";
		t1.legs=4;
		System.out.println("Name: "+ t1.name);
		System.out.println("Habitat: "+t1.habitat);
		System.out.println("Legs: "+t1.legs);
		
		
		

	}

}
