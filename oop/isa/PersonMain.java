package comm.oop.isa;
class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
public class PersonMain {

	public static void main(String[] args) {
		Person p=new Person(101, "Ravi");
		System.out.println(p);

	}

}
