package comm.oop.exceptions;
class Animal{
	
}
class Lion extends Animal{
	
}
class Tiger extends Animal{
	
}
public class OutofBounds {
	public static void main(String[] args) {
		int[] a = new int[2];
		System.out.println(a[1]);
		String str="ABCD";
		System.out.println(str.charAt(1));
		Animal animal = new Lion();
		if(animal instanceof Tiger) {
			Tiger t =(Tiger) animal;
		}else if (animal instanceof Lion) {
			Lion l = (Lion) animal;
			
		}
	}

}
