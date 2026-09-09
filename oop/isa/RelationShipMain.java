package comm.oop.isa;
class Father{
	public void Marriage() {
		System.out.println("Marriage with jada");
	}
}
class Son extends Father{
	@Override
	public void Marriage() {
		System.out.println("Marriage with woman");
	}
}
public class RelationShipMain {

	public static void main(String[] args) {
		Son s=new Son();
		s.Marriage();

	}

}
