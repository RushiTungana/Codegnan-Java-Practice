package comm.oop.equals;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "Shiva";
		String s2="Shiva";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s2=s2+"Mani";
		System.out.println(s2.hashCode());
		// TODO Auto-generated method stub

	}

}
