
package comm.oop.isa;
class Animal1{
	String name;
	String habitat;
	public Animal1(String name, String habitat) {
		this.name=name;
		this.habitat=habitat;
	}
	public void MakeSound(){
		System.out.println(this.getClass().getName());
		System.out.print("Name: "+ this.name+" - habitat - "+this.habitat+" Legs: ");
	}
}
class Buffalo extends Animal1{
	int legs;
	public Buffalo(String name, String habitat, int legs) {
		super(name, habitat);
		this.legs=legs;
	}
	@Override
	public void MakeSound() {
		super.MakeSound();
		System.out.println(this.legs);
		System.out.println("Buffalo Makes jadaaaa.....jadaaa.....");
	}
}
public class JungleMain {
	public static void main(String[] args) {
		Buffalo b=new Buffalo("Jada","Village",4);
		b.MakeSound();
	}

}
