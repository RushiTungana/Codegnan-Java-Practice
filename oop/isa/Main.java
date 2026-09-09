package comm.oop.isa;
//class Animal3{
//	public void animalSound(){
//		System.out.println("Animal Sound Types");
//	}
//}
//	class Dog extends Animal3{
//		public void animalSound(){
//			System.out.println("Dog"+" "+"Boow");
//		}
//	}
//	class Pig extends Animal3{
//		public void animalSound() {
//			System.out.println("Pig"+" "+"Gurr");
//		}
//	}
//
//public class Main {
//
//	public static void main(String[] args) {
//		Animal3 a=new Animal3();
//		Dog d=new Dog();
//		Pig p=new Pig();
//		a.animalSound();
//		d.animalSound();
//		p.animalSound();
//
//	}
//
//}

import java.util.Scanner;

//class Animal3 {
//    public void animalSound() {
//        System.out.println("Animal Sound Types");
//    }
//}
//
//class Dog extends Animal3 {
//    public void animalSound() {
//        System.out.println("Boow");
//    }
//}
//
//class Pig extends Animal3 {
//    public void animalSound() {
//        System.out.println("Gurr");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter animal: ");
//        String animal = sc.nextLine();
//
//        if (animal.equals("Dog")) {
//            Dog d = new Dog();
//            d.animalSound();
//        } 
//        else if (animal.equals("Pig")) {
//            Pig p = new Pig();
//            p.animalSound();
//        } 
//        else {
//            Animal3 a = new Animal3();
//            a.animalSound();
//        }
//    }
//}
class Animal3{
	public void animalSound() {
		System.out.println("NO Sound"+" "+"Animal Sounds");
	}
}
class Dog extends Animal3{
	public void animalSound() {
		System.out.println("Dog"+" "+"Boow......Boow....");
	}
}
class Buffalo1 extends Animal3{
	public void animalSound() {
		System.out.println("Buffalo1"+" "+"jadaa...jadaa...");
	}
}
class Venket extends Animal3{
	public void animalSound() {
		System.out.println("Venket"+" "+"EriHUKAAAAAAA");
	}
}
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		String animal=sc.nextLine();
		if(animal.equals("Dog")) {
			Dog d=new Dog();
			d.animalSound();
		}else if(animal.equals("Buffalo")) {
			Buffalo1 b=new Buffalo1();
			b.animalSound();
		}else if(animal.equals("Venket")) {
			Venket v=new Venket();
			v.animalSound();
		}else {
			Animal3 a=new Animal3();
			a.animalSound();
			
		}
	}
}