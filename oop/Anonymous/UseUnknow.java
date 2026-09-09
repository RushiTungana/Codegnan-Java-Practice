package com.oop.Anonymous;

interface Animal{
	void eat();
}

public class UseUnknow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous object for interface
		Animal a = new Animal() {
			public void eat() {
				System.out.println("Animal eat to survive");
				
			}
		};
		Animal s2 =()-> System.out.println("Animal eats diff food compared to human");
		s2.eat();
		//Lamda Expression
		//We can apply lamda expression only for functional interface(only 1 abstract method)
		

	}

}
